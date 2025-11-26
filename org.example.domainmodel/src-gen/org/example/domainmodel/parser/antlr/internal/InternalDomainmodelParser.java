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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stm'", "'{'", "'}'", "'interface'", "'('", "','", "')'", "'event'", "':'", "'input'", "'output'", "'context'", "'uses'", "'const'", "'var'", "'='", "'clock'", "'cycleDef'", "'cycle'", "'=='", "'NAT'", "'INT'", "'REAL'", "'BOOL'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    // InternalDomainmodel.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_interface_0_0= ruleInterface ) )* otherlv_1= 'stm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_cycleDef_4_0= ruleCycleDef ) )? ( (lv_constants_5_0= ruleConstant ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_clock_7_0= ruleClock ) )* ( (lv_contexts_8_0= ruleContextDecl ) )* otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        EObject lv_interface_0_0 = null;

        EObject lv_cycleDef_4_0 = null;

        EObject lv_constants_5_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_clock_7_0 = null;

        EObject lv_contexts_8_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:78:2: ( ( ( (lv_interface_0_0= ruleInterface ) )* otherlv_1= 'stm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_cycleDef_4_0= ruleCycleDef ) )? ( (lv_constants_5_0= ruleConstant ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_clock_7_0= ruleClock ) )* ( (lv_contexts_8_0= ruleContextDecl ) )* otherlv_9= '}' ) )
            // InternalDomainmodel.g:79:2: ( ( (lv_interface_0_0= ruleInterface ) )* otherlv_1= 'stm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_cycleDef_4_0= ruleCycleDef ) )? ( (lv_constants_5_0= ruleConstant ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_clock_7_0= ruleClock ) )* ( (lv_contexts_8_0= ruleContextDecl ) )* otherlv_9= '}' )
            {
            // InternalDomainmodel.g:79:2: ( ( (lv_interface_0_0= ruleInterface ) )* otherlv_1= 'stm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_cycleDef_4_0= ruleCycleDef ) )? ( (lv_constants_5_0= ruleConstant ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_clock_7_0= ruleClock ) )* ( (lv_contexts_8_0= ruleContextDecl ) )* otherlv_9= '}' )
            // InternalDomainmodel.g:80:3: ( (lv_interface_0_0= ruleInterface ) )* otherlv_1= 'stm' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_cycleDef_4_0= ruleCycleDef ) )? ( (lv_constants_5_0= ruleConstant ) )* ( (lv_variables_6_0= ruleVariable ) )* ( (lv_clock_7_0= ruleClock ) )* ( (lv_contexts_8_0= ruleContextDecl ) )* otherlv_9= '}'
            {
            // InternalDomainmodel.g:80:3: ( (lv_interface_0_0= ruleInterface ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:81:4: (lv_interface_0_0= ruleInterface )
            	    {
            	    // InternalDomainmodel.g:81:4: (lv_interface_0_0= ruleInterface )
            	    // InternalDomainmodel.g:82:5: lv_interface_0_0= ruleInterface
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getInterfaceInterfaceParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_interface_0_0=ruleInterface();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interface",
            	    						lv_interface_0_0,
            	    						"org.example.domainmodel.Domainmodel.Interface");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getStmKeyword_1());
            		
            // InternalDomainmodel.g:103:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDomainmodel.g:104:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDomainmodel.g:104:4: (lv_name_2_0= RULE_ID )
            // InternalDomainmodel.g:105:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomainmodel.g:125:3: ( (lv_cycleDef_4_0= ruleCycleDef ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:126:4: (lv_cycleDef_4_0= ruleCycleDef )
                    {
                    // InternalDomainmodel.g:126:4: (lv_cycleDef_4_0= ruleCycleDef )
                    // InternalDomainmodel.g:127:5: lv_cycleDef_4_0= ruleCycleDef
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getCycleDefCycleDefParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_cycleDef_4_0=ruleCycleDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"cycleDef",
                    						lv_cycleDef_4_0,
                    						"org.example.domainmodel.Domainmodel.CycleDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomainmodel.g:144:3: ( (lv_constants_5_0= ruleConstant ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:145:4: (lv_constants_5_0= ruleConstant )
            	    {
            	    // InternalDomainmodel.g:145:4: (lv_constants_5_0= ruleConstant )
            	    // InternalDomainmodel.g:146:5: lv_constants_5_0= ruleConstant
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getConstantsConstantParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_constants_5_0=ruleConstant();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constants",
            	    						lv_constants_5_0,
            	    						"org.example.domainmodel.Domainmodel.Constant");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDomainmodel.g:163:3: ( (lv_variables_6_0= ruleVariable ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:164:4: (lv_variables_6_0= ruleVariable )
            	    {
            	    // InternalDomainmodel.g:164:4: (lv_variables_6_0= ruleVariable )
            	    // InternalDomainmodel.g:165:5: lv_variables_6_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_variables_6_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_6_0,
            	    						"org.example.domainmodel.Domainmodel.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDomainmodel.g:182:3: ( (lv_clock_7_0= ruleClock ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainmodel.g:183:4: (lv_clock_7_0= ruleClock )
            	    {
            	    // InternalDomainmodel.g:183:4: (lv_clock_7_0= ruleClock )
            	    // InternalDomainmodel.g:184:5: lv_clock_7_0= ruleClock
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getClockClockParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_clock_7_0=ruleClock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clock",
            	    						lv_clock_7_0,
            	    						"org.example.domainmodel.Domainmodel.Clock");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDomainmodel.g:201:3: ( (lv_contexts_8_0= ruleContextDecl ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:202:4: (lv_contexts_8_0= ruleContextDecl )
            	    {
            	    // InternalDomainmodel.g:202:4: (lv_contexts_8_0= ruleContextDecl )
            	    // InternalDomainmodel.g:203:5: lv_contexts_8_0= ruleContextDecl
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getContextsContextDeclParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_contexts_8_0=ruleContextDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contexts",
            	    						lv_contexts_8_0,
            	    						"org.example.domainmodel.Domainmodel.ContextDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleInterface"
    // InternalDomainmodel.g:228:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDomainmodel.g:228:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalDomainmodel.g:229:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalDomainmodel.g:235:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_operations_3_0= ruleOperationDecl ) ) | ( (lv_events_4_0= ruleEventDecl ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_operations_3_0 = null;

        EObject lv_events_4_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:241:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_operations_3_0= ruleOperationDecl ) ) | ( (lv_events_4_0= ruleEventDecl ) ) )* otherlv_5= '}' ) )
            // InternalDomainmodel.g:242:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_operations_3_0= ruleOperationDecl ) ) | ( (lv_events_4_0= ruleEventDecl ) ) )* otherlv_5= '}' )
            {
            // InternalDomainmodel.g:242:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_operations_3_0= ruleOperationDecl ) ) | ( (lv_events_4_0= ruleEventDecl ) ) )* otherlv_5= '}' )
            // InternalDomainmodel.g:243:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_operations_3_0= ruleOperationDecl ) ) | ( (lv_events_4_0= ruleEventDecl ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalDomainmodel.g:247:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:248:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:248:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:249:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainmodel.g:269:3: ( ( (lv_operations_3_0= ruleOperationDecl ) ) | ( (lv_events_4_0= ruleEventDecl ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }
                else if ( (LA7_0==18) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainmodel.g:270:4: ( (lv_operations_3_0= ruleOperationDecl ) )
            	    {
            	    // InternalDomainmodel.g:270:4: ( (lv_operations_3_0= ruleOperationDecl ) )
            	    // InternalDomainmodel.g:271:5: (lv_operations_3_0= ruleOperationDecl )
            	    {
            	    // InternalDomainmodel.g:271:5: (lv_operations_3_0= ruleOperationDecl )
            	    // InternalDomainmodel.g:272:6: lv_operations_3_0= ruleOperationDecl
            	    {

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getOperationsOperationDeclParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_operations_3_0=ruleOperationDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operations",
            	    							lv_operations_3_0,
            	    							"org.example.domainmodel.Domainmodel.OperationDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomainmodel.g:290:4: ( (lv_events_4_0= ruleEventDecl ) )
            	    {
            	    // InternalDomainmodel.g:290:4: ( (lv_events_4_0= ruleEventDecl ) )
            	    // InternalDomainmodel.g:291:5: (lv_events_4_0= ruleEventDecl )
            	    {
            	    // InternalDomainmodel.g:291:5: (lv_events_4_0= ruleEventDecl )
            	    // InternalDomainmodel.g:292:6: lv_events_4_0= ruleEventDecl
            	    {

            	    						newCompositeNode(grammarAccess.getInterfaceAccess().getEventsEventDeclParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_events_4_0=ruleEventDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_4_0,
            	    							"org.example.domainmodel.Domainmodel.EventDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleOperationDecl"
    // InternalDomainmodel.g:318:1: entryRuleOperationDecl returns [EObject current=null] : iv_ruleOperationDecl= ruleOperationDecl EOF ;
    public final EObject entryRuleOperationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationDecl = null;


        try {
            // InternalDomainmodel.g:318:54: (iv_ruleOperationDecl= ruleOperationDecl EOF )
            // InternalDomainmodel.g:319:2: iv_ruleOperationDecl= ruleOperationDecl EOF
            {
             newCompositeNode(grammarAccess.getOperationDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationDecl=ruleOperationDecl();

            state._fsp--;

             current =iv_ruleOperationDecl; 
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
    // $ANTLR end "entryRuleOperationDecl"


    // $ANTLR start "ruleOperationDecl"
    // InternalDomainmodel.g:325:1: ruleOperationDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleOperationDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:331:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' ) )
            // InternalDomainmodel.g:332:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
            {
            // InternalDomainmodel.g:332:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')' )
            // InternalDomainmodel.g:333:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )? otherlv_5= ')'
            {
            // InternalDomainmodel.g:333:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainmodel.g:334:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainmodel.g:334:4: (lv_name_0_0= RULE_ID )
            // InternalDomainmodel.g:335:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOperationDeclAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationDeclAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDomainmodel.g:355:3: ( ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomainmodel.g:356:4: ( (lv_params_2_0= ruleParam ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                    {
                    // InternalDomainmodel.g:356:4: ( (lv_params_2_0= ruleParam ) )
                    // InternalDomainmodel.g:357:5: (lv_params_2_0= ruleParam )
                    {
                    // InternalDomainmodel.g:357:5: (lv_params_2_0= ruleParam )
                    // InternalDomainmodel.g:358:6: lv_params_2_0= ruleParam
                    {

                    						newCompositeNode(grammarAccess.getOperationDeclAccess().getParamsParamParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_params_2_0=ruleParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_2_0,
                    							"org.example.domainmodel.Domainmodel.Param");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomainmodel.g:375:4: (otherlv_3= ',' ( (lv_params_4_0= ruleParam ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDomainmodel.g:376:5: otherlv_3= ',' ( (lv_params_4_0= ruleParam ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getOperationDeclAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDomainmodel.g:380:5: ( (lv_params_4_0= ruleParam ) )
                    	    // InternalDomainmodel.g:381:6: (lv_params_4_0= ruleParam )
                    	    {
                    	    // InternalDomainmodel.g:381:6: (lv_params_4_0= ruleParam )
                    	    // InternalDomainmodel.g:382:7: lv_params_4_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationDeclAccess().getParamsParamParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_params_4_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationDeclRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"org.example.domainmodel.Domainmodel.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOperationDeclAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleOperationDecl"


    // $ANTLR start "entryRuleEventDecl"
    // InternalDomainmodel.g:409:1: entryRuleEventDecl returns [EObject current=null] : iv_ruleEventDecl= ruleEventDecl EOF ;
    public final EObject entryRuleEventDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDecl = null;


        try {
            // InternalDomainmodel.g:409:50: (iv_ruleEventDecl= ruleEventDecl EOF )
            // InternalDomainmodel.g:410:2: iv_ruleEventDecl= ruleEventDecl EOF
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
    // InternalDomainmodel.g:416:1: ruleEventDecl returns [EObject current=null] : (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEventDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:422:2: ( (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDomainmodel.g:423:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDomainmodel.g:423:2: (otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDomainmodel.g:424:3: otherlv_0= 'event' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEventDeclAccess().getEventKeyword_0());
            		
            // InternalDomainmodel.g:428:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:429:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:429:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:430:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleParam"
    // InternalDomainmodel.g:450:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalDomainmodel.g:450:46: (iv_ruleParam= ruleParam EOF )
            // InternalDomainmodel.g:451:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalDomainmodel.g:457:1: ruleParam returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:463:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalDomainmodel.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalDomainmodel.g:464:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) ) )
            // InternalDomainmodel.g:465:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalDomainmodel.g:465:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDomainmodel.g:466:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDomainmodel.g:466:4: (lv_name_0_0= RULE_ID )
            // InternalDomainmodel.g:467:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
            		
            // InternalDomainmodel.g:487:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalDomainmodel.g:488:4: (lv_type_2_0= ruleDataType )
            {
            // InternalDomainmodel.g:488:4: (lv_type_2_0= ruleDataType )
            // InternalDomainmodel.g:489:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getParamAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleContextDecl"
    // InternalDomainmodel.g:510:1: entryRuleContextDecl returns [EObject current=null] : iv_ruleContextDecl= ruleContextDecl EOF ;
    public final EObject entryRuleContextDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDecl = null;


        try {
            // InternalDomainmodel.g:510:52: (iv_ruleContextDecl= ruleContextDecl EOF )
            // InternalDomainmodel.g:511:2: iv_ruleContextDecl= ruleContextDecl EOF
            {
             newCompositeNode(grammarAccess.getContextDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextDecl=ruleContextDecl();

            state._fsp--;

             current =iv_ruleContextDecl; 
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
    // $ANTLR end "entryRuleContextDecl"


    // $ANTLR start "ruleContextDecl"
    // InternalDomainmodel.g:517:1: ruleContextDecl returns [EObject current=null] : ( ( ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) ) ) otherlv_1= 'context' otherlv_2= '{' otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ( ( (lv_ops_7_0= ruleOperationDecl ) ) | ( (lv_events_8_0= ruleEventDecl ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleContextDecl() throws RecognitionException {
        EObject current = null;

        Token lv_kind_0_1=null;
        Token lv_kind_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_ops_7_0 = null;

        EObject lv_events_8_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:523:2: ( ( ( ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) ) ) otherlv_1= 'context' otherlv_2= '{' otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ( ( (lv_ops_7_0= ruleOperationDecl ) ) | ( (lv_events_8_0= ruleEventDecl ) ) )* otherlv_9= '}' ) )
            // InternalDomainmodel.g:524:2: ( ( ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) ) ) otherlv_1= 'context' otherlv_2= '{' otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ( ( (lv_ops_7_0= ruleOperationDecl ) ) | ( (lv_events_8_0= ruleEventDecl ) ) )* otherlv_9= '}' )
            {
            // InternalDomainmodel.g:524:2: ( ( ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) ) ) otherlv_1= 'context' otherlv_2= '{' otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ( ( (lv_ops_7_0= ruleOperationDecl ) ) | ( (lv_events_8_0= ruleEventDecl ) ) )* otherlv_9= '}' )
            // InternalDomainmodel.g:525:3: ( ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) ) ) otherlv_1= 'context' otherlv_2= '{' otherlv_3= 'uses' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* ( ( (lv_ops_7_0= ruleOperationDecl ) ) | ( (lv_events_8_0= ruleEventDecl ) ) )* otherlv_9= '}'
            {
            // InternalDomainmodel.g:525:3: ( ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) ) )
            // InternalDomainmodel.g:526:4: ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) )
            {
            // InternalDomainmodel.g:526:4: ( (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' ) )
            // InternalDomainmodel.g:527:5: (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' )
            {
            // InternalDomainmodel.g:527:5: (lv_kind_0_1= 'input' | lv_kind_0_2= 'output' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:528:6: lv_kind_0_1= 'input'
                    {
                    lv_kind_0_1=(Token)match(input,20,FOLLOW_17); 

                    						newLeafNode(lv_kind_0_1, grammarAccess.getContextDeclAccess().getKindInputKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextDeclRule());
                    						}
                    						setWithLastConsumed(current, "kind", lv_kind_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:539:6: lv_kind_0_2= 'output'
                    {
                    lv_kind_0_2=(Token)match(input,21,FOLLOW_17); 

                    						newLeafNode(lv_kind_0_2, grammarAccess.getContextDeclAccess().getKindOutputKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextDeclRule());
                    						}
                    						setWithLastConsumed(current, "kind", lv_kind_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getContextDeclAccess().getContextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getContextDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getContextDeclAccess().getUsesKeyword_3());
            		
            // InternalDomainmodel.g:564:3: ( (otherlv_4= RULE_ID ) )
            // InternalDomainmodel.g:565:4: (otherlv_4= RULE_ID )
            {
            // InternalDomainmodel.g:565:4: (otherlv_4= RULE_ID )
            // InternalDomainmodel.g:566:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextDeclRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_4, grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceCrossReference_4_0());
            				

            }


            }

            // InternalDomainmodel.g:577:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDomainmodel.g:578:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getContextDeclAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalDomainmodel.g:582:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalDomainmodel.g:583:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalDomainmodel.g:583:5: (otherlv_6= RULE_ID )
            	    // InternalDomainmodel.g:584:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContextDeclRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_6, grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceCrossReference_5_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDomainmodel.g:596:3: ( ( (lv_ops_7_0= ruleOperationDecl ) ) | ( (lv_events_8_0= ruleEventDecl ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }
                else if ( (LA12_0==18) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDomainmodel.g:597:4: ( (lv_ops_7_0= ruleOperationDecl ) )
            	    {
            	    // InternalDomainmodel.g:597:4: ( (lv_ops_7_0= ruleOperationDecl ) )
            	    // InternalDomainmodel.g:598:5: (lv_ops_7_0= ruleOperationDecl )
            	    {
            	    // InternalDomainmodel.g:598:5: (lv_ops_7_0= ruleOperationDecl )
            	    // InternalDomainmodel.g:599:6: lv_ops_7_0= ruleOperationDecl
            	    {

            	    						newCompositeNode(grammarAccess.getContextDeclAccess().getOpsOperationDeclParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_ops_7_0=ruleOperationDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContextDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ops",
            	    							lv_ops_7_0,
            	    							"org.example.domainmodel.Domainmodel.OperationDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDomainmodel.g:617:4: ( (lv_events_8_0= ruleEventDecl ) )
            	    {
            	    // InternalDomainmodel.g:617:4: ( (lv_events_8_0= ruleEventDecl ) )
            	    // InternalDomainmodel.g:618:5: (lv_events_8_0= ruleEventDecl )
            	    {
            	    // InternalDomainmodel.g:618:5: (lv_events_8_0= ruleEventDecl )
            	    // InternalDomainmodel.g:619:6: lv_events_8_0= ruleEventDecl
            	    {

            	    						newCompositeNode(grammarAccess.getContextDeclAccess().getEventsEventDeclParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_events_8_0=ruleEventDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContextDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_8_0,
            	    							"org.example.domainmodel.Domainmodel.EventDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContextDeclAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleContextDecl"


    // $ANTLR start "entryRuleConstant"
    // InternalDomainmodel.g:645:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalDomainmodel.g:645:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalDomainmodel.g:646:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalDomainmodel.g:652:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:658:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) ) )
            // InternalDomainmodel.g:659:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            {
            // InternalDomainmodel.g:659:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) )
            // InternalDomainmodel.g:660:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstKeyword_0());
            		
            // InternalDomainmodel.g:664:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:665:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:665:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:666:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getColonKeyword_2());
            		
            // InternalDomainmodel.g:686:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDomainmodel.g:687:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDomainmodel.g:687:4: (lv_type_3_0= ruleDataType )
            // InternalDomainmodel.g:688:5: lv_type_3_0= ruleDataType
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


    // $ANTLR start "entryRuleVariable"
    // InternalDomainmodel.g:709:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDomainmodel.g:709:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDomainmodel.g:710:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDomainmodel.g:716:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_initialValue_5_0=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:722:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) ) )? ) )
            // InternalDomainmodel.g:723:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) ) )? )
            {
            // InternalDomainmodel.g:723:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) ) )? )
            // InternalDomainmodel.g:724:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalDomainmodel.g:728:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:729:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:729:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:730:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            // InternalDomainmodel.g:750:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDomainmodel.g:751:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDomainmodel.g:751:4: (lv_type_3_0= ruleDataType )
            // InternalDomainmodel.g:752:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalDomainmodel.g:769:3: (otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomainmodel.g:770:4: otherlv_4= '=' ( (lv_initialValue_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalDomainmodel.g:774:4: ( (lv_initialValue_5_0= RULE_INT ) )
                    // InternalDomainmodel.g:775:5: (lv_initialValue_5_0= RULE_INT )
                    {
                    // InternalDomainmodel.g:775:5: (lv_initialValue_5_0= RULE_INT )
                    // InternalDomainmodel.g:776:6: lv_initialValue_5_0= RULE_INT
                    {
                    lv_initialValue_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_initialValue_5_0, grammarAccess.getVariableAccess().getInitialValueINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"initialValue",
                    							lv_initialValue_5_0,
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleClock"
    // InternalDomainmodel.g:797:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalDomainmodel.g:797:46: (iv_ruleClock= ruleClock EOF )
            // InternalDomainmodel.g:798:2: iv_ruleClock= ruleClock EOF
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
    // InternalDomainmodel.g:804:1: ruleClock returns [EObject current=null] : (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_initialValue_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:810:2: ( (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? ) )
            // InternalDomainmodel.g:811:2: (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? )
            {
            // InternalDomainmodel.g:811:2: (otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )? )
            // InternalDomainmodel.g:812:3: otherlv_0= 'clock' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClockAccess().getClockKeyword_0());
            		
            // InternalDomainmodel.g:816:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:817:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:817:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:818:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalDomainmodel.g:834:3: (otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomainmodel.g:835:4: otherlv_2= '=' ( (lv_initialValue_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getClockAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalDomainmodel.g:839:4: ( (lv_initialValue_3_0= RULE_INT ) )
                    // InternalDomainmodel.g:840:5: (lv_initialValue_3_0= RULE_INT )
                    {
                    // InternalDomainmodel.g:840:5: (lv_initialValue_3_0= RULE_INT )
                    // InternalDomainmodel.g:841:6: lv_initialValue_3_0= RULE_INT
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


    // $ANTLR start "entryRuleCycleDef"
    // InternalDomainmodel.g:862:1: entryRuleCycleDef returns [EObject current=null] : iv_ruleCycleDef= ruleCycleDef EOF ;
    public final EObject entryRuleCycleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCycleDef = null;


        try {
            // InternalDomainmodel.g:862:49: (iv_ruleCycleDef= ruleCycleDef EOF )
            // InternalDomainmodel.g:863:2: iv_ruleCycleDef= ruleCycleDef EOF
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
    // InternalDomainmodel.g:869:1: ruleCycleDef returns [EObject current=null] : (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleCycleDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:875:2: ( (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalDomainmodel.g:876:2: (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalDomainmodel.g:876:2: (otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalDomainmodel.g:877:3: otherlv_0= 'cycleDef' otherlv_1= 'cycle' otherlv_2= '==' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getCycleDefAccess().getCycleDefKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getCycleDefAccess().getCycleKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCycleDefAccess().getEqualsSignEqualsSignKeyword_2());
            		
            // InternalDomainmodel.g:889:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalDomainmodel.g:890:4: (lv_value_3_0= RULE_INT )
            {
            // InternalDomainmodel.g:890:4: (lv_value_3_0= RULE_INT )
            // InternalDomainmodel.g:891:5: lv_value_3_0= RULE_INT
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


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:911:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:917:2: ( ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) )
            // InternalDomainmodel.g:918:2: ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            {
            // InternalDomainmodel.g:918:2: ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 34:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDomainmodel.g:919:3: (enumLiteral_0= 'NAT' )
                    {
                    // InternalDomainmodel.g:919:3: (enumLiteral_0= 'NAT' )
                    // InternalDomainmodel.g:920:4: enumLiteral_0= 'NAT'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:927:3: (enumLiteral_1= 'INT' )
                    {
                    // InternalDomainmodel.g:927:3: (enumLiteral_1= 'INT' )
                    // InternalDomainmodel.g:928:4: enumLiteral_1= 'INT'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:935:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDomainmodel.g:935:3: (enumLiteral_2= 'REAL' )
                    // InternalDomainmodel.g:936:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:943:3: (enumLiteral_3= 'BOOL' )
                    {
                    // InternalDomainmodel.g:943:3: (enumLiteral_3= 'BOOL' )
                    // InternalDomainmodel.g:944:4: enumLiteral_3= 'BOOL'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001B302000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000B302000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000A302000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008302000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000052010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}