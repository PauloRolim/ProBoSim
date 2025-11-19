package org.example.domainmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'{'", "'}'", "'stm'", "'var'", "':'", "'='", "'const'", "'cycleDef'", "'cycle'", "'=='", "'clock'", "'event'", "'NAT'", "'INT'", "'REAL'", "'true'", "'false'", "'BOOL'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;

        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDomainmodel.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDomainmodel.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDomainmodel.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainmodel.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_interface_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDecl ) )* otherlv_4= '}' otherlv_5= 'stm' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_cycleDef_8_0= ruleCycleDef ) )? ( ( (lv_constants_9_0= ruleConstant ) ) | ( (lv_variables_10_0= ruleVariable ) ) | ( (lv_clock_11_0= ruleClock ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_interface_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_events_3_0 = null;

        EObject lv_cycleDef_8_0 = null;

        EObject lv_constants_9_0 = null;

        EObject lv_variables_10_0 = null;

        EObject lv_clock_11_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:78:2: ( (otherlv_0= 'interface' ( (lv_interface_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDecl ) )* otherlv_4= '}' otherlv_5= 'stm' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_cycleDef_8_0= ruleCycleDef ) )? ( ( (lv_constants_9_0= ruleConstant ) ) | ( (lv_variables_10_0= ruleVariable ) ) | ( (lv_clock_11_0= ruleClock ) ) )* otherlv_12= '}' ) )
            // InternalDomainmodel.g:79:2: (otherlv_0= 'interface' ( (lv_interface_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDecl ) )* otherlv_4= '}' otherlv_5= 'stm' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_cycleDef_8_0= ruleCycleDef ) )? ( ( (lv_constants_9_0= ruleConstant ) ) | ( (lv_variables_10_0= ruleVariable ) ) | ( (lv_clock_11_0= ruleClock ) ) )* otherlv_12= '}' )
            {
            // InternalDomainmodel.g:79:2: (otherlv_0= 'interface' ( (lv_interface_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDecl ) )* otherlv_4= '}' otherlv_5= 'stm' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_cycleDef_8_0= ruleCycleDef ) )? ( ( (lv_constants_9_0= ruleConstant ) ) | ( (lv_variables_10_0= ruleVariable ) ) | ( (lv_clock_11_0= ruleClock ) ) )* otherlv_12= '}' )
            // InternalDomainmodel.g:80:3: otherlv_0= 'interface' ( (lv_interface_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEventDecl ) )* otherlv_4= '}' otherlv_5= 'stm' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '{' ( (lv_cycleDef_8_0= ruleCycleDef ) )? ( ( (lv_constants_9_0= ruleConstant ) ) | ( (lv_variables_10_0= ruleVariable ) ) | ( (lv_clock_11_0= ruleClock ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getInterfaceKeyword_0());
            		
            // InternalDomainmodel.g:84:3: ( (lv_interface_1_0= RULE_ID ) )
            // InternalDomainmodel.g:85:4: (lv_interface_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:85:4: (lv_interface_1_0= RULE_ID )
            // InternalDomainmodel.g:86:5: lv_interface_1_0= RULE_ID
            {
            lv_interface_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_interface_1_0, grammarAccess.getModelAccess().getInterfaceIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interface",
            						lv_interface_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainmodel.g:106:3: ( (lv_events_3_0= ruleEventDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:107:4: (lv_events_3_0= ruleEventDecl )
            	    {
            	    // InternalDomainmodel.g:107:4: (lv_events_3_0= ruleEventDecl )
            	    // InternalDomainmodel.g:108:5: lv_events_3_0= ruleEventDecl
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEventsEventDeclParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_events_3_0=ruleEventDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_3_0,
            	    						"org.example.domainmodel.Domainmodel.EventDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getStmKeyword_5());
            		
            // InternalDomainmodel.g:133:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalDomainmodel.g:134:4: (lv_name_6_0= RULE_ID )
            {
            // InternalDomainmodel.g:134:4: (lv_name_6_0= RULE_ID )
            // InternalDomainmodel.g:135:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_6_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDomainmodel.g:155:3: ( (lv_cycleDef_8_0= ruleCycleDef ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:156:4: (lv_cycleDef_8_0= ruleCycleDef )
                    {
                    // InternalDomainmodel.g:156:4: (lv_cycleDef_8_0= ruleCycleDef )
                    // InternalDomainmodel.g:157:5: lv_cycleDef_8_0= ruleCycleDef
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getCycleDefCycleDefParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_cycleDef_8_0=ruleCycleDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"cycleDef",
                    						lv_cycleDef_8_0,
                    						"org.example.domainmodel.Domainmodel.CycleDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:174:3: ( ( (lv_constants_9_0= ruleConstant ) ) | ( (lv_variables_10_0= ruleVariable ) ) | ( (lv_clock_11_0= ruleClock ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt3=1;
                    }
                    break;
                case 15:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:175:4: ( (lv_constants_9_0= ruleConstant ) )
            	    {
            	    // InternalDomainmodel.g:175:4: ( (lv_constants_9_0= ruleConstant ) )
            	    // InternalDomainmodel.g:176:5: (lv_constants_9_0= ruleConstant )
            	    {
            	    // InternalDomainmodel.g:176:5: (lv_constants_9_0= ruleConstant )
            	    // InternalDomainmodel.g:177:6: lv_constants_9_0= ruleConstant
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getConstantsConstantParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_constants_9_0=ruleConstant();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"constants",
            	    							lv_constants_9_0,
            	    							"org.example.domainmodel.Domainmodel.Constant");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomainmodel.g:195:4: ( (lv_variables_10_0= ruleVariable ) )
            	    {
            	    // InternalDomainmodel.g:195:4: ( (lv_variables_10_0= ruleVariable ) )
            	    // InternalDomainmodel.g:196:5: (lv_variables_10_0= ruleVariable )
            	    {
            	    // InternalDomainmodel.g:196:5: (lv_variables_10_0= ruleVariable )
            	    // InternalDomainmodel.g:197:6: lv_variables_10_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_variables_10_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_10_0,
            	    							"org.example.domainmodel.Domainmodel.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDomainmodel.g:215:4: ( (lv_clock_11_0= ruleClock ) )
            	    {
            	    // InternalDomainmodel.g:215:4: ( (lv_clock_11_0= ruleClock ) )
            	    // InternalDomainmodel.g:216:5: (lv_clock_11_0= ruleClock )
            	    {
            	    // InternalDomainmodel.g:216:5: (lv_clock_11_0= ruleClock )
            	    // InternalDomainmodel.g:217:6: lv_clock_11_0= ruleClock
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getClockClockParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_clock_11_0=ruleClock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"clock",
            	    							lv_clock_11_0,
            	    							"org.example.domainmodel.Domainmodel.Clock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // InternalDomainmodel.g:243:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDomainmodel.g:243:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDomainmodel.g:244:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDomainmodel.g:250:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_initialValue_5_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:256:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? ) )
            // InternalDomainmodel.g:257:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? )
            {
            // InternalDomainmodel.g:257:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? )
            // InternalDomainmodel.g:258:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalDomainmodel.g:262:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:263:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:263:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:264:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            // InternalDomainmodel.g:284:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDomainmodel.g:285:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDomainmodel.g:285:4: (lv_type_3_0= ruleDataType )
            // InternalDomainmodel.g:286:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.example.domainmodel.Domainmodel.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomainmodel.g:303:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:304:4: otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalDomainmodel.g:308:4: ( (lv_initialValue_5_0= ruleValue ) )
                    // InternalDomainmodel.g:309:5: (lv_initialValue_5_0= ruleValue )
                    {
                    // InternalDomainmodel.g:309:5: (lv_initialValue_5_0= ruleValue )
                    // InternalDomainmodel.g:310:6: lv_initialValue_5_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getInitialValueValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_initialValue_5_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_5_0,
                    							"org.example.domainmodel.Domainmodel.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleConstant"
    // InternalDomainmodel.g:332:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDomainmodel.g:332:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDomainmodel.g:333:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDomainmodel.g:339:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:345:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalDomainmodel.g:346:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalDomainmodel.g:346:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            // InternalDomainmodel.g:347:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
            		
            // InternalDomainmodel.g:351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:352:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getColonKeyword_2());
            		
            // InternalDomainmodel.g:373:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDomainmodel.g:374:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDomainmodel.g:374:4: (lv_type_3_0= ruleDataType )
            // InternalDomainmodel.g:375:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getConstantAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.example.domainmodel.Domainmodel.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleCycleDef"
    // InternalDomainmodel.g:396:1: entryRuleCycleDef returns [EObject current=null] : iv_ruleCycleDef= ruleCycleDef EOF ;
    public final EObject entryRuleCycleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCycleDef = null;


        try {
            // InternalDomainmodel.g:396:49: (iv_ruleCycleDef= ruleCycleDef EOF )
            // InternalDomainmodel.g:397:2: iv_ruleCycleDef= ruleCycleDef EOF
            {
             newCompositeNode(grammarAccess.getCycleDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCycleDef=ruleCycleDef();

            state._fsp--;

             current =iv_ruleCycleDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCycleDef"


    // $ANTLR start "ruleCycleDef"
    // InternalDomainmodel.g:403:1: ruleCycleDef returns [EObject current=null] : (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleCycleDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:409:2: ( (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalDomainmodel.g:410:2: (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalDomainmodel.g:410:2: (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalDomainmodel.g:411:3: otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getCycleDefAccess().getCycleDefKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getCycleDefAccess().getCycleKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCycleDefAccess().getEqualsSignEqualsSignKeyword_2());
            		
            // InternalDomainmodel.g:423:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalDomainmodel.g:424:4: (lv_value_3_0= RULE_INT )
            {
            // InternalDomainmodel.g:424:4: (lv_value_3_0= RULE_INT )
            // InternalDomainmodel.g:425:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getCycleDefAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCycleDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCycleDef"


    // $ANTLR start "entryRuleClock"
    // InternalDomainmodel.g:445:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalDomainmodel.g:445:46: (iv_ruleClock= ruleClock EOF )
            // InternalDomainmodel.g:446:2: iv_ruleClock= ruleClock EOF
            {
             newCompositeNode(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClock=ruleClock();

            state._fsp--;

             current =iv_ruleClock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalDomainmodel.g:452:1: ruleClock returns [EObject current=null] : (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_initialValue_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:458:2: ( (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? ) )
            // InternalDomainmodel.g:459:2: (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? )
            {
            // InternalDomainmodel.g:459:2: (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? )
            // InternalDomainmodel.g:460:3: otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClockAccess().getClockKeyword_0());
            		
            // InternalDomainmodel.g:464:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:465:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:465:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:466:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDomainmodel.g:482:3: (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:483:4: otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getClockAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalDomainmodel.g:487:4: ( (lv_initialValue_3_0= RULE_INT ) )
                    // InternalDomainmodel.g:488:5: (lv_initialValue_3_0= RULE_INT )
                    {
                    // InternalDomainmodel.g:488:5: (lv_initialValue_3_0= RULE_INT )
                    // InternalDomainmodel.g:489:6: lv_initialValue_3_0= RULE_INT
                    {
                    lv_initialValue_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_initialValue_3_0, grammarAccess.getClockAccess().getInitialValueINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"initialValue",
                    							lv_initialValue_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleEventDecl"
    // InternalDomainmodel.g:510:1: entryRuleEventDecl returns [EObject current=null] : iv_ruleEventDecl= ruleEventDecl EOF ;
    public final EObject entryRuleEventDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDecl = null;


        try {
            // InternalDomainmodel.g:510:50: (iv_ruleEventDecl= ruleEventDecl EOF )
            // InternalDomainmodel.g:511:2: iv_ruleEventDecl= ruleEventDecl EOF
            {
             newCompositeNode(grammarAccess.getEventDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventDecl=ruleEventDecl();

            state._fsp--;

             current =iv_ruleEventDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDecl"


    // $ANTLR start "ruleEventDecl"
    // InternalDomainmodel.g:517:1: ruleEventDecl returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEventDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:523:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDomainmodel.g:524:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDomainmodel.g:524:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDomainmodel.g:525:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDeclAccess().getEventKeyword_0());
            		
            // InternalDomainmodel.g:529:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:530:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:530:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:531:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDecl"


    // $ANTLR start "entryRuleValue"
    // InternalDomainmodel.g:551:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalDomainmodel.g:551:46: (iv_ruleValue= ruleValue EOF )
            // InternalDomainmodel.g:552:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDomainmodel.g:558:1: ruleValue returns [EObject current=null] : ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:564:2: ( ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) ) )
            // InternalDomainmodel.g:565:2: ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) )
            {
            // InternalDomainmodel.g:565:2: ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) )
            // InternalDomainmodel.g:566:3: ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) )
            {
            // InternalDomainmodel.g:566:3: ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) )
            // InternalDomainmodel.g:567:4: (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' )
            {
            // InternalDomainmodel.g:567:4: (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:568:5: lv_value_0_1= 'NAT'
                    {
                    lv_value_0_1=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getValueAccess().getValueNATKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:579:5: lv_value_0_2= 'INT'
                    {
                    lv_value_0_2=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getValueAccess().getValueINTKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:590:5: lv_value_0_3= 'REAL'
                    {
                    lv_value_0_3=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getValueAccess().getValueREALKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:601:5: lv_value_0_4= 'true'
                    {
                    lv_value_0_4=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getValueAccess().getValueTrueKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:612:5: lv_value_0_5= 'false'
                    {
                    lv_value_0_5=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getValueAccess().getValueFalseKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:628:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:634:2: ( ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) )
            // InternalDomainmodel.g:635:2: ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            {
            // InternalDomainmodel.g:635:2: ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:636:3: (enumLiteral_0= 'NAT' )
                    {
                    // InternalDomainmodel.g:636:3: (enumLiteral_0= 'NAT' )
                    // InternalDomainmodel.g:637:4: enumLiteral_0= 'NAT'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:644:3: (enumLiteral_1= 'INT' )
                    {
                    // InternalDomainmodel.g:644:3: (enumLiteral_1= 'INT' )
                    // InternalDomainmodel.g:645:4: enumLiteral_1= 'INT'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:652:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDomainmodel.g:652:3: (enumLiteral_2= 'REAL' )
                    // InternalDomainmodel.g:653:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:660:3: (enumLiteral_3= 'BOOL' )
                    {
                    // InternalDomainmodel.g:660:3: (enumLiteral_3= 'BOOL' )
                    // InternalDomainmodel.g:661:4: enumLiteral_3= 'BOOL'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000004CA000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000044A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000027000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});

}