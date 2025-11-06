package org.example.domainmodel.generator

import org.example.domainmodel.domainmodel.Model
import org.example.domainmodel.domainmodel.Variable
import org.example.domainmodel.domainmodel.DataType

class TextGenerator {
	def static generateBMachine(Model model)'''
 		IMPLEMENTATION«"\n"»
 		logic_i«"\n"»
 		«"\n"»
 		REFINES«"\n"»
 		logic«"\n"»
 		«"\n"»
 		CONCRETE_VARIABLES«"\n"»
 		board_0_O1«", \n"»
 		board_0_O1«", \n"»
 		first_time«", \n"»
 		cycle_timer«", \n"»
 		«FOR p : model.variables SEPARATOR ", "»
 		     «p.name»«"\n"»
 		«ENDFOR»
 		«"\n"»
 		INVARIANT «"\n"»
 		board_0_O1 : uint8_t«" & \n"»
 		board_0_O1 : uint8_t«" & \n"»
 		first_time: BOOL«" & \n"»
 		cycle_timer: uint32_t«" & \n"»
 		«FOR p : model.variables SEPARATOR " & "»
 		    «p.name»«" : "»«mapType(p.type.toString)»«"\n"»
 		«ENDFOR»
 		«"\n"» 
 		INITIALISATION
 		first_time:= TRUE«"; \n"»
 		cycle_timer := 0«"; \n"»
 		«FOR v : model.variables SEPARATOR "; "»
 		    «v.name»«":="»«initValue(v)» «"\n"»
 		«ENDFOR»
 		«"\n"»
 		LOCAL_OPERATIONS«"\n"»
 		«"\n"»
 		elapsed <-- since(timer) =«"\n"»
 		PRE timer:uint32_t & elapsed:uint32_t«"\n"»
 		THEN«"\n"»
 		   elapsed::uint32_t«"\n"»
 		END«"\n"»
 		«"\n"»
 		OPERATIONS«"\n"»
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
 		END«"\n"»
 		«"\n"»
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