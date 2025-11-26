package org.example.domainmodel.generator

import org.example.domainmodel.domainmodel.DataType
import org.example.domainmodel.domainmodel.Model
import org.example.domainmodel.domainmodel.Variable
import org.example.domainmodel.domainmodel.Interface
import org.example.domainmodel.domainmodel.EventDecl
import org.example.domainmodel.domainmodel.OperationDecl
import org.example.domainmodel.domainmodel.Param
import org.example.domainmodel.domainmodel.ContextDecl

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
 		«FOR c : model.clock.indexed SEPARATOR " , " AFTER ", "»clock_«c.value.name»_«c.key + 1»«ENDFOR»
 		«FOR i : model.contexts»
 		   «FOR iface : i.usedInterfaces»
 		      «FOR ev : iface.events.indexed SEPARATOR ", " AFTER ", "»i_«ev.value.name»_«ev.key + 1»«ENDFOR»
 		   «ENDFOR»
 		«ENDFOR» 		
 		«FOR i : model.interface»
 			«FOR iface : i.operations SEPARATOR ", " AFTER ", "»o_«iface.name»_linear«ENDFOR»	
 		«ENDFOR»
 		«FOR i : model.interface»
 		 			«FOR iface : i.operations SEPARATOR ", "»o_«iface.name»_angular«ENDFOR»	
 		«ENDFOR»
 		«FOR p : model.variables SEPARATOR " , "»
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
 		«FOR c : model.clock.indexed SEPARATOR " & " AFTER " & "»clock_«c.value.name»_«c.key + 1»«" : uint32_t "»«ENDFOR»
 		«FOR i : model.contexts»
 		    «FOR iface : i.usedInterfaces»
 		       «FOR ev : iface.events.indexed SEPARATOR " & " AFTER " & "»i_«ev.value.name»_«ev.key + 1»«" : uint8_t "»«ENDFOR»
 		    «ENDFOR»
 		«ENDFOR»
 		«FOR i : model.interface»
 				«FOR iface : i.operations SEPARATOR " & " AFTER " & "»o_«iface.name»_linear«" : uint8_t "»«ENDFOR»	
 		«ENDFOR»
 		«FOR i : model.interface»
 				«FOR iface : i.operations SEPARATOR " & "»o_«iface.name»_angular«" : uint8_t "»«ENDFOR»	
 		«ENDFOR»
 		«FOR p : model.variables SEPARATOR " & "»
 		 	var_«p.name»_«" : "»«mapType(p.type.toString)»«ENDFOR»
 		«"\n"»
 		INITIALISATION«"\n"»
 		«"\n"»
 		board_0_O1 := IO_OFF;«"\n"»
 		board_0_O2 := IO_OFF;«"\n"»
 		first_time := TRUE;«"\n"»
 		SM_«model.name»_state := 1;«"\n"»
 		cycle_timer := 0;«"\n"»
 		cycle_state := 1;«"\n"»
 		«FOR c : model.clock.indexed SEPARATOR "; " AFTER "; "»clock_«c.value.name»_«c.key + 1»«" := 0"»«ENDFOR»
 		«FOR m : model.contexts»
 		    «FOR iface : m.usedInterfaces»
 		       «FOR ev : iface.events.indexed SEPARATOR "; " AFTER "; "»i_«ev.value.name»_«ev.key + 1»«":= IO_OFF"»«ENDFOR»
 		    «ENDFOR»
 		«ENDFOR»
 		«FOR i : model.interface»
 			«FOR iface : i.operations SEPARATOR "; " AFTER "; "»o_«iface.name»_linear«":= IO_OFF"»«ENDFOR»	
 		«ENDFOR»
 		«FOR i : model.interface»
 			«FOR iface : i.operations SEPARATOR "; "»o_«iface.name»_angular«":= IO_OFF"»«ENDFOR»	
 		«ENDFOR» 		
 		«FOR v : model.variables SEPARATOR "; "»
 			var_«v.name»_«":="»«initValue(v)»
 		«ENDFOR»
 		«"\n"»
 		LOCAL_OPERATIONS
 		«"\n"»
 		execute_model_cycle =«"\n"»
 		PRE cycle_state = 4«"\n"»
 		THEN«"\n"»
 		SM_«model.name»_state:: uint32_t ||«"\n"»
 		«FOR p : model.variables SEPARATOR " || " AFTER " || "»
 		     var_«p.name»_«" :: "»«mapType(p.type.toString)»«"\n"»
 		«ENDFOR»
 		first_time:: BOOL ||«"\n"»
 		cycle_timer::uint32_t ||«"\n"»
 		cycle_state ::uint32_t ||«"\n"»
 		«FOR n : model.contexts»
 		   «FOR iface : n.usedInterfaces SEPARATOR "\n "»
 		      «FOR ev : iface.events.indexed SEPARATOR "|| " AFTER "|| "»i_«ev.value.name»_«ev.key + 1»«" :: uint8_t"»«ENDFOR»
 		   «ENDFOR»
 		«ENDFOR»
 		«FOR i : model.interface»
 			«FOR iface : i.operations SEPARATOR "|| " AFTER "|| "»o_«iface.name»_linear«" :: uint8_t"»«ENDFOR»
 		«ENDFOR»
 		«FOR i : model.interface»
 			«FOR iface : i.operations SEPARATOR "|| "»o_«iface.name»_angular«" :: uint8_t"»«ENDFOR»
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
 		    board_0_O2 :: uint8_t ||«"\n"»
 		    «FOR i : model.interface»
 		     	«FOR iface : i.operations SEPARATOR "|| " AFTER "|| "»o_«iface.name»_linear«" :: uint8_t"»«ENDFOR»
 		    «ENDFOR»
 		    «FOR i : model.interface»
 		    	«FOR iface : i.operations SEPARATOR "|| "»o_«iface.name»_angular«" :: uint8_t"»«ENDFOR»
 		    «ENDFOR»
 		END;«"\n"»
 		«"\n"»
 		read_model_inputs =«"\n"»
 		PRE cycle_state = 1«"\n"»
 		THEN«"\n"»
 		    cycle_state  :: uint8_t ||«"\n"»
 		    «FOR b : model.contexts»
 		       «FOR iface : b.usedInterfaces»
 		          «FOR ev : iface.events.indexed SEPARATOR "|| "»i_«ev.value.name»_«ev.key + 1»«" :: uint8_t "»«ENDFOR»
 		       «ENDFOR»
 		    «ENDFOR»
 		END;
 		«"\n"»
 		«FOR v : model.contexts SEPARATOR "\n"»
 		   «FOR iface : v.usedInterfaces SEPARATOR "\n"»
 		     «FOR ev : iface.events.indexed SEPARATOR "\n "»
 		     read_i_«ev.value.name» =«"\n"»
 		     PRE cycle_state = 1«"\n"»
 		     THEN«"\n"»
 		     i_«ev.value.name»_«ev.key + 1»«" :: uint8_t "»«"\n"»
 		     END;«"\n"»
 		     «ENDFOR» 		 
 		   «ENDFOR»
 		«ENDFOR»
 		«"\n"»
 		write_model_outputs =«"\n"»
 		PRE cycle_state = 3«"\n"»
 		THEN«"\n"»
 		    board_0_O1      :: uint8_t ||«"\n"»
 		    board_0_O2      :: uint8_t ||«"\n"»
 		    cycle_state     :: uint8_t«"\n"»
 		END;
 		«"\n"»
 		write_o_move =«"\n"»
 		PRE cycle_state = 3«"\n"»
 		THEN«"\n"»     
 		    board_0_O1      :: uint8_t ||«"\n"»
 		    board_0_O2      :: uint8_t ||«"\n"»
 		    cycle_state     :: uint8_t
 		END;
 		«"\n"»
 		write_o_move_linear =«"\n"»
 		PRE cycle_state = 3«"\n"»
 		THEN«"\n"»        
 		   board_0_O1    :: uint8_t«"\n"»           
 		END;
 		«"\n"»
 		write_o_move_angular =«"\n"»
 		PRE cycle_state = 3«"\n"»
 		THEN«"\n"»
 		   board_0_O2    :: uint8_t«"\n"»
 		END;
 		«"\n"»
 		«FOR i : model.interface»
 			«FOR iface: i.operations»
 				«iface.name»(l_lv,l_av) = «"\n"»
 				PRE l_lv:BOOL & l_av:BOOL«"\n"»
 				THEN
 		    	«FOR o : model.interface»
		    	«FOR inter : o.operations SEPARATOR "|| " AFTER "|| "»o_«inter.name»_linear«" :: uint8_t"»«ENDFOR»
 		    	«ENDFOR»
 		    	«FOR p : model.interface»
 		       	«FOR inter : p.operations SEPARATOR "|| "»o_«inter.name»_angular«" :: uint8_t"»«ENDFOR»
 		    	«ENDFOR»
 				END;
 			«ENDFOR»
 		«ENDFOR»
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
 		board_0_O2 := IO_OFF;«"\n"»
 		    «FOR i : model.interface»
 				«FOR iface : i.operations SEPARATOR "; " AFTER "; "»o_«iface.name»_linear«":= IO_OFF"»«ENDFOR»	
 		 	«ENDFOR»
 		 	«FOR i : model.interface»
 				«FOR iface : i.operations SEPARATOR "; "»o_«iface.name»_angular«":= IO_OFF"»«ENDFOR»	
 		 	«ENDFOR»
 		END;«"\n"»
 		«"\n"»
 		read_model_inputs =«"\n"»
 		BEGIN«"\n"»
 		    cycle_state := 3;
 		    «FOR i : model.contexts»
 		    	«FOR iface : i.usedInterfaces»
 		    	   «FOR ev : iface.events.indexed SEPARATOR"; "»
 		    	    read_i_«ev.value.name»
 		    	    «ENDFOR»
 		    	«ENDFOR»
 		    «ENDFOR»
 		END;«"\n"»
 		«"\n"»
 		«FOR i : model.contexts SEPARATOR "\n"»
 			«FOR iface : i.usedInterfaces SEPARATOR "\n"» 
 				«FOR ev : iface.events.indexed SEPARATOR"\n"»
 				read_i_«ev.value.name» =«"\n"»
 				BEGIN«"\n"»
 				i_«ev.value.name»_«ev.key + 1»«" <-- get_board_0_I"»«ev.key + 1»
 				END;«"\n"»
 			  	«ENDFOR»
 		  	«ENDFOR»
 		«ENDFOR»
 		«"\n"»
 		write_model_outputs =«"\n"»
 		BEGIN«"\n"»
 		   cycle_state:= 4;«"\n"»
 		   «FOR i: model.interface»
 		   	«FOR iface: i.operations SEPARATOR "; "»write_o_«iface.name»«ENDFOR»
 		   «ENDFOR»
 		END;
 		«"\n"»
 		«FOR i: model.interface»
 			«FOR iface: i.operations»
 			write_o_«iface.name» =«"\n"»
 			BEGIN«"\n"»
 				«FOR o : model.interface»
 				 	«FOR inter : o.operations SEPARATOR "; " AFTER "; "»write_o_«inter.name»_linear«ENDFOR»
 				«ENDFOR»
 				«FOR p : model.interface»
 				 	«FOR inter : p.operations SEPARATOR ", "»write_o_«inter.name»_angular«ENDFOR»	
 				«ENDFOR»
 			END;
 			«ENDFOR»
 		«ENDFOR»
 		
 		«FOR i: model.interface»
 			«FOR iface: i.operations»
 			write_o_«iface.name»_linear =«"\n"»
 			BEGIN«"\n"»
 			board_0_O1 := o_«iface.name»_linear
 			END;
 			«ENDFOR»
 		«ENDFOR»
 		
 		«FOR i: model.interface»
 			«FOR iface: i.operations»
 			write_o_«iface.name»_angular =«"\n"»
 			BEGIN«"\n"»
 			board_0_O2 := o_«iface.name»_angular
 			END;
 			«ENDFOR»
 		«ENDFOR»
 		
 		«FOR i: model.interface»
 			«FOR iface: i.operations»
 			 «iface.name»(l_lv,l_av) =«"\n"» 
 			 BEGIN«"\n"»
 			 IF l_lv = TRUE«"\n"» 
 			 THEN«"\n"»
 			 o_«iface.name»_linear := IO_ON«"\n"»  
 			 ELSE    
 			 o_«iface.name»_linear := IO_OFF«"\n"»
 			 END;«"\n"»
 		     «"\n"»
 			 IF l_av = TRUE«"\n"»
 			 THEN«"\n"»
 			 o_«iface.name»_angular := IO_ON«"\n"»
 			 ELSE«"\n"»
 			 o_«iface.name»_angular := IO_OFF«"\n"»
 			 END«"\n"»
 			 END;
 		    «ENDFOR»
 		«ENDFOR»
 		
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
		    	
}