package org.example.domainmodel.generator

import org.example.domainmodel.domainmodel.Model
import org.example.domainmodel.domainmodel.Variable
import org.example.domainmodel.domainmodel.DataType
import org.example.domainmodel.domainmodel.Clock
import org.example.domainmodel.domainmodel.Value

class TextGenerator {
	def static generateBMachine(Model model)'''
 		IMPLEMENTATION«"\n"»
 		logic_i«"\n"»
 		«"\n"»
 		REFINES«"\n"»
 		logic«"\n"»
 		«"\n"»
 		SEES«"\n"»
 		g_types,«"\n"»
 		g_operators,«"\n"»
 		io_constants,«"\n"»
 		lchip_interface,«"\n"»
 		user_ctx,«"\n"»
 		inputs«"\n"»
 		«"\n"» 		
 		CONCRETE_VARIABLES«"\n"»
 		board_0_O1,«"\n"»
 		board_0_O2,«"\n"»
 		first_time,«"\n"»
 		SM_«model.name»_state«", \n"»
 		cycle_timer,«"\n"»
 		cycle_state,«"\n"»
 		
 		«FOR c : model.clock SEPARATOR ", "»
 			clock_«c.name»_«"\n"»
 		«ENDFOR»
 		«"\n"»
 		«FOR p : model.variables SEPARATOR ", "»
 		     var_«p.name»_«"\n"»
 		«ENDFOR»
 		«"\n"»
 		INVARIANT «"\n"»
 		board_0_O1 : uint8_t«" & \n"»
 		board_0_O2 : uint8_t«" & \n"»
 		first_time: BOOL«" & \n"»
 		SM_«model.name»_state: uint32_t«" & \n"»
 		cycle_timer: uint32_t«" & \n"»
 		cycle_state: uint32_t«" & \n"»
 		
 		«FOR c : model.clock SEPARATOR " & "»
 		 		clock_«c.name»_«" : uint32_t "»
 		«ENDFOR»
 		«"\n"»
 		«FOR p : model.variables SEPARATOR " & "»
 		    var_«p.name»_«" : "»«mapType(p.type.toString)»«"\n"»
 		«ENDFOR»
 		«"\n"» 
 		INITIALISATION«"\n"»
 		«"\n"»
 		board_0_O1 := IO_OFF;«"\n"»
 		board_0_O2 := IO_OFF;«"\n"»
 		first_time := TRUE;«"\n"»
 		SM_«model.name»_state := 1;«"\n"»
 		cycle_timer := 0;«"\n"»
 		cycle_state := 1;«"\n"»
 		«FOR c : model.clock SEPARATOR " & "»
 			clock_«c.name»_«" := 0"»
 		«ENDFOR»
 		«"\n"»
 		«FOR v : model.variables SEPARATOR "; "»
 		    var_«v.name»_«":="»«initValue(v)» «"\n"»
 		«ENDFOR»
 		«"\n"»
 		LOCAL_OPERATIONS«"\n"»
 		execute_model_cycle =«"\n"»
 		PRE cycle_state = 4«"\n"»
 		THEN«"\n"»
 		SM_«model.name»_state:: uint32_t ||«"\n"»
 		first_time:: BOOL ||«"\n"»
 		cycle_timer::uint32_t ||«"\n"»
 		cycle_state ::uint32_t ||«"\n"»
 		«FOR p : model.variables SEPARATOR " || "»
 		     var_«p.name»_«" :: "»«mapType(p.type.toString)»«"\n"»
 		«ENDFOR» 
 		«"\n"»
 		END; 		
 		«"\n"»
 		elapsed <-- since(timer) =«"\n"»
 		PRE timer:uint32_t & elapsed:uint32_t«"\n"»
 		THEN«"\n"»
 		   elapsed::uint32_t«"\n"»
 		END;«"\n"»
 		«"\n"»
 		result <-- land(pp,qq) =«"\n"»
 		PRE pp:BOOL & qq:BOOL & result:BOOL«"\n"»
 		THEN«"\n"»
 		   result::BOOL«"\n"»
 		END;«"\n"»
 		«"\n"»
 		result <-- lor(pp,qq) =«"\n"» 
 		PRE pp:BOOL & qq:BOOL & result:BOOL«"\n"»
 		THEN«"\n"»
 		    result::BOOL«"\n"»
 		END;«"\n"»
 		«"\n"»
 		result <-- lnot(pp) =«"\n"» 
 		PRE pp:BOOL & result:BOOL«"\n"»
 		THEN«"\n"»
 		    result::BOOL«"\n"»
 		END;«"\n"»
 		«"\n"»
 		reset_outputs =«"\n"»
 		BEGIN«"\n"»
 		    board_0_O1 :: uint8_t ||«"\n"»
 		    board_0_O2 :: uint8_t«"\n"»
 		END;«"\n"»
 		«"\n"»
 		read_model_inputs =«"\n"»
 		PRE cycle_state = 1«"\n"»
 		THEN«"\n"»
 		    cycle_state  :: uint8_t«"\n"»
 		END;«"\n"»
 		«"\n"»
 		write_model_outputs =«"\n"»
 		PRE cycle_state = 3«"\n"»
 		THEN«"\n"»
 		    board_0_O1      :: uint8_t ||«"\n"»
 		    board_0_O2      :: uint8_t ||«"\n"»
 		    cycle_state     :: uint8_t«"\n"»
 		END;«"\n"»
 		«"\n"»
 		tock =«"\n"»
 		BEGIN«"\n"»
 		   skip«"\n"»
 		END«"\n"»
 		«"\n"»
 		OPERATIONS«"\n"»
 		user_logic =«"\n"» 
 		BEGIN«"\n"»
 		    IF first_time = TRUE THEN«"\n"» 
 		       cycle_timer <-- get_ms_tick;«"\n"» 
 		       execute_model_cycle;«"\n"»
 		       cycle_state:= 1;«"\n"»
 		       first_time := FALSE«"\n"»
 		«"\n"»
 		    ELSE«"\n"»
 		        VAR time_elapsed, cycle_duration IN«"\n"» 
 		«"\n"»
 		            time_elapsed:(time_elapsed:uint32_t);«"\n"»
 		            cycle_duration:(cycle_duration:uint32_t);«"\n"»
 		«"\n"»
 		            time_elapsed <-- since(cycle_timer);«"\n"»
 		            cycle_duration := mul_uint32(SimSMovement_cycleDef,cycle_unit);«"\n"»
 		«"\n"»
 		            IF (cycle_duration <= time_elapsed) THEN«"\n"»
 		«"\n"»
 		                cycle_timer <-- get_ms_tick;«"\n"»
 		                execute_model_cycle;«"\n"»
 		                cycle_state:= 1;«"\n"»
 		                tock«"\n"»
 		            END«"\n"»
 		        END«"\n"»
 		    END«"\n"»
 		END;«"\n"»
 		«"\n"»
 		reset_outputs =«"\n"» 
 		BEGIN«"\n"»
 		    board_0_O1 := IO_OFF;«"\n"»
 		    board_0_O2 := IO_OFF«"\n"»
 		END;«"\n"»
 		«"\n"»
 		read_model_inputs =«"\n"»
 		BEGIN«"\n"»
 		    
 		    cycle_state := 3«"\n"»
 		END;«"\n"»
 		«"\n"»
 		write_model_outputs =«"\n"»
 		BEGIN«"\n"»
 		   
 		    cycle_state:= 4«"\n"»
 		END;«"\n"»
 		«"\n"»
 		execute_model_cycle =«"\n"» 
 		BEGIN«"\n"»
 		    reset_outputs;«"\n"»
 		    read_model_inputs;«"\n"»
 		    //State machine«"\n"»
 		    write_model_outputs«"\n"» 
 		END;«"\n"»
 		«"\n"»
 		elapsed <-- since(timer) =«"\n"»
 		BEGIN «"\n"» 
 		     elapsed:(elapsed:uint32_t);«"\n"»
 		     VAR local_time IN «"\n"» 
 		         local_time:(local_time:uint32_t);«"\n"»
 		         «"\n"»
 		         local_time <-- get_ms_tick;«"\n"»
 		        elapsed := sub_uint32(local_time, timer)«"\n"»
 		     END«"\n"»
 		END;«"\n"»
 		«"\n"»	
 		result <-- land(pp,qq) =«"\n"»	 
 		BEGIN«"\n"»	
 		    result := FALSE;«"\n"»	
 		    IF (pp = TRUE) THEN«"\n"»	 
 		        IF (qq = TRUE) THEN«"\n"»	
 		            result := TRUE«"\n"»	
 		        END«"\n"»	
 		    END«"\n"»	
 		END;«"\n"»	
 		«"\n"»
 		result <-- lor(pp,qq) =«"\n"»	 
 		BEGIN«"\n"»	
 		    result := TRUE;«"\n"»	
 		    IF (pp = FALSE) THEN «"\n"»	
 		        IF (qq = FALSE) THEN«"\n"»	
 		            result := FALSE«"\n"»	
 		        END«"\n"»	
 		    END«"\n"»	
 		END;«"\n"»	
 		«"\n"»	    
 		result <-- lnot(pp) =«"\n"»	 
 		BEGIN«"\n"»	
 		    result := FALSE;«"\n"»	
 		    IF (pp = FALSE) THEN«"\n"»	 
 		        result := TRUE«"\n"»	
 		    END«"\n"»	
 		END;«"\n"»
 		«"\n"»
 		tock =«"\n"» 
 		BEGIN«"\n"»
 		    skip«"\n"»
 		END;«"\n"»
 		«"\n"»	
 		po <-- get_board_0_O1 =«"\n"»
 		BEGIN«"\n"»
 		   po := board_0_O1«"\n"»
 		END;«"\n"»
 		«"\n"»
 		po <-- get_board_0_O2 =«"\n"»
 		BEGIN«"\n"»
 			po := board_0_O2«"\n"»
 		END«"\n"»
 		
 		END
 	    '''
 		
 		def static mapType(String robosimType) {
        	switch robosimType {
            	case "NAT"   : "uint32_t"
            	case "INT"   : "uint32_t"
            	case "REAL"  : "uint32_t"
            	case "BOOL"  : "BOOL"
        	}    
        }
        
        def static initValue(Variable v) {
    		switch v.type {
        		case DataType::NAT,
        		case DataType::INT,
        		case DataType::REAL:
        			" 0"
        		case DataType::BOOL:
            	    " FALSE"
    		}
		}
		
		// -----------------------------------------
    	// FORMAT VALUES
    	// -----------------------------------------
    	//def formatValue(Value v) {
        //	if (v === null) "/* no value */"
        //	else switch v.value {
        //    'true': v.value.toString.toUpperCase   // true → TRUE
        //    default: v.value.toString               // numeros e strings
        //	}
    	//}  
         		
}