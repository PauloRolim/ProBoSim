package org.example.domainmodel.validation


import org.eclipse.xtext.validation.Check;
import org.example.domainmodel.domainmodel.DomainmodelPackage
import org.example.domainmodel.domainmodel.Model
import org.example.domainmodel.domainmodel.CycleDef
import org.example.domainmodel.domainmodel.Interface

class RoboSimmodelValidator extends AbstractDomainmodelValidator {
	
	//Rule 1: Grant if there are only one cycleDef in model definition.
	@Check
    def checkSingleCycleDef(Model model) {
        if (model.eAllContents.toList.filter(CycleDef).size > 1) {
            warning(
                'O modelo deve conter no máximo uma definição de ciclo (cycleDef).',
                DomainmodelPackage.Literals.MODEL__CYCLE_DEF
            )
        }
    }
    
    //Rule 2: Verify if the value defined is natural greater than zero.
    @Check
    def checkCycleDefValue(CycleDef cycleDef) {
        if (cycleDef.value == 0) {
            error(
                'O valor do ciclo deve ser um número natural positivo (maior que zero).',
                DomainmodelPackage.Literals.CYCLE_DEF__VALUE
            )
        }
    }
    
    // Rule 3: Alert about a interface without events.
    @Check
	def checkAtLeastOneEvent(Interface i) {
    if (i.events.empty) {
        warning(
            "A interface deve definir pelo menos um evento.",
            DomainmodelPackage.Literals.INTERFACE__EVENTS
        )
    }
}
	
}