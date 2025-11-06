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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stm'", "'{'", "'}'", "'var'", "':'", "'='", "'NAT'", "'INT'", "'REAL'", "'true'", "'false'", "'BOOL'"
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalDomainmodel.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'stm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variables_3_0 = null;



        	enterRule();

        try {
            // InternalDomainmodel.g:78:2: ( (otherlv_0= 'stm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= '}' ) )
            // InternalDomainmodel.g:79:2: (otherlv_0= 'stm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= '}' )
            {
            // InternalDomainmodel.g:79:2: (otherlv_0= 'stm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= '}' )
            // InternalDomainmodel.g:80:3: otherlv_0= 'stm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_variables_3_0= ruleVariable ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getStmKeyword_0());
            		
            // InternalDomainmodel.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDomainmodel.g:106:3: ( (lv_variables_3_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:107:4: (lv_variables_3_0= ruleVariable )
            	    {
            	    // InternalDomainmodel.g:107:4: (lv_variables_3_0= ruleVariable )
            	    // InternalDomainmodel.g:108:5: lv_variables_3_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_variables_3_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_3_0,
            	    						"org.example.domainmodel.Domainmodel.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDomainmodel.g:133:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalDomainmodel.g:133:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalDomainmodel.g:134:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalDomainmodel.g:140:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? ) ;
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
            // InternalDomainmodel.g:146:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? ) )
            // InternalDomainmodel.g:147:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? )
            {
            // InternalDomainmodel.g:147:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )? )
            // InternalDomainmodel.g:148:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDataType ) ) (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalDomainmodel.g:152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDomainmodel.g:153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDomainmodel.g:153:4: (lv_name_1_0= RULE_ID )
            // InternalDomainmodel.g:154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            // InternalDomainmodel.g:174:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalDomainmodel.g:175:4: (lv_type_3_0= ruleDataType )
            {
            // InternalDomainmodel.g:175:4: (lv_type_3_0= ruleDataType )
            // InternalDomainmodel.g:176:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalDomainmodel.g:193:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:194:4: otherlv_4= '=' ( (lv_initialValue_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalDomainmodel.g:198:4: ( (lv_initialValue_5_0= ruleValue ) )
                    // InternalDomainmodel.g:199:5: (lv_initialValue_5_0= ruleValue )
                    {
                    // InternalDomainmodel.g:199:5: (lv_initialValue_5_0= ruleValue )
                    // InternalDomainmodel.g:200:6: lv_initialValue_5_0= ruleValue
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


    // $ANTLR start "entryRuleValue"
    // InternalDomainmodel.g:222:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalDomainmodel.g:222:46: (iv_ruleValue= ruleValue EOF )
            // InternalDomainmodel.g:223:2: iv_ruleValue= ruleValue EOF
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
    // InternalDomainmodel.g:229:1: ruleValue returns [EObject current=null] : ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:235:2: ( ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) ) )
            // InternalDomainmodel.g:236:2: ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) )
            {
            // InternalDomainmodel.g:236:2: ( ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) ) )
            // InternalDomainmodel.g:237:3: ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) )
            {
            // InternalDomainmodel.g:237:3: ( (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' ) )
            // InternalDomainmodel.g:238:4: (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' )
            {
            // InternalDomainmodel.g:238:4: (lv_value_0_1= 'NAT' | lv_value_0_2= 'INT' | lv_value_0_3= 'REAL' | lv_value_0_4= 'true' | lv_value_0_5= 'false' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:239:5: lv_value_0_1= 'NAT'
                    {
                    lv_value_0_1=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getValueAccess().getValueNATKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:250:5: lv_value_0_2= 'INT'
                    {
                    lv_value_0_2=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getValueAccess().getValueINTKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:261:5: lv_value_0_3= 'REAL'
                    {
                    lv_value_0_3=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getValueAccess().getValueREALKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:272:5: lv_value_0_4= 'true'
                    {
                    lv_value_0_4=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getValueAccess().getValueTrueKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:283:5: lv_value_0_5= 'false'
                    {
                    lv_value_0_5=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDomainmodel.g:299:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomainmodel.g:305:2: ( ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) ) )
            // InternalDomainmodel.g:306:2: ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            {
            // InternalDomainmodel.g:306:2: ( (enumLiteral_0= 'NAT' ) | (enumLiteral_1= 'INT' ) | (enumLiteral_2= 'REAL' ) | (enumLiteral_3= 'BOOL' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:307:3: (enumLiteral_0= 'NAT' )
                    {
                    // InternalDomainmodel.g:307:3: (enumLiteral_0= 'NAT' )
                    // InternalDomainmodel.g:308:4: enumLiteral_0= 'NAT'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:315:3: (enumLiteral_1= 'INT' )
                    {
                    // InternalDomainmodel.g:315:3: (enumLiteral_1= 'INT' )
                    // InternalDomainmodel.g:316:4: enumLiteral_1= 'INT'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:323:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDomainmodel.g:323:3: (enumLiteral_2= 'REAL' )
                    // InternalDomainmodel.g:324:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:331:3: (enumLiteral_3= 'BOOL' )
                    {
                    // InternalDomainmodel.g:331:3: (enumLiteral_3= 'BOOL' )
                    // InternalDomainmodel.g:332:4: enumLiteral_3= 'BOOL'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000004E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E0000L});

}