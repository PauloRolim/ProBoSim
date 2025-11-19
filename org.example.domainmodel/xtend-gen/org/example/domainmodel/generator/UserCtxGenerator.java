package org.example.domainmodel.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.example.domainmodel.domainmodel.Constant;
import org.example.domainmodel.domainmodel.Model;

@SuppressWarnings("all")
public class UserCtxGenerator {
  public static CharSequence generateUserCtx(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MACHINE");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("user_ctx");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("SEES");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("g_types");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append("    ");
    _builder.newLineIfNotEmpty();
    _builder.append("CONCRETE_CONSTANTS");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_unit,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    String _name = model.getName();
    _builder.append(_name);
    _builder.append("_cycleDef,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Constant> _constants = model.getConstants();
      boolean _hasElements = false;
      for(final Constant c : _constants) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_1 = c.getName();
        _builder.append(_name_1);
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PROPERTIES");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_unit:uint32_t &");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    String _name_2 = model.getName();
    _builder.append(_name_2);
    _builder.append("_cycleDef : uint32_t &");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Constant> _constants_1 = model.getConstants();
      boolean _hasElements_1 = false;
      for(final Constant c_1 : _constants_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" & ", "");
        }
        String _name_3 = c_1.getName();
        _builder.append(_name_3);
        _builder.append(" : ");
        String _mapType = UserCtxGenerator.mapType(c_1.getType().toString());
        _builder.append(_mapType);
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("END");
    _builder.newLine();
    return _builder;
  }
  
  public static String mapType(final String robosimType) {
    String _switchResult = null;
    if (robosimType != null) {
      switch (robosimType) {
        case "NAT":
          _switchResult = "uint32_t";
          break;
        case "INT":
          _switchResult = "uint32_t";
          break;
        case "REAL":
          _switchResult = "uint32_t";
          break;
        case "BOOL":
          _switchResult = "BOOL";
          break;
      }
    }
    return _switchResult;
  }
}
