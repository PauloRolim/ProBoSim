package org.example.domainmodel.validation;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.example.domainmodel.domainmodel.CycleDef;
import org.example.domainmodel.domainmodel.DomainmodelPackage;
import org.example.domainmodel.domainmodel.Interface;
import org.example.domainmodel.domainmodel.Model;

@SuppressWarnings("all")
public class RoboSimmodelValidator extends AbstractDomainmodelValidator {
  @Check
  public void checkSingleCycleDef(final Model model) {
    int _size = IterableExtensions.size(Iterables.<CycleDef>filter(IteratorExtensions.<EObject>toList(model.eAllContents()), CycleDef.class));
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      this.warning(
        "O modelo deve conter no máximo uma definição de ciclo (cycleDef).", 
        DomainmodelPackage.Literals.MODEL__CYCLE_DEF);
    }
  }
  
  @Check
  public void checkCycleDefValue(final CycleDef cycleDef) {
    int _value = cycleDef.getValue();
    boolean _equals = (_value == 0);
    if (_equals) {
      this.error(
        "O valor do ciclo deve ser um número natural positivo (maior que zero).", 
        DomainmodelPackage.Literals.CYCLE_DEF__VALUE);
    }
  }
  
  @Check
  public void checkAtLeastOneEvent(final Interface i) {
    boolean _isEmpty = i.getEvents().isEmpty();
    if (_isEmpty) {
      this.warning(
        "A interface deve definir pelo menos um evento.", 
        DomainmodelPackage.Literals.INTERFACE__EVENTS);
    }
  }
}
