package org.example.domainmodel.generator

import org.example.domainmodel.domainmodel.Model
import org.example.domainmodel.domainmodel.Constant

class UserCtxGenerator {
	def static generateUserCtx(Model model)'''
		MACHINE«"\n"»
		    user_ctx«"\n"»
		SEES«"\n"»
		    g_types«"\n"»
		«"\n"»    
		CONCRETE_CONSTANTS«"\n"»
		«"\n"»
		cycle_unit,«"\n"»
		«model.name»_cycleDef,«"\n"»
		«FOR c : model.constants SEPARATOR ", "»
		«c.name»«"\n"»
		«ENDFOR»
		«"\n"»
		PROPERTIES«"\n"»
		«"\n"»
		cycle_unit:uint32_t &«"\n"»
		«model.name»_cycleDef : uint32_t &«"\n"»
		«FOR c : model.constants SEPARATOR " & "»
		 	«c.name»«" : "»«mapType(c.type.toString)»«"\n"»
		«ENDFOR»
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
}