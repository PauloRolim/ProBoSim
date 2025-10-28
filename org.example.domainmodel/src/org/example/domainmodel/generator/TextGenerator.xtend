package org.example.domainmodel.generator

import org.example.domainmodel.domainmodel.Domainmodel

class TextGenerator {
	def static toText(Domainmodel root)'''
 		IMPLEMENTATION«"\n"»
 		logic_i«"\n"»
 		«"\n"»
 		REFINES«"\n"»
 		logic«"\n"» 
 		«"\n"»
 		CONCRETE_VARIABLES«"\n"»
 		board_0_O1«", \n"»
 		board_0_O1«","»
 		«FOR p : root.variables»«p.name»«",\n"»«ENDFOR»
 		«"\n"»
 		INVARIANT «"\n"»
 		board_0_O1«" & \n"»
 		board_0_O1«" &"»
 		«FOR p : root.variables»«p.name»«" & \n"»
 		«ENDFOR» '''
}