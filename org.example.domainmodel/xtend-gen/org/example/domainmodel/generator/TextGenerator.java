package org.example.domainmodel.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.example.domainmodel.domainmodel.Clock;
import org.example.domainmodel.domainmodel.ContextDecl;
import org.example.domainmodel.domainmodel.DataType;
import org.example.domainmodel.domainmodel.EventDecl;
import org.example.domainmodel.domainmodel.Interface;
import org.example.domainmodel.domainmodel.Model;
import org.example.domainmodel.domainmodel.OperationDecl;
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
    _builder.append("SEES");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("g_types,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("g_operators,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("io_constants,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("lchip_interface,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("user_ctx,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("inputs");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append(" \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("CONCRETE_VARIABLES");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O2,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("first_time,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("SM_");
    String _name = model.getName();
    _builder.append(_name);
    _builder.append("_state");
    _builder.append(", \n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_state,");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Pair<Integer, Clock>> _indexed = IterableExtensions.<Clock>indexed(model.getClock());
      boolean _hasElements = false;
      for(final Pair<Integer, Clock> c : _indexed) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" , ", "");
        }
        _builder.append("clock_");
        String _name_1 = c.getValue().getName();
        _builder.append(_name_1);
        _builder.append("_");
        Integer _key = c.getKey();
        int _plus = ((_key).intValue() + 1);
        _builder.append(_plus);
      }
      if (_hasElements) {
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts = model.getContexts();
      for(final ContextDecl i : _contexts) {
        {
          EList<Interface> _usedInterfaces = i.getUsedInterfaces();
          for(final Interface iface : _usedInterfaces) {
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_1 = IterableExtensions.<EventDecl>indexed(iface.getEvents());
              boolean _hasElements_1 = false;
              for(final Pair<Integer, EventDecl> ev : _indexed_1) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(", ", "");
                }
                _builder.append("i_");
                String _name_2 = ev.getValue().getName();
                _builder.append(_name_2);
                _builder.append("_");
                Integer _key_1 = ev.getKey();
                int _plus_1 = ((_key_1).intValue() + 1);
                _builder.append(_plus_1);
              }
              if (_hasElements_1) {
                _builder.append(", ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Interface> _interface = model.getInterface();
      for(final Interface i_1 : _interface) {
        {
          EList<OperationDecl> _operations = i_1.getOperations();
          boolean _hasElements_2 = false;
          for(final OperationDecl iface_1 : _operations) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append("o_");
            String _name_3 = iface_1.getName();
            _builder.append(_name_3);
            _builder.append("_linear");
          }
          if (_hasElements_2) {
            _builder.append(", ");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _interface_1 = model.getInterface();
      for(final Interface i_2 : _interface_1) {
        {
          EList<OperationDecl> _operations_1 = i_2.getOperations();
          boolean _hasElements_3 = false;
          for(final OperationDecl iface_2 : _operations_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            _builder.append("o_");
            String _name_4 = iface_2.getName();
            _builder.append(_name_4);
            _builder.append("_angular");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Variable> _variables = model.getVariables();
      boolean _hasElements_4 = false;
      for(final Variable p : _variables) {
        if (!_hasElements_4) {
          _hasElements_4 = true;
        } else {
          _builder.appendImmediate(" , ", "");
        }
        _builder.append("var_");
        String _name_5 = p.getName();
        _builder.append(_name_5);
        _builder.append("_");
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
    _builder.append("board_0_O2 : uint8_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("first_time: BOOL");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("SM_");
    String _name_6 = model.getName();
    _builder.append(_name_6);
    _builder.append("_state: uint32_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer: uint32_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_state: uint32_t");
    _builder.append(" & \n");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Pair<Integer, Clock>> _indexed_2 = IterableExtensions.<Clock>indexed(model.getClock());
      boolean _hasElements_5 = false;
      for(final Pair<Integer, Clock> c_1 : _indexed_2) {
        if (!_hasElements_5) {
          _hasElements_5 = true;
        } else {
          _builder.appendImmediate(" & ", "");
        }
        _builder.append("clock_");
        String _name_7 = c_1.getValue().getName();
        _builder.append(_name_7);
        _builder.append("_");
        Integer _key_2 = c_1.getKey();
        int _plus_2 = ((_key_2).intValue() + 1);
        _builder.append(_plus_2);
        _builder.append(" : uint32_t ");
      }
      if (_hasElements_5) {
        _builder.append(" & ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts_1 = model.getContexts();
      for(final ContextDecl i_3 : _contexts_1) {
        {
          EList<Interface> _usedInterfaces_1 = i_3.getUsedInterfaces();
          for(final Interface iface_3 : _usedInterfaces_1) {
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_3 = IterableExtensions.<EventDecl>indexed(iface_3.getEvents());
              boolean _hasElements_6 = false;
              for(final Pair<Integer, EventDecl> ev_1 : _indexed_3) {
                if (!_hasElements_6) {
                  _hasElements_6 = true;
                } else {
                  _builder.appendImmediate(" & ", "");
                }
                _builder.append("i_");
                String _name_8 = ev_1.getValue().getName();
                _builder.append(_name_8);
                _builder.append("_");
                Integer _key_3 = ev_1.getKey();
                int _plus_3 = ((_key_3).intValue() + 1);
                _builder.append(_plus_3);
                _builder.append(" : uint8_t ");
              }
              if (_hasElements_6) {
                _builder.append(" & ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Interface> _interface_2 = model.getInterface();
      for(final Interface i_4 : _interface_2) {
        {
          EList<OperationDecl> _operations_2 = i_4.getOperations();
          boolean _hasElements_7 = false;
          for(final OperationDecl iface_4 : _operations_2) {
            if (!_hasElements_7) {
              _hasElements_7 = true;
            } else {
              _builder.appendImmediate(" & ", "");
            }
            _builder.append("o_");
            String _name_9 = iface_4.getName();
            _builder.append(_name_9);
            _builder.append("_linear");
            _builder.append(" : uint8_t ");
          }
          if (_hasElements_7) {
            _builder.append(" & ");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _interface_3 = model.getInterface();
      for(final Interface i_5 : _interface_3) {
        {
          EList<OperationDecl> _operations_3 = i_5.getOperations();
          boolean _hasElements_8 = false;
          for(final OperationDecl iface_5 : _operations_3) {
            if (!_hasElements_8) {
              _hasElements_8 = true;
            } else {
              _builder.appendImmediate(" & ", "");
            }
            _builder.append("o_");
            String _name_10 = iface_5.getName();
            _builder.append(_name_10);
            _builder.append("_angular");
            _builder.append(" : uint8_t ");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Variable> _variables_1 = model.getVariables();
      boolean _hasElements_9 = false;
      for(final Variable p_1 : _variables_1) {
        if (!_hasElements_9) {
          _hasElements_9 = true;
        } else {
          _builder.appendImmediate(" & ", "");
        }
        _builder.append("var_");
        String _name_11 = p_1.getName();
        _builder.append(_name_11);
        _builder.append("_");
        _builder.append(" : ");
        String _mapType = TextGenerator.mapType(p_1.getType().toString());
        _builder.append(_mapType);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("INITIALISATION");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1 := IO_OFF;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O2 := IO_OFF;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("first_time := TRUE;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("SM_");
    String _name_12 = model.getName();
    _builder.append(_name_12);
    _builder.append("_state := 1;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer := 0;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_state := 1;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Pair<Integer, Clock>> _indexed_4 = IterableExtensions.<Clock>indexed(model.getClock());
      boolean _hasElements_10 = false;
      for(final Pair<Integer, Clock> c_2 : _indexed_4) {
        if (!_hasElements_10) {
          _hasElements_10 = true;
        } else {
          _builder.appendImmediate("; ", "");
        }
        _builder.append("clock_");
        String _name_13 = c_2.getValue().getName();
        _builder.append(_name_13);
        _builder.append("_");
        Integer _key_4 = c_2.getKey();
        int _plus_4 = ((_key_4).intValue() + 1);
        _builder.append(_plus_4);
        _builder.append(" := 0");
      }
      if (_hasElements_10) {
        _builder.append("; ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts_2 = model.getContexts();
      for(final ContextDecl m : _contexts_2) {
        {
          EList<Interface> _usedInterfaces_2 = m.getUsedInterfaces();
          for(final Interface iface_6 : _usedInterfaces_2) {
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_5 = IterableExtensions.<EventDecl>indexed(iface_6.getEvents());
              boolean _hasElements_11 = false;
              for(final Pair<Integer, EventDecl> ev_2 : _indexed_5) {
                if (!_hasElements_11) {
                  _hasElements_11 = true;
                } else {
                  _builder.appendImmediate("; ", "");
                }
                _builder.append("i_");
                String _name_14 = ev_2.getValue().getName();
                _builder.append(_name_14);
                _builder.append("_");
                Integer _key_5 = ev_2.getKey();
                int _plus_5 = ((_key_5).intValue() + 1);
                _builder.append(_plus_5);
                _builder.append(":= IO_OFF");
              }
              if (_hasElements_11) {
                _builder.append("; ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Interface> _interface_4 = model.getInterface();
      for(final Interface i_6 : _interface_4) {
        {
          EList<OperationDecl> _operations_4 = i_6.getOperations();
          boolean _hasElements_12 = false;
          for(final OperationDecl iface_7 : _operations_4) {
            if (!_hasElements_12) {
              _hasElements_12 = true;
            } else {
              _builder.appendImmediate("; ", "");
            }
            _builder.append("o_");
            String _name_15 = iface_7.getName();
            _builder.append(_name_15);
            _builder.append("_linear");
            _builder.append(":= IO_OFF");
          }
          if (_hasElements_12) {
            _builder.append("; ");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _interface_5 = model.getInterface();
      for(final Interface i_7 : _interface_5) {
        {
          EList<OperationDecl> _operations_5 = i_7.getOperations();
          boolean _hasElements_13 = false;
          for(final OperationDecl iface_8 : _operations_5) {
            if (!_hasElements_13) {
              _hasElements_13 = true;
            } else {
              _builder.appendImmediate("; ", "");
            }
            _builder.append("o_");
            String _name_16 = iface_8.getName();
            _builder.append(_name_16);
            _builder.append("_angular");
            _builder.append(":= IO_OFF");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Variable> _variables_2 = model.getVariables();
      boolean _hasElements_14 = false;
      for(final Variable v : _variables_2) {
        if (!_hasElements_14) {
          _hasElements_14 = true;
        } else {
          _builder.appendImmediate("; ", "");
        }
        _builder.append("var_");
        String _name_17 = v.getName();
        _builder.append(_name_17);
        _builder.append("_");
        _builder.append(":=");
        String _initValue = TextGenerator.initValue(v);
        _builder.append(_initValue);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("LOCAL_OPERATIONS");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("execute_model_cycle =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE cycle_state = 4");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("SM_");
    String _name_18 = model.getName();
    _builder.append(_name_18);
    _builder.append("_state:: uint32_t ||");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Variable> _variables_3 = model.getVariables();
      boolean _hasElements_15 = false;
      for(final Variable p_2 : _variables_3) {
        if (!_hasElements_15) {
          _hasElements_15 = true;
        } else {
          _builder.appendImmediate(" || ", "");
        }
        _builder.append("var_");
        String _name_19 = p_2.getName();
        _builder.append(_name_19);
        _builder.append("_");
        _builder.append(" :: ");
        String _mapType_1 = TextGenerator.mapType(p_2.getType().toString());
        _builder.append(_mapType_1);
        _builder.append("\n");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements_15) {
        _builder.append(" || ");
      }
    }
    _builder.append("first_time:: BOOL ||");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_timer::uint32_t ||");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("cycle_state ::uint32_t ||");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts_3 = model.getContexts();
      for(final ContextDecl n : _contexts_3) {
        {
          EList<Interface> _usedInterfaces_3 = n.getUsedInterfaces();
          boolean _hasElements_16 = false;
          for(final Interface iface_9 : _usedInterfaces_3) {
            if (!_hasElements_16) {
              _hasElements_16 = true;
            } else {
              _builder.appendImmediate("\n ", "");
            }
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_6 = IterableExtensions.<EventDecl>indexed(iface_9.getEvents());
              boolean _hasElements_17 = false;
              for(final Pair<Integer, EventDecl> ev_3 : _indexed_6) {
                if (!_hasElements_17) {
                  _hasElements_17 = true;
                } else {
                  _builder.appendImmediate("|| ", "");
                }
                _builder.append("i_");
                String _name_20 = ev_3.getValue().getName();
                _builder.append(_name_20);
                _builder.append("_");
                Integer _key_6 = ev_3.getKey();
                int _plus_6 = ((_key_6).intValue() + 1);
                _builder.append(_plus_6);
                _builder.append(" :: uint8_t");
              }
              if (_hasElements_17) {
                _builder.append("|| ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<Interface> _interface_6 = model.getInterface();
      for(final Interface i_8 : _interface_6) {
        {
          EList<OperationDecl> _operations_6 = i_8.getOperations();
          boolean _hasElements_18 = false;
          for(final OperationDecl iface_10 : _operations_6) {
            if (!_hasElements_18) {
              _hasElements_18 = true;
            } else {
              _builder.appendImmediate("|| ", "");
            }
            _builder.append("o_");
            String _name_21 = iface_10.getName();
            _builder.append(_name_21);
            _builder.append("_linear");
            _builder.append(" :: uint8_t");
          }
          if (_hasElements_18) {
            _builder.append("|| ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _interface_7 = model.getInterface();
      for(final Interface i_9 : _interface_7) {
        {
          EList<OperationDecl> _operations_7 = i_9.getOperations();
          boolean _hasElements_19 = false;
          for(final OperationDecl iface_11 : _operations_7) {
            if (!_hasElements_19) {
              _hasElements_19 = true;
            } else {
              _builder.appendImmediate("|| ", "");
            }
            _builder.append("o_");
            String _name_22 = iface_11.getName();
            _builder.append(_name_22);
            _builder.append("_angular");
            _builder.append(" :: uint8_t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("END; \t\t");
    _builder.newLine();
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
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("result <-- land(pp,qq) =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE pp:BOOL & qq:BOOL & result:BOOL");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("result::BOOL");
    _builder.append("\n", "   ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("result <-- lor(pp,qq) =");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE pp:BOOL & qq:BOOL & result:BOOL");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result::BOOL");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("result <-- lnot(pp) =");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE pp:BOOL & result:BOOL");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result::BOOL");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("reset_outputs =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("board_0_O1 :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("board_0_O2 :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _interface_8 = model.getInterface();
      for(final Interface i_10 : _interface_8) {
        _builder.append("    ");
        {
          EList<OperationDecl> _operations_8 = i_10.getOperations();
          boolean _hasElements_20 = false;
          for(final OperationDecl iface_12 : _operations_8) {
            if (!_hasElements_20) {
              _hasElements_20 = true;
            } else {
              _builder.appendImmediate("|| ", "    ");
            }
            _builder.append("o_");
            String _name_23 = iface_12.getName();
            _builder.append(_name_23, "    ");
            _builder.append("_linear");
            _builder.append(" :: uint8_t", "    ");
          }
          if (_hasElements_20) {
            _builder.append("|| ", "    ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _interface_9 = model.getInterface();
      for(final Interface i_11 : _interface_9) {
        _builder.append("    ");
        {
          EList<OperationDecl> _operations_9 = i_11.getOperations();
          boolean _hasElements_21 = false;
          for(final OperationDecl iface_13 : _operations_9) {
            if (!_hasElements_21) {
              _hasElements_21 = true;
            } else {
              _builder.appendImmediate("|| ", "    ");
            }
            _builder.append("o_");
            String _name_24 = iface_13.getName();
            _builder.append(_name_24, "    ");
            _builder.append("_angular");
            _builder.append(" :: uint8_t", "    ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("read_model_inputs =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE cycle_state = 1");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("cycle_state  :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts_4 = model.getContexts();
      for(final ContextDecl b : _contexts_4) {
        {
          EList<Interface> _usedInterfaces_4 = b.getUsedInterfaces();
          for(final Interface iface_14 : _usedInterfaces_4) {
            _builder.append("    ");
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_7 = IterableExtensions.<EventDecl>indexed(iface_14.getEvents());
              boolean _hasElements_22 = false;
              for(final Pair<Integer, EventDecl> ev_4 : _indexed_7) {
                if (!_hasElements_22) {
                  _hasElements_22 = true;
                } else {
                  _builder.appendImmediate("|| ", "    ");
                }
                _builder.append("i_");
                String _name_25 = ev_4.getValue().getName();
                _builder.append(_name_25, "    ");
                _builder.append("_");
                Integer _key_7 = ev_4.getKey();
                int _plus_7 = ((_key_7).intValue() + 1);
                _builder.append(_plus_7, "    ");
                _builder.append(" :: uint8_t ", "    ");
              }
            }
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts_5 = model.getContexts();
      boolean _hasElements_23 = false;
      for(final ContextDecl v_1 : _contexts_5) {
        if (!_hasElements_23) {
          _hasElements_23 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        {
          EList<Interface> _usedInterfaces_5 = v_1.getUsedInterfaces();
          boolean _hasElements_24 = false;
          for(final Interface iface_15 : _usedInterfaces_5) {
            if (!_hasElements_24) {
              _hasElements_24 = true;
            } else {
              _builder.appendImmediate("\n", "");
            }
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_8 = IterableExtensions.<EventDecl>indexed(iface_15.getEvents());
              boolean _hasElements_25 = false;
              for(final Pair<Integer, EventDecl> ev_5 : _indexed_8) {
                if (!_hasElements_25) {
                  _hasElements_25 = true;
                } else {
                  _builder.appendImmediate("\n ", "");
                }
                _builder.append("read_i_");
                String _name_26 = ev_5.getValue().getName();
                _builder.append(_name_26);
                _builder.append(" =");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
                _builder.append("PRE cycle_state = 1");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
                _builder.append("THEN");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
                _builder.append("i_");
                String _name_27 = ev_5.getValue().getName();
                _builder.append(_name_27);
                _builder.append("_");
                Integer _key_8 = ev_5.getKey();
                int _plus_8 = ((_key_8).intValue() + 1);
                _builder.append(_plus_8);
                _builder.append(" :: uint8_t ");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
                _builder.append("END;");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("write_model_outputs =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE cycle_state = 3");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("board_0_O1      :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("board_0_O2      :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("cycle_state     :: uint8_t");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("write_o_move =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE cycle_state = 3");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.append("     ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("board_0_O1      :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("board_0_O2      :: uint8_t ||");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("cycle_state     :: uint8_t");
    _builder.newLine();
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("write_o_move_linear =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE cycle_state = 3");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.append("        ");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("board_0_O1    :: uint8_t");
    _builder.append("\n", "   ");
    _builder.append("           ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("write_o_move_angular =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("PRE cycle_state = 3");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("THEN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("board_0_O2    :: uint8_t");
    _builder.append("\n", "   ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _interface_10 = model.getInterface();
      for(final Interface i_12 : _interface_10) {
        {
          EList<OperationDecl> _operations_10 = i_12.getOperations();
          for(final OperationDecl iface_16 : _operations_10) {
            String _name_28 = iface_16.getName();
            _builder.append(_name_28);
            _builder.append("(l_lv,l_av) = ");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("PRE l_lv:BOOL & l_av:BOOL");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("THEN");
            _builder.newLine();
            {
              EList<Interface> _interface_11 = model.getInterface();
              for(final Interface o : _interface_11) {
                {
                  EList<OperationDecl> _operations_11 = o.getOperations();
                  boolean _hasElements_26 = false;
                  for(final OperationDecl inter : _operations_11) {
                    if (!_hasElements_26) {
                      _hasElements_26 = true;
                    } else {
                      _builder.appendImmediate("|| ", "");
                    }
                    _builder.append("o_");
                    String _name_29 = inter.getName();
                    _builder.append(_name_29);
                    _builder.append("_linear");
                    _builder.append(" :: uint8_t");
                  }
                  if (_hasElements_26) {
                    _builder.append("|| ");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<Interface> _interface_12 = model.getInterface();
              for(final Interface p_3 : _interface_12) {
                {
                  EList<OperationDecl> _operations_12 = p_3.getOperations();
                  boolean _hasElements_27 = false;
                  for(final OperationDecl inter_1 : _operations_12) {
                    if (!_hasElements_27) {
                      _hasElements_27 = true;
                    } else {
                      _builder.appendImmediate("|| ", "");
                    }
                    _builder.append("o_");
                    String _name_30 = inter_1.getName();
                    _builder.append(_name_30);
                    _builder.append("_angular");
                    _builder.append(" :: uint8_t");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("END;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("tock =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("skip");
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
    _builder.append("user_logic =");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("IF first_time = TRUE THEN");
    _builder.append("\n", "    ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("cycle_timer <-- get_ms_tick;");
    _builder.append("\n", "       ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("execute_model_cycle;");
    _builder.append("\n", "       ");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("cycle_state:= 1;");
    _builder.append("\n", "       ");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("first_time := FALSE");
    _builder.append("\n", "       ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("ELSE");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("VAR time_elapsed, cycle_duration IN");
    _builder.append("\n", "        ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("time_elapsed:(time_elapsed:uint32_t);");
    _builder.append("\n", "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("cycle_duration:(cycle_duration:uint32_t);");
    _builder.append("\n", "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("time_elapsed <-- since(cycle_timer);");
    _builder.append("\n", "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("cycle_duration := mul_uint32(SimSMovement_cycleDef,cycle_unit);");
    _builder.append("\n", "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("IF (cycle_duration <= time_elapsed) THEN");
    _builder.append("\n", "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("cycle_timer <-- get_ms_tick;");
    _builder.append("\n", "                ");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("execute_model_cycle;");
    _builder.append("\n", "                ");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("cycle_state:= 1;");
    _builder.append("\n", "                ");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("tock");
    _builder.append("\n", "                ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("END");
    _builder.append("\n", "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("END");
    _builder.append("\n", "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("END");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("reset_outputs =");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O1 := IO_OFF;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("board_0_O2 := IO_OFF;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _interface_13 = model.getInterface();
      for(final Interface i_13 : _interface_13) {
        {
          EList<OperationDecl> _operations_13 = i_13.getOperations();
          boolean _hasElements_28 = false;
          for(final OperationDecl iface_17 : _operations_13) {
            if (!_hasElements_28) {
              _hasElements_28 = true;
            } else {
              _builder.appendImmediate("; ", "");
            }
            _builder.append("o_");
            String _name_31 = iface_17.getName();
            _builder.append(_name_31);
            _builder.append("_linear");
            _builder.append(":= IO_OFF");
          }
          if (_hasElements_28) {
            _builder.append("; ");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Interface> _interface_14 = model.getInterface();
      for(final Interface i_14 : _interface_14) {
        {
          EList<OperationDecl> _operations_14 = i_14.getOperations();
          boolean _hasElements_29 = false;
          for(final OperationDecl iface_18 : _operations_14) {
            if (!_hasElements_29) {
              _hasElements_29 = true;
            } else {
              _builder.appendImmediate("; ", "");
            }
            _builder.append("o_");
            String _name_32 = iface_18.getName();
            _builder.append(_name_32);
            _builder.append("_angular");
            _builder.append(":= IO_OFF");
          }
        }
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("read_model_inputs =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("cycle_state := 3;");
    _builder.newLine();
    {
      EList<ContextDecl> _contexts_6 = model.getContexts();
      for(final ContextDecl i_15 : _contexts_6) {
        {
          EList<Interface> _usedInterfaces_6 = i_15.getUsedInterfaces();
          for(final Interface iface_19 : _usedInterfaces_6) {
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_9 = IterableExtensions.<EventDecl>indexed(iface_19.getEvents());
              boolean _hasElements_30 = false;
              for(final Pair<Integer, EventDecl> ev_6 : _indexed_9) {
                if (!_hasElements_30) {
                  _hasElements_30 = true;
                } else {
                  _builder.appendImmediate("; ", "    ");
                }
                _builder.append("    ");
                _builder.append("read_i_");
                String _name_33 = ev_6.getValue().getName();
                _builder.append(_name_33, "    ");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<ContextDecl> _contexts_7 = model.getContexts();
      boolean _hasElements_31 = false;
      for(final ContextDecl i_16 : _contexts_7) {
        if (!_hasElements_31) {
          _hasElements_31 = true;
        } else {
          _builder.appendImmediate("\n", "");
        }
        {
          EList<Interface> _usedInterfaces_7 = i_16.getUsedInterfaces();
          boolean _hasElements_32 = false;
          for(final Interface iface_20 : _usedInterfaces_7) {
            if (!_hasElements_32) {
              _hasElements_32 = true;
            } else {
              _builder.appendImmediate("\n", "");
            }
            {
              Iterable<Pair<Integer, EventDecl>> _indexed_10 = IterableExtensions.<EventDecl>indexed(iface_20.getEvents());
              boolean _hasElements_33 = false;
              for(final Pair<Integer, EventDecl> ev_7 : _indexed_10) {
                if (!_hasElements_33) {
                  _hasElements_33 = true;
                } else {
                  _builder.appendImmediate("\n", "");
                }
                _builder.append("read_i_");
                String _name_34 = ev_7.getValue().getName();
                _builder.append(_name_34);
                _builder.append(" =");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
                _builder.append("BEGIN");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
                _builder.append("i_");
                String _name_35 = ev_7.getValue().getName();
                _builder.append(_name_35);
                _builder.append("_");
                Integer _key_9 = ev_7.getKey();
                int _plus_9 = ((_key_9).intValue() + 1);
                _builder.append(_plus_9);
                _builder.append(" <-- get_board_0_I");
                Integer _key_10 = ev_7.getKey();
                int _plus_10 = ((_key_10).intValue() + 1);
                _builder.append(_plus_10);
                _builder.newLineIfNotEmpty();
                _builder.append("END;");
                _builder.append("\n");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("write_model_outputs =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("cycle_state:= 4;");
    _builder.append("\n", "   ");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _interface_15 = model.getInterface();
      for(final Interface i_17 : _interface_15) {
        _builder.append("   ");
        {
          EList<OperationDecl> _operations_15 = i_17.getOperations();
          boolean _hasElements_34 = false;
          for(final OperationDecl iface_21 : _operations_15) {
            if (!_hasElements_34) {
              _hasElements_34 = true;
            } else {
              _builder.appendImmediate("; ", "   ");
            }
            _builder.append("write_o_");
            String _name_36 = iface_21.getName();
            _builder.append(_name_36, "   ");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("END;");
    _builder.newLine();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    {
      EList<Interface> _interface_16 = model.getInterface();
      for(final Interface i_18 : _interface_16) {
        {
          EList<OperationDecl> _operations_16 = i_18.getOperations();
          for(final OperationDecl iface_22 : _operations_16) {
            _builder.append("write_o_");
            String _name_37 = iface_22.getName();
            _builder.append(_name_37);
            _builder.append(" =");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("BEGIN");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            {
              EList<Interface> _interface_17 = model.getInterface();
              for(final Interface o_1 : _interface_17) {
                _builder.append("\t");
                {
                  EList<OperationDecl> _operations_17 = o_1.getOperations();
                  boolean _hasElements_35 = false;
                  for(final OperationDecl inter_2 : _operations_17) {
                    if (!_hasElements_35) {
                      _hasElements_35 = true;
                    } else {
                      _builder.appendImmediate("; ", "\t");
                    }
                    _builder.append("write_o_");
                    String _name_38 = inter_2.getName();
                    _builder.append(_name_38, "\t");
                    _builder.append("_linear");
                  }
                  if (_hasElements_35) {
                    _builder.append("; ", "\t");
                  }
                }
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<Interface> _interface_18 = model.getInterface();
              for(final Interface p_4 : _interface_18) {
                _builder.append("\t");
                {
                  EList<OperationDecl> _operations_18 = p_4.getOperations();
                  boolean _hasElements_36 = false;
                  for(final OperationDecl inter_3 : _operations_18) {
                    if (!_hasElements_36) {
                      _hasElements_36 = true;
                    } else {
                      _builder.appendImmediate(", ", "\t");
                    }
                    _builder.append("write_o_");
                    String _name_39 = inter_3.getName();
                    _builder.append(_name_39, "\t");
                    _builder.append("_angular");
                  }
                }
                _builder.append("\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("END;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Interface> _interface_19 = model.getInterface();
      for(final Interface i_19 : _interface_19) {
        {
          EList<OperationDecl> _operations_19 = i_19.getOperations();
          for(final OperationDecl iface_23 : _operations_19) {
            _builder.append("write_o_");
            String _name_40 = iface_23.getName();
            _builder.append(_name_40);
            _builder.append("_linear =");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("BEGIN");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("board_0_O1 := o_");
            String _name_41 = iface_23.getName();
            _builder.append(_name_41);
            _builder.append("_linear");
            _builder.newLineIfNotEmpty();
            _builder.append("END;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Interface> _interface_20 = model.getInterface();
      for(final Interface i_20 : _interface_20) {
        {
          EList<OperationDecl> _operations_20 = i_20.getOperations();
          for(final OperationDecl iface_24 : _operations_20) {
            _builder.append("write_o_");
            String _name_42 = iface_24.getName();
            _builder.append(_name_42);
            _builder.append("_angular =");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("BEGIN");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("board_0_O2 := o_");
            String _name_43 = iface_24.getName();
            _builder.append(_name_43);
            _builder.append("_angular");
            _builder.newLineIfNotEmpty();
            _builder.append("END;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Interface> _interface_21 = model.getInterface();
      for(final Interface i_21 : _interface_21) {
        {
          EList<OperationDecl> _operations_21 = i_21.getOperations();
          for(final OperationDecl iface_25 : _operations_21) {
            String _name_44 = iface_25.getName();
            _builder.append(_name_44);
            _builder.append("(l_lv,l_av) =");
            _builder.append("\n");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("BEGIN");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("IF l_lv = TRUE");
            _builder.append("\n");
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            _builder.append("THEN");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("o_");
            String _name_45 = iface_25.getName();
            _builder.append(_name_45);
            _builder.append("_linear := IO_ON");
            _builder.append("\n");
            _builder.append("  ");
            _builder.newLineIfNotEmpty();
            _builder.append("ELSE    ");
            _builder.newLine();
            _builder.append("o_");
            String _name_46 = iface_25.getName();
            _builder.append(_name_46);
            _builder.append("_linear := IO_OFF");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("END;");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append(" \t\t     ");
            _builder.append("\n", " \t\t     ");
            _builder.newLineIfNotEmpty();
            _builder.append("IF l_av = TRUE");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("THEN");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("o_");
            String _name_47 = iface_25.getName();
            _builder.append(_name_47);
            _builder.append("_angular := IO_ON");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("ELSE");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("o_");
            String _name_48 = iface_25.getName();
            _builder.append(_name_48);
            _builder.append("_angular := IO_OFF");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("END");
            _builder.append("\n");
            _builder.newLineIfNotEmpty();
            _builder.append("END;");
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("execute_model_cycle =");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("reset_outputs;");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("read_model_inputs;");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("//State machine");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("write_model_outputs");
    _builder.append("\n", "    ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
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
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("result <-- land(pp,qq) =");
    _builder.append("\n");
    _builder.append("\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result := FALSE;");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("IF (pp = TRUE) THEN");
    _builder.append("\n", "    ");
    _builder.append("\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("IF (qq = TRUE) THEN");
    _builder.append("\n", "        ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("result := TRUE");
    _builder.append("\n", "            ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("END");
    _builder.append("\n", "        ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("END");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("result <-- lor(pp,qq) =");
    _builder.append("\n");
    _builder.append("\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result := TRUE;");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("IF (pp = FALSE) THEN ");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("IF (qq = FALSE) THEN");
    _builder.append("\n", "        ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("result := FALSE");
    _builder.append("\n", "            ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("END");
    _builder.append("\n", "        ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("END");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append("\t    ");
    _builder.newLineIfNotEmpty();
    _builder.append("result <-- lnot(pp) =");
    _builder.append("\n");
    _builder.append("\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result := FALSE;");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("IF (pp = FALSE) THEN");
    _builder.append("\n", "    ");
    _builder.append("\t ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("result := TRUE");
    _builder.append("\n", "        ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("END");
    _builder.append("\n", "    ");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("tock =");
    _builder.append("\n");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("skip");
    _builder.append("\n", "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("po <-- get_board_0_O1 =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("po := board_0_O1");
    _builder.append("\n", "   ");
    _builder.newLineIfNotEmpty();
    _builder.append("END;");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("po <-- get_board_0_O2 =");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("BEGIN");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("po := board_0_O2");
    _builder.append("\n", "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("END");
    _builder.append("\n");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
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
