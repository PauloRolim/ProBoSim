package org.example.domainmodel.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.example.domainmodel.domainmodel.Domainmodel;
import org.example.domainmodel.domainmodel.Variables;

@SuppressWarnings("all")
public class TextGenerator {
  public static CharSequence toText(final Domainmodel root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IMPLEMENTATION");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("logic_i");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("REFINES");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("logic");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("CONCRETE_VARIABLES");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1");
    _builder.append(", \n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<Variables> _variables = root.getVariables();
      for(final Variables p : _variables) {
        String _name = p.getName();
        _builder.append(_name);
        _builder.append(",\n");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("INVARIANT ");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1");
    _builder.append(" &");
    _builder.newLineIfNotEmpty();
    {
      EList<Variables> _variables_1 = root.getVariables();
      for(final Variables p_1 : _variables_1) {
        String _name_1 = p_1.getName();
        _builder.append(_name_1);
        _builder.append(" & \n");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(" ");
    return _builder;
  }
}
