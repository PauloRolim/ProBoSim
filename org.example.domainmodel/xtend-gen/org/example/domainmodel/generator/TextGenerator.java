package org.example.domainmodel.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.example.domainmodel.domainmodel.DataType;
import org.example.domainmodel.domainmodel.Model;
import org.example.domainmodel.domainmodel.Variable;

@SuppressWarnings("all")
public class TextGenerator {
  public static CharSequence generateBMachine(final Model model) {
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
    _builder.append(", \n");
    _builder.newLineIfNotEmpty();
    _builder.append("first_time");
    _builder.append(", \n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer");
    _builder.append(", \n");
    _builder.newLineIfNotEmpty();
    {
      EList<Variable> _variables = model.getVariables();
      boolean _hasElements = false;
      for(final Variable p : _variables) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = p.getName();
        _builder.append(_name);
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("INVARIANT ");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1 : uint8_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1 : uint8_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("first_time: BOOL");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer: uint32_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    {
      EList<Variable> _variables_1 = model.getVariables();
      boolean _hasElements_1 = false;
      for(final Variable p_1 : _variables_1) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(" & ", "");
        }
        String _name_1 = p_1.getName();
        _builder.append(_name_1);
        _builder.append(" : ");
        String _mapType = TextGenerator.mapType(p_1.getType().toString());
        _builder.append(_mapType);
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("INITIALISATION");
    _builder.newLine();
    _builder.append("first_time:= TRUE");
    _builder.append("; \n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer := 0");
    _builder.append("; \n");
    _builder.newLineIfNotEmpty();
    {
      EList<Variable> _variables_2 = model.getVariables();
      boolean _hasElements_2 = false;
      for(final Variable v : _variables_2) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate("; ", "");
        }
        String _name_2 = v.getName();
        _builder.append(_name_2);
        _builder.append(":=");
        String _initValue = TextGenerator.initValue(v);
        _builder.append(_initValue);
        _builder.append(" ");
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("LOCAL_OPERATIONS");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("elapsed <-- since(timer) =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE timer:uint32_t & elapsed:uint32_t");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("elapsed::uint32_t");
    _builder.append("\n", "   ");
    _builder.newLineIfNotEmpty();
    _builder.append("END");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("OPERATIONS");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("elapsed <-- since(timer) =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN ");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("elapsed:(elapsed:uint32_t);");
    _builder.append("\n", "     ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("VAR local_time IN ");
    _builder.append("\n", "     ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("local_time:(local_time:uint32_t);");
    _builder.append("\n", "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("\n", "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("local_time <-- get_ms_tick;");
    _builder.append("\n", "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("elapsed := sub_uint32(local_time, timer)");
    _builder.append("\n", "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("END");
    _builder.append("\n", "     ");
    _builder.newLineIfNotEmpty();
    _builder.append("END");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
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
  
  public static String initValue(final Variable v) {
    String _switchResult = null;
    DataType _type = v.getType();
    if (_type != null) {
      switch (_type) {
        case NAT:
        case INT:
        case REAL:
          _switchResult = " 0";
          break;
        case BOOL:
          _switchResult = " FALSE";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
}
