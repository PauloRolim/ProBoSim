package org.example.domainmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NAT'", "'INT'", "'REAL'", "'true'", "'false'", "'BOOL'", "'interface'", "'{'", "'}'", "'stm'", "'var'", "':'", "'='", "'const'", "'cycleDef'", "'cycle'", "'=='", "'clock'", "'event'"
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

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDomainmodel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleModel EOF )
            // InternalDomainmodel.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainmodel.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDomainmodel.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDomainmodel.g:69:3: ( rule__Model__Group__0 )
            // InternalDomainmodel.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariable"
    // InternalDomainmodel.g:78:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleVariable EOF )
            // InternalDomainmodel.g:80:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalDomainmodel.g:87:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Variable__Group__0 ) )
            // InternalDomainmodel.g:93:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalDomainmodel.g:94:3: ( rule__Variable__Group__0 )
            // InternalDomainmodel.g:94:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleConstant"
    // InternalDomainmodel.g:103:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleConstant EOF )
            // InternalDomainmodel.g:105:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalDomainmodel.g:112:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__Constant__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__Constant__Group__0 )
            // InternalDomainmodel.g:119:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleCycleDef"
    // InternalDomainmodel.g:128:1: entryRuleCycleDef : ruleCycleDef EOF ;
    public final void entryRuleCycleDef() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleCycleDef EOF )
            // InternalDomainmodel.g:130:1: ruleCycleDef EOF
            {
             before(grammarAccess.getCycleDefRule()); 
            pushFollow(FOLLOW_1);
            ruleCycleDef();

            state._fsp--;

             after(grammarAccess.getCycleDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCycleDef"


    // $ANTLR start "ruleCycleDef"
    // InternalDomainmodel.g:137:1: ruleCycleDef : ( ( rule__CycleDef__Group__0 ) ) ;
    public final void ruleCycleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__CycleDef__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__CycleDef__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__CycleDef__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__CycleDef__Group__0 )
            {
             before(grammarAccess.getCycleDefAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__CycleDef__Group__0 )
            // InternalDomainmodel.g:144:4: rule__CycleDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CycleDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCycleDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCycleDef"


    // $ANTLR start "entryRuleClock"
    // InternalDomainmodel.g:153:1: entryRuleClock : ruleClock EOF ;
    public final void entryRuleClock() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleClock EOF )
            // InternalDomainmodel.g:155:1: ruleClock EOF
            {
             before(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            ruleClock();

            state._fsp--;

             after(grammarAccess.getClockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalDomainmodel.g:162:1: ruleClock : ( ( rule__Clock__Group__0 ) ) ;
    public final void ruleClock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Clock__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Clock__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Clock__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__Clock__Group__0 )
            {
             before(grammarAccess.getClockAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__Clock__Group__0 )
            // InternalDomainmodel.g:169:4: rule__Clock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleEventDecl"
    // InternalDomainmodel.g:178:1: entryRuleEventDecl : ruleEventDecl EOF ;
    public final void entryRuleEventDecl() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleEventDecl EOF )
            // InternalDomainmodel.g:180:1: ruleEventDecl EOF
            {
             before(grammarAccess.getEventDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleEventDecl();

            state._fsp--;

             after(grammarAccess.getEventDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventDecl"


    // $ANTLR start "ruleEventDecl"
    // InternalDomainmodel.g:187:1: ruleEventDecl : ( ( rule__EventDecl__Group__0 ) ) ;
    public final void ruleEventDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__EventDecl__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__EventDecl__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__EventDecl__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__EventDecl__Group__0 )
            {
             before(grammarAccess.getEventDeclAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__EventDecl__Group__0 )
            // InternalDomainmodel.g:194:4: rule__EventDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventDecl"


    // $ANTLR start "entryRuleValue"
    // InternalDomainmodel.g:203:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleValue EOF )
            // InternalDomainmodel.g:205:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDomainmodel.g:212:1: ruleValue : ( ( rule__Value__ValueAssignment ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__Value__ValueAssignment ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__Value__ValueAssignment ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__Value__ValueAssignment ) )
            // InternalDomainmodel.g:218:3: ( rule__Value__ValueAssignment )
            {
             before(grammarAccess.getValueAccess().getValueAssignment()); 
            // InternalDomainmodel.g:219:3: ( rule__Value__ValueAssignment )
            // InternalDomainmodel.g:219:4: rule__Value__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:228:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:232:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDomainmodel.g:233:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDomainmodel.g:233:2: ( ( rule__DataType__Alternatives ) )
            // InternalDomainmodel.g:234:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:235:3: ( rule__DataType__Alternatives )
            // InternalDomainmodel.g:235:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Model__Alternatives_9"
    // InternalDomainmodel.g:243:1: rule__Model__Alternatives_9 : ( ( ( rule__Model__ConstantsAssignment_9_0 ) ) | ( ( rule__Model__VariablesAssignment_9_1 ) ) | ( ( rule__Model__ClockAssignment_9_2 ) ) );
    public final void rule__Model__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:247:1: ( ( ( rule__Model__ConstantsAssignment_9_0 ) ) | ( ( rule__Model__VariablesAssignment_9_1 ) ) | ( ( rule__Model__ClockAssignment_9_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:248:2: ( ( rule__Model__ConstantsAssignment_9_0 ) )
                    {
                    // InternalDomainmodel.g:248:2: ( ( rule__Model__ConstantsAssignment_9_0 ) )
                    // InternalDomainmodel.g:249:3: ( rule__Model__ConstantsAssignment_9_0 )
                    {
                     before(grammarAccess.getModelAccess().getConstantsAssignment_9_0()); 
                    // InternalDomainmodel.g:250:3: ( rule__Model__ConstantsAssignment_9_0 )
                    // InternalDomainmodel.g:250:4: rule__Model__ConstantsAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ConstantsAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getConstantsAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:254:2: ( ( rule__Model__VariablesAssignment_9_1 ) )
                    {
                    // InternalDomainmodel.g:254:2: ( ( rule__Model__VariablesAssignment_9_1 ) )
                    // InternalDomainmodel.g:255:3: ( rule__Model__VariablesAssignment_9_1 )
                    {
                     before(grammarAccess.getModelAccess().getVariablesAssignment_9_1()); 
                    // InternalDomainmodel.g:256:3: ( rule__Model__VariablesAssignment_9_1 )
                    // InternalDomainmodel.g:256:4: rule__Model__VariablesAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__VariablesAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getVariablesAssignment_9_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:260:2: ( ( rule__Model__ClockAssignment_9_2 ) )
                    {
                    // InternalDomainmodel.g:260:2: ( ( rule__Model__ClockAssignment_9_2 ) )
                    // InternalDomainmodel.g:261:3: ( rule__Model__ClockAssignment_9_2 )
                    {
                     before(grammarAccess.getModelAccess().getClockAssignment_9_2()); 
                    // InternalDomainmodel.g:262:3: ( rule__Model__ClockAssignment_9_2 )
                    // InternalDomainmodel.g:262:4: rule__Model__ClockAssignment_9_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ClockAssignment_9_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getClockAssignment_9_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_9"


    // $ANTLR start "rule__Value__ValueAlternatives_0"
    // InternalDomainmodel.g:270:1: rule__Value__ValueAlternatives_0 : ( ( 'NAT' ) | ( 'INT' ) | ( 'REAL' ) | ( 'true' ) | ( 'false' ) );
    public final void rule__Value__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:274:1: ( ( 'NAT' ) | ( 'INT' ) | ( 'REAL' ) | ( 'true' ) | ( 'false' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:275:2: ( 'NAT' )
                    {
                    // InternalDomainmodel.g:275:2: ( 'NAT' )
                    // InternalDomainmodel.g:276:3: 'NAT'
                    {
                     before(grammarAccess.getValueAccess().getValueNATKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueNATKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:281:2: ( 'INT' )
                    {
                    // InternalDomainmodel.g:281:2: ( 'INT' )
                    // InternalDomainmodel.g:282:3: 'INT'
                    {
                     before(grammarAccess.getValueAccess().getValueINTKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueINTKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:287:2: ( 'REAL' )
                    {
                    // InternalDomainmodel.g:287:2: ( 'REAL' )
                    // InternalDomainmodel.g:288:3: 'REAL'
                    {
                     before(grammarAccess.getValueAccess().getValueREALKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueREALKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:293:2: ( 'true' )
                    {
                    // InternalDomainmodel.g:293:2: ( 'true' )
                    // InternalDomainmodel.g:294:3: 'true'
                    {
                     before(grammarAccess.getValueAccess().getValueTrueKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueTrueKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:299:2: ( 'false' )
                    {
                    // InternalDomainmodel.g:299:2: ( 'false' )
                    // InternalDomainmodel.g:300:3: 'false'
                    {
                     before(grammarAccess.getValueAccess().getValueFalseKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueFalseKeyword_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAlternatives_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalDomainmodel.g:309:1: rule__DataType__Alternatives : ( ( ( 'NAT' ) ) | ( ( 'INT' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:313:1: ( ( ( 'NAT' ) ) | ( ( 'INT' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:314:2: ( ( 'NAT' ) )
                    {
                    // InternalDomainmodel.g:314:2: ( ( 'NAT' ) )
                    // InternalDomainmodel.g:315:3: ( 'NAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0()); 
                    // InternalDomainmodel.g:316:3: ( 'NAT' )
                    // InternalDomainmodel.g:316:4: 'NAT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:320:2: ( ( 'INT' ) )
                    {
                    // InternalDomainmodel.g:320:2: ( ( 'INT' ) )
                    // InternalDomainmodel.g:321:3: ( 'INT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalDomainmodel.g:322:3: ( 'INT' )
                    // InternalDomainmodel.g:322:4: 'INT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:326:2: ( ( 'REAL' ) )
                    {
                    // InternalDomainmodel.g:326:2: ( ( 'REAL' ) )
                    // InternalDomainmodel.g:327:3: ( 'REAL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDomainmodel.g:328:3: ( 'REAL' )
                    // InternalDomainmodel.g:328:4: 'REAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:332:2: ( ( 'BOOL' ) )
                    {
                    // InternalDomainmodel.g:332:2: ( ( 'BOOL' ) )
                    // InternalDomainmodel.g:333:3: ( 'BOOL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_3()); 
                    // InternalDomainmodel.g:334:3: ( 'BOOL' )
                    // InternalDomainmodel.g:334:4: 'BOOL'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDomainmodel.g:342:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:346:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDomainmodel.g:347:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDomainmodel.g:354:1: rule__Model__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:358:1: ( ( 'interface' ) )
            // InternalDomainmodel.g:359:1: ( 'interface' )
            {
            // InternalDomainmodel.g:359:1: ( 'interface' )
            // InternalDomainmodel.g:360:2: 'interface'
            {
             before(grammarAccess.getModelAccess().getInterfaceKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDomainmodel.g:369:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:373:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDomainmodel.g:374:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDomainmodel.g:381:1: rule__Model__Group__1__Impl : ( ( rule__Model__InterfaceAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:385:1: ( ( ( rule__Model__InterfaceAssignment_1 ) ) )
            // InternalDomainmodel.g:386:1: ( ( rule__Model__InterfaceAssignment_1 ) )
            {
            // InternalDomainmodel.g:386:1: ( ( rule__Model__InterfaceAssignment_1 ) )
            // InternalDomainmodel.g:387:2: ( rule__Model__InterfaceAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getInterfaceAssignment_1()); 
            // InternalDomainmodel.g:388:2: ( rule__Model__InterfaceAssignment_1 )
            // InternalDomainmodel.g:388:3: rule__Model__InterfaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__InterfaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getInterfaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDomainmodel.g:396:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:400:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDomainmodel.g:401:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDomainmodel.g:408:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:412:1: ( ( '{' ) )
            // InternalDomainmodel.g:413:1: ( '{' )
            {
            // InternalDomainmodel.g:413:1: ( '{' )
            // InternalDomainmodel.g:414:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalDomainmodel.g:423:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:427:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDomainmodel.g:428:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalDomainmodel.g:435:1: rule__Model__Group__3__Impl : ( ( rule__Model__EventsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:439:1: ( ( ( rule__Model__EventsAssignment_3 )* ) )
            // InternalDomainmodel.g:440:1: ( ( rule__Model__EventsAssignment_3 )* )
            {
            // InternalDomainmodel.g:440:1: ( ( rule__Model__EventsAssignment_3 )* )
            // InternalDomainmodel.g:441:2: ( rule__Model__EventsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getEventsAssignment_3()); 
            // InternalDomainmodel.g:442:2: ( rule__Model__EventsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomainmodel.g:442:3: rule__Model__EventsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__EventsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEventsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalDomainmodel.g:450:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:454:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalDomainmodel.g:455:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalDomainmodel.g:462:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:466:1: ( ( '}' ) )
            // InternalDomainmodel.g:467:1: ( '}' )
            {
            // InternalDomainmodel.g:467:1: ( '}' )
            // InternalDomainmodel.g:468:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalDomainmodel.g:477:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:481:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalDomainmodel.g:482:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalDomainmodel.g:489:1: rule__Model__Group__5__Impl : ( 'stm' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:493:1: ( ( 'stm' ) )
            // InternalDomainmodel.g:494:1: ( 'stm' )
            {
            // InternalDomainmodel.g:494:1: ( 'stm' )
            // InternalDomainmodel.g:495:2: 'stm'
            {
             before(grammarAccess.getModelAccess().getStmKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getStmKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalDomainmodel.g:504:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:508:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalDomainmodel.g:509:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalDomainmodel.g:516:1: rule__Model__Group__6__Impl : ( ( rule__Model__NameAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:520:1: ( ( ( rule__Model__NameAssignment_6 ) ) )
            // InternalDomainmodel.g:521:1: ( ( rule__Model__NameAssignment_6 ) )
            {
            // InternalDomainmodel.g:521:1: ( ( rule__Model__NameAssignment_6 ) )
            // InternalDomainmodel.g:522:2: ( rule__Model__NameAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_6()); 
            // InternalDomainmodel.g:523:2: ( rule__Model__NameAssignment_6 )
            // InternalDomainmodel.g:523:3: rule__Model__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalDomainmodel.g:531:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:535:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalDomainmodel.g:536:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalDomainmodel.g:543:1: rule__Model__Group__7__Impl : ( '{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:547:1: ( ( '{' ) )
            // InternalDomainmodel.g:548:1: ( '{' )
            {
            // InternalDomainmodel.g:548:1: ( '{' )
            // InternalDomainmodel.g:549:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalDomainmodel.g:558:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:562:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalDomainmodel.g:563:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalDomainmodel.g:570:1: rule__Model__Group__8__Impl : ( ( rule__Model__CycleDefAssignment_8 )? ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:574:1: ( ( ( rule__Model__CycleDefAssignment_8 )? ) )
            // InternalDomainmodel.g:575:1: ( ( rule__Model__CycleDefAssignment_8 )? )
            {
            // InternalDomainmodel.g:575:1: ( ( rule__Model__CycleDefAssignment_8 )? )
            // InternalDomainmodel.g:576:2: ( rule__Model__CycleDefAssignment_8 )?
            {
             before(grammarAccess.getModelAccess().getCycleDefAssignment_8()); 
            // InternalDomainmodel.g:577:2: ( rule__Model__CycleDefAssignment_8 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:577:3: rule__Model__CycleDefAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__CycleDefAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getCycleDefAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalDomainmodel.g:585:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:589:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalDomainmodel.g:590:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalDomainmodel.g:597:1: rule__Model__Group__9__Impl : ( ( rule__Model__Alternatives_9 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:601:1: ( ( ( rule__Model__Alternatives_9 )* ) )
            // InternalDomainmodel.g:602:1: ( ( rule__Model__Alternatives_9 )* )
            {
            // InternalDomainmodel.g:602:1: ( ( rule__Model__Alternatives_9 )* )
            // InternalDomainmodel.g:603:2: ( rule__Model__Alternatives_9 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_9()); 
            // InternalDomainmodel.g:604:2: ( rule__Model__Alternatives_9 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21||LA6_0==24||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:604:3: rule__Model__Alternatives_9
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__Alternatives_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalDomainmodel.g:612:1: rule__Model__Group__10 : rule__Model__Group__10__Impl ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:616:1: ( rule__Model__Group__10__Impl )
            // InternalDomainmodel.g:617:2: rule__Model__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalDomainmodel.g:623:1: rule__Model__Group__10__Impl : ( '}' ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:627:1: ( ( '}' ) )
            // InternalDomainmodel.g:628:1: ( '}' )
            {
            // InternalDomainmodel.g:628:1: ( '}' )
            // InternalDomainmodel.g:629:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalDomainmodel.g:639:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:643:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalDomainmodel.g:644:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalDomainmodel.g:651:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:655:1: ( ( 'var' ) )
            // InternalDomainmodel.g:656:1: ( 'var' )
            {
            // InternalDomainmodel.g:656:1: ( 'var' )
            // InternalDomainmodel.g:657:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalDomainmodel.g:666:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:670:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalDomainmodel.g:671:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalDomainmodel.g:678:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:682:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:683:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:683:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalDomainmodel.g:684:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:685:2: ( rule__Variable__NameAssignment_1 )
            // InternalDomainmodel.g:685:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalDomainmodel.g:693:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:697:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalDomainmodel.g:698:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalDomainmodel.g:705:1: rule__Variable__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:709:1: ( ( ':' ) )
            // InternalDomainmodel.g:710:1: ( ':' )
            {
            // InternalDomainmodel.g:710:1: ( ':' )
            // InternalDomainmodel.g:711:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalDomainmodel.g:720:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:724:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalDomainmodel.g:725:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalDomainmodel.g:732:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__TypeAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:736:1: ( ( ( rule__Variable__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:737:1: ( ( rule__Variable__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:737:1: ( ( rule__Variable__TypeAssignment_3 ) )
            // InternalDomainmodel.g:738:2: ( rule__Variable__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:739:2: ( rule__Variable__TypeAssignment_3 )
            // InternalDomainmodel.g:739:3: rule__Variable__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalDomainmodel.g:747:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:751:1: ( rule__Variable__Group__4__Impl )
            // InternalDomainmodel.g:752:2: rule__Variable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalDomainmodel.g:758:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:762:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalDomainmodel.g:763:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalDomainmodel.g:763:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalDomainmodel.g:764:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalDomainmodel.g:765:2: ( rule__Variable__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:765:3: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group_4__0"
    // InternalDomainmodel.g:774:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:778:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalDomainmodel.g:779:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Variable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0"


    // $ANTLR start "rule__Variable__Group_4__0__Impl"
    // InternalDomainmodel.g:786:1: rule__Variable__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:790:1: ( ( '=' ) )
            // InternalDomainmodel.g:791:1: ( '=' )
            {
            // InternalDomainmodel.g:791:1: ( '=' )
            // InternalDomainmodel.g:792:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_4__1"
    // InternalDomainmodel.g:801:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:805:1: ( rule__Variable__Group_4__1__Impl )
            // InternalDomainmodel.g:806:2: rule__Variable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1"


    // $ANTLR start "rule__Variable__Group_4__1__Impl"
    // InternalDomainmodel.g:812:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__InitialValueAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:816:1: ( ( ( rule__Variable__InitialValueAssignment_4_1 ) ) )
            // InternalDomainmodel.g:817:1: ( ( rule__Variable__InitialValueAssignment_4_1 ) )
            {
            // InternalDomainmodel.g:817:1: ( ( rule__Variable__InitialValueAssignment_4_1 ) )
            // InternalDomainmodel.g:818:2: ( rule__Variable__InitialValueAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_4_1()); 
            // InternalDomainmodel.g:819:2: ( rule__Variable__InitialValueAssignment_4_1 )
            // InternalDomainmodel.g:819:3: rule__Variable__InitialValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__InitialValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getInitialValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalDomainmodel.g:828:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:832:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalDomainmodel.g:833:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalDomainmodel.g:840:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:844:1: ( ( 'const' ) )
            // InternalDomainmodel.g:845:1: ( 'const' )
            {
            // InternalDomainmodel.g:845:1: ( 'const' )
            // InternalDomainmodel.g:846:2: 'const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalDomainmodel.g:855:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:859:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalDomainmodel.g:860:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalDomainmodel.g:867:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:871:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:872:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:872:1: ( ( rule__Constant__NameAssignment_1 ) )
            // InternalDomainmodel.g:873:2: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:874:2: ( rule__Constant__NameAssignment_1 )
            // InternalDomainmodel.g:874:3: rule__Constant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalDomainmodel.g:882:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:886:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalDomainmodel.g:887:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Constant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalDomainmodel.g:894:1: rule__Constant__Group__2__Impl : ( ':' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:898:1: ( ( ':' ) )
            // InternalDomainmodel.g:899:1: ( ':' )
            {
            // InternalDomainmodel.g:899:1: ( ':' )
            // InternalDomainmodel.g:900:2: ':'
            {
             before(grammarAccess.getConstantAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__Constant__Group__3"
    // InternalDomainmodel.g:909:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:913:1: ( rule__Constant__Group__3__Impl )
            // InternalDomainmodel.g:914:2: rule__Constant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3"


    // $ANTLR start "rule__Constant__Group__3__Impl"
    // InternalDomainmodel.g:920:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__TypeAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:924:1: ( ( ( rule__Constant__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:925:1: ( ( rule__Constant__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:925:1: ( ( rule__Constant__TypeAssignment_3 ) )
            // InternalDomainmodel.g:926:2: ( rule__Constant__TypeAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:927:2: ( rule__Constant__TypeAssignment_3 )
            // InternalDomainmodel.g:927:3: rule__Constant__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constant__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__3__Impl"


    // $ANTLR start "rule__CycleDef__Group__0"
    // InternalDomainmodel.g:936:1: rule__CycleDef__Group__0 : rule__CycleDef__Group__0__Impl rule__CycleDef__Group__1 ;
    public final void rule__CycleDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:940:1: ( rule__CycleDef__Group__0__Impl rule__CycleDef__Group__1 )
            // InternalDomainmodel.g:941:2: rule__CycleDef__Group__0__Impl rule__CycleDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CycleDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CycleDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__0"


    // $ANTLR start "rule__CycleDef__Group__0__Impl"
    // InternalDomainmodel.g:948:1: rule__CycleDef__Group__0__Impl : ( 'cycleDef' ) ;
    public final void rule__CycleDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:952:1: ( ( 'cycleDef' ) )
            // InternalDomainmodel.g:953:1: ( 'cycleDef' )
            {
            // InternalDomainmodel.g:953:1: ( 'cycleDef' )
            // InternalDomainmodel.g:954:2: 'cycleDef'
            {
             before(grammarAccess.getCycleDefAccess().getCycleDefKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCycleDefAccess().getCycleDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__0__Impl"


    // $ANTLR start "rule__CycleDef__Group__1"
    // InternalDomainmodel.g:963:1: rule__CycleDef__Group__1 : rule__CycleDef__Group__1__Impl rule__CycleDef__Group__2 ;
    public final void rule__CycleDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:967:1: ( rule__CycleDef__Group__1__Impl rule__CycleDef__Group__2 )
            // InternalDomainmodel.g:968:2: rule__CycleDef__Group__1__Impl rule__CycleDef__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CycleDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CycleDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__1"


    // $ANTLR start "rule__CycleDef__Group__1__Impl"
    // InternalDomainmodel.g:975:1: rule__CycleDef__Group__1__Impl : ( 'cycle' ) ;
    public final void rule__CycleDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:979:1: ( ( 'cycle' ) )
            // InternalDomainmodel.g:980:1: ( 'cycle' )
            {
            // InternalDomainmodel.g:980:1: ( 'cycle' )
            // InternalDomainmodel.g:981:2: 'cycle'
            {
             before(grammarAccess.getCycleDefAccess().getCycleKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCycleDefAccess().getCycleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__1__Impl"


    // $ANTLR start "rule__CycleDef__Group__2"
    // InternalDomainmodel.g:990:1: rule__CycleDef__Group__2 : rule__CycleDef__Group__2__Impl rule__CycleDef__Group__3 ;
    public final void rule__CycleDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:994:1: ( rule__CycleDef__Group__2__Impl rule__CycleDef__Group__3 )
            // InternalDomainmodel.g:995:2: rule__CycleDef__Group__2__Impl rule__CycleDef__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CycleDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CycleDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__2"


    // $ANTLR start "rule__CycleDef__Group__2__Impl"
    // InternalDomainmodel.g:1002:1: rule__CycleDef__Group__2__Impl : ( '==' ) ;
    public final void rule__CycleDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1006:1: ( ( '==' ) )
            // InternalDomainmodel.g:1007:1: ( '==' )
            {
            // InternalDomainmodel.g:1007:1: ( '==' )
            // InternalDomainmodel.g:1008:2: '=='
            {
             before(grammarAccess.getCycleDefAccess().getEqualsSignEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCycleDefAccess().getEqualsSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__2__Impl"


    // $ANTLR start "rule__CycleDef__Group__3"
    // InternalDomainmodel.g:1017:1: rule__CycleDef__Group__3 : rule__CycleDef__Group__3__Impl ;
    public final void rule__CycleDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1021:1: ( rule__CycleDef__Group__3__Impl )
            // InternalDomainmodel.g:1022:2: rule__CycleDef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CycleDef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__3"


    // $ANTLR start "rule__CycleDef__Group__3__Impl"
    // InternalDomainmodel.g:1028:1: rule__CycleDef__Group__3__Impl : ( ( rule__CycleDef__ValueAssignment_3 ) ) ;
    public final void rule__CycleDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1032:1: ( ( ( rule__CycleDef__ValueAssignment_3 ) ) )
            // InternalDomainmodel.g:1033:1: ( ( rule__CycleDef__ValueAssignment_3 ) )
            {
            // InternalDomainmodel.g:1033:1: ( ( rule__CycleDef__ValueAssignment_3 ) )
            // InternalDomainmodel.g:1034:2: ( rule__CycleDef__ValueAssignment_3 )
            {
             before(grammarAccess.getCycleDefAccess().getValueAssignment_3()); 
            // InternalDomainmodel.g:1035:2: ( rule__CycleDef__ValueAssignment_3 )
            // InternalDomainmodel.g:1035:3: rule__CycleDef__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CycleDef__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCycleDefAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__Group__3__Impl"


    // $ANTLR start "rule__Clock__Group__0"
    // InternalDomainmodel.g:1044:1: rule__Clock__Group__0 : rule__Clock__Group__0__Impl rule__Clock__Group__1 ;
    public final void rule__Clock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1048:1: ( rule__Clock__Group__0__Impl rule__Clock__Group__1 )
            // InternalDomainmodel.g:1049:2: rule__Clock__Group__0__Impl rule__Clock__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Clock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group__0"


    // $ANTLR start "rule__Clock__Group__0__Impl"
    // InternalDomainmodel.g:1056:1: rule__Clock__Group__0__Impl : ( 'clock' ) ;
    public final void rule__Clock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1060:1: ( ( 'clock' ) )
            // InternalDomainmodel.g:1061:1: ( 'clock' )
            {
            // InternalDomainmodel.g:1061:1: ( 'clock' )
            // InternalDomainmodel.g:1062:2: 'clock'
            {
             before(grammarAccess.getClockAccess().getClockKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClockAccess().getClockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group__0__Impl"


    // $ANTLR start "rule__Clock__Group__1"
    // InternalDomainmodel.g:1071:1: rule__Clock__Group__1 : rule__Clock__Group__1__Impl rule__Clock__Group__2 ;
    public final void rule__Clock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1075:1: ( rule__Clock__Group__1__Impl rule__Clock__Group__2 )
            // InternalDomainmodel.g:1076:2: rule__Clock__Group__1__Impl rule__Clock__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Clock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group__1"


    // $ANTLR start "rule__Clock__Group__1__Impl"
    // InternalDomainmodel.g:1083:1: rule__Clock__Group__1__Impl : ( ( rule__Clock__NameAssignment_1 ) ) ;
    public final void rule__Clock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1087:1: ( ( ( rule__Clock__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1088:1: ( ( rule__Clock__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1088:1: ( ( rule__Clock__NameAssignment_1 ) )
            // InternalDomainmodel.g:1089:2: ( rule__Clock__NameAssignment_1 )
            {
             before(grammarAccess.getClockAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1090:2: ( rule__Clock__NameAssignment_1 )
            // InternalDomainmodel.g:1090:3: rule__Clock__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group__1__Impl"


    // $ANTLR start "rule__Clock__Group__2"
    // InternalDomainmodel.g:1098:1: rule__Clock__Group__2 : rule__Clock__Group__2__Impl ;
    public final void rule__Clock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1102:1: ( rule__Clock__Group__2__Impl )
            // InternalDomainmodel.g:1103:2: rule__Clock__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clock__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group__2"


    // $ANTLR start "rule__Clock__Group__2__Impl"
    // InternalDomainmodel.g:1109:1: rule__Clock__Group__2__Impl : ( ( rule__Clock__Group_2__0 )? ) ;
    public final void rule__Clock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1113:1: ( ( ( rule__Clock__Group_2__0 )? ) )
            // InternalDomainmodel.g:1114:1: ( ( rule__Clock__Group_2__0 )? )
            {
            // InternalDomainmodel.g:1114:1: ( ( rule__Clock__Group_2__0 )? )
            // InternalDomainmodel.g:1115:2: ( rule__Clock__Group_2__0 )?
            {
             before(grammarAccess.getClockAccess().getGroup_2()); 
            // InternalDomainmodel.g:1116:2: ( rule__Clock__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomainmodel.g:1116:3: rule__Clock__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group__2__Impl"


    // $ANTLR start "rule__Clock__Group_2__0"
    // InternalDomainmodel.g:1125:1: rule__Clock__Group_2__0 : rule__Clock__Group_2__0__Impl rule__Clock__Group_2__1 ;
    public final void rule__Clock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1129:1: ( rule__Clock__Group_2__0__Impl rule__Clock__Group_2__1 )
            // InternalDomainmodel.g:1130:2: rule__Clock__Group_2__0__Impl rule__Clock__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Clock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clock__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group_2__0"


    // $ANTLR start "rule__Clock__Group_2__0__Impl"
    // InternalDomainmodel.g:1137:1: rule__Clock__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Clock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1141:1: ( ( '=' ) )
            // InternalDomainmodel.g:1142:1: ( '=' )
            {
            // InternalDomainmodel.g:1142:1: ( '=' )
            // InternalDomainmodel.g:1143:2: '='
            {
             before(grammarAccess.getClockAccess().getEqualsSignKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClockAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group_2__0__Impl"


    // $ANTLR start "rule__Clock__Group_2__1"
    // InternalDomainmodel.g:1152:1: rule__Clock__Group_2__1 : rule__Clock__Group_2__1__Impl ;
    public final void rule__Clock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1156:1: ( rule__Clock__Group_2__1__Impl )
            // InternalDomainmodel.g:1157:2: rule__Clock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clock__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group_2__1"


    // $ANTLR start "rule__Clock__Group_2__1__Impl"
    // InternalDomainmodel.g:1163:1: rule__Clock__Group_2__1__Impl : ( ( rule__Clock__InitialValueAssignment_2_1 ) ) ;
    public final void rule__Clock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1167:1: ( ( ( rule__Clock__InitialValueAssignment_2_1 ) ) )
            // InternalDomainmodel.g:1168:1: ( ( rule__Clock__InitialValueAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:1168:1: ( ( rule__Clock__InitialValueAssignment_2_1 ) )
            // InternalDomainmodel.g:1169:2: ( rule__Clock__InitialValueAssignment_2_1 )
            {
             before(grammarAccess.getClockAccess().getInitialValueAssignment_2_1()); 
            // InternalDomainmodel.g:1170:2: ( rule__Clock__InitialValueAssignment_2_1 )
            // InternalDomainmodel.g:1170:3: rule__Clock__InitialValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Clock__InitialValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClockAccess().getInitialValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__Group_2__1__Impl"


    // $ANTLR start "rule__EventDecl__Group__0"
    // InternalDomainmodel.g:1179:1: rule__EventDecl__Group__0 : rule__EventDecl__Group__0__Impl rule__EventDecl__Group__1 ;
    public final void rule__EventDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1183:1: ( rule__EventDecl__Group__0__Impl rule__EventDecl__Group__1 )
            // InternalDomainmodel.g:1184:2: rule__EventDecl__Group__0__Impl rule__EventDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EventDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDecl__Group__0"


    // $ANTLR start "rule__EventDecl__Group__0__Impl"
    // InternalDomainmodel.g:1191:1: rule__EventDecl__Group__0__Impl : ( 'event' ) ;
    public final void rule__EventDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1195:1: ( ( 'event' ) )
            // InternalDomainmodel.g:1196:1: ( 'event' )
            {
            // InternalDomainmodel.g:1196:1: ( 'event' )
            // InternalDomainmodel.g:1197:2: 'event'
            {
             before(grammarAccess.getEventDeclAccess().getEventKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEventDeclAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDecl__Group__0__Impl"


    // $ANTLR start "rule__EventDecl__Group__1"
    // InternalDomainmodel.g:1206:1: rule__EventDecl__Group__1 : rule__EventDecl__Group__1__Impl ;
    public final void rule__EventDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1210:1: ( rule__EventDecl__Group__1__Impl )
            // InternalDomainmodel.g:1211:2: rule__EventDecl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventDecl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDecl__Group__1"


    // $ANTLR start "rule__EventDecl__Group__1__Impl"
    // InternalDomainmodel.g:1217:1: rule__EventDecl__Group__1__Impl : ( ( rule__EventDecl__NameAssignment_1 ) ) ;
    public final void rule__EventDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1221:1: ( ( ( rule__EventDecl__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1222:1: ( ( rule__EventDecl__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1222:1: ( ( rule__EventDecl__NameAssignment_1 ) )
            // InternalDomainmodel.g:1223:2: ( rule__EventDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEventDeclAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1224:2: ( rule__EventDecl__NameAssignment_1 )
            // InternalDomainmodel.g:1224:3: rule__EventDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDecl__Group__1__Impl"


    // $ANTLR start "rule__Model__InterfaceAssignment_1"
    // InternalDomainmodel.g:1233:1: rule__Model__InterfaceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__InterfaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1237:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1238:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1238:2: ( RULE_ID )
            // InternalDomainmodel.g:1239:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getInterfaceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getInterfaceIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InterfaceAssignment_1"


    // $ANTLR start "rule__Model__EventsAssignment_3"
    // InternalDomainmodel.g:1248:1: rule__Model__EventsAssignment_3 : ( ruleEventDecl ) ;
    public final void rule__Model__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1252:1: ( ( ruleEventDecl ) )
            // InternalDomainmodel.g:1253:2: ( ruleEventDecl )
            {
            // InternalDomainmodel.g:1253:2: ( ruleEventDecl )
            // InternalDomainmodel.g:1254:3: ruleEventDecl
            {
             before(grammarAccess.getModelAccess().getEventsEventDeclParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEventsEventDeclParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EventsAssignment_3"


    // $ANTLR start "rule__Model__NameAssignment_6"
    // InternalDomainmodel.g:1263:1: rule__Model__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1267:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1268:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1268:2: ( RULE_ID )
            // InternalDomainmodel.g:1269:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_6"


    // $ANTLR start "rule__Model__CycleDefAssignment_8"
    // InternalDomainmodel.g:1278:1: rule__Model__CycleDefAssignment_8 : ( ruleCycleDef ) ;
    public final void rule__Model__CycleDefAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1282:1: ( ( ruleCycleDef ) )
            // InternalDomainmodel.g:1283:2: ( ruleCycleDef )
            {
            // InternalDomainmodel.g:1283:2: ( ruleCycleDef )
            // InternalDomainmodel.g:1284:3: ruleCycleDef
            {
             before(grammarAccess.getModelAccess().getCycleDefCycleDefParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleCycleDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCycleDefCycleDefParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CycleDefAssignment_8"


    // $ANTLR start "rule__Model__ConstantsAssignment_9_0"
    // InternalDomainmodel.g:1293:1: rule__Model__ConstantsAssignment_9_0 : ( ruleConstant ) ;
    public final void rule__Model__ConstantsAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1297:1: ( ( ruleConstant ) )
            // InternalDomainmodel.g:1298:2: ( ruleConstant )
            {
            // InternalDomainmodel.g:1298:2: ( ruleConstant )
            // InternalDomainmodel.g:1299:3: ruleConstant
            {
             before(grammarAccess.getModelAccess().getConstantsConstantParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstantsConstantParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConstantsAssignment_9_0"


    // $ANTLR start "rule__Model__VariablesAssignment_9_1"
    // InternalDomainmodel.g:1308:1: rule__Model__VariablesAssignment_9_1 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1312:1: ( ( ruleVariable ) )
            // InternalDomainmodel.g:1313:2: ( ruleVariable )
            {
            // InternalDomainmodel.g:1313:2: ( ruleVariable )
            // InternalDomainmodel.g:1314:3: ruleVariable
            {
             before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariablesAssignment_9_1"


    // $ANTLR start "rule__Model__ClockAssignment_9_2"
    // InternalDomainmodel.g:1323:1: rule__Model__ClockAssignment_9_2 : ( ruleClock ) ;
    public final void rule__Model__ClockAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1327:1: ( ( ruleClock ) )
            // InternalDomainmodel.g:1328:2: ( ruleClock )
            {
            // InternalDomainmodel.g:1328:2: ( ruleClock )
            // InternalDomainmodel.g:1329:3: ruleClock
            {
             before(grammarAccess.getModelAccess().getClockClockParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClockClockParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ClockAssignment_9_2"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalDomainmodel.g:1338:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1342:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1343:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1343:2: ( RULE_ID )
            // InternalDomainmodel.g:1344:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__TypeAssignment_3"
    // InternalDomainmodel.g:1353:1: rule__Variable__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1357:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:1358:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:1358:2: ( ruleDataType )
            // InternalDomainmodel.g:1359:3: ruleDataType
            {
             before(grammarAccess.getVariableAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeDataTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_3"


    // $ANTLR start "rule__Variable__InitialValueAssignment_4_1"
    // InternalDomainmodel.g:1368:1: rule__Variable__InitialValueAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Variable__InitialValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1372:1: ( ( ruleValue ) )
            // InternalDomainmodel.g:1373:2: ( ruleValue )
            {
            // InternalDomainmodel.g:1373:2: ( ruleValue )
            // InternalDomainmodel.g:1374:3: ruleValue
            {
             before(grammarAccess.getVariableAccess().getInitialValueValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getInitialValueValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__InitialValueAssignment_4_1"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // InternalDomainmodel.g:1383:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1387:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1388:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1388:2: ( RULE_ID )
            // InternalDomainmodel.g:1389:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_1"


    // $ANTLR start "rule__Constant__TypeAssignment_3"
    // InternalDomainmodel.g:1398:1: rule__Constant__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Constant__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1402:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:1403:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:1403:2: ( ruleDataType )
            // InternalDomainmodel.g:1404:3: ruleDataType
            {
             before(grammarAccess.getConstantAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getTypeDataTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__TypeAssignment_3"


    // $ANTLR start "rule__CycleDef__ValueAssignment_3"
    // InternalDomainmodel.g:1413:1: rule__CycleDef__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__CycleDef__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1417:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:1418:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:1418:2: ( RULE_INT )
            // InternalDomainmodel.g:1419:3: RULE_INT
            {
             before(grammarAccess.getCycleDefAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCycleDefAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CycleDef__ValueAssignment_3"


    // $ANTLR start "rule__Clock__NameAssignment_1"
    // InternalDomainmodel.g:1428:1: rule__Clock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Clock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1432:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1433:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1433:2: ( RULE_ID )
            // InternalDomainmodel.g:1434:3: RULE_ID
            {
             before(grammarAccess.getClockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__NameAssignment_1"


    // $ANTLR start "rule__Clock__InitialValueAssignment_2_1"
    // InternalDomainmodel.g:1443:1: rule__Clock__InitialValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Clock__InitialValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1447:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:1448:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:1448:2: ( RULE_INT )
            // InternalDomainmodel.g:1449:3: RULE_INT
            {
             before(grammarAccess.getClockAccess().getInitialValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getClockAccess().getInitialValueINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clock__InitialValueAssignment_2_1"


    // $ANTLR start "rule__EventDecl__NameAssignment_1"
    // InternalDomainmodel.g:1458:1: rule__EventDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1462:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1463:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1463:2: ( RULE_ID )
            // InternalDomainmodel.g:1464:3: RULE_ID
            {
             before(grammarAccess.getEventDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDecl__NameAssignment_1"


    // $ANTLR start "rule__Value__ValueAssignment"
    // InternalDomainmodel.g:1473:1: rule__Value__ValueAssignment : ( ( rule__Value__ValueAlternatives_0 ) ) ;
    public final void rule__Value__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1477:1: ( ( ( rule__Value__ValueAlternatives_0 ) ) )
            // InternalDomainmodel.g:1478:2: ( ( rule__Value__ValueAlternatives_0 ) )
            {
            // InternalDomainmodel.g:1478:2: ( ( rule__Value__ValueAlternatives_0 ) )
            // InternalDomainmodel.g:1479:3: ( rule__Value__ValueAlternatives_0 )
            {
             before(grammarAccess.getValueAccess().getValueAlternatives_0()); 
            // InternalDomainmodel.g:1480:3: ( rule__Value__ValueAlternatives_0 )
            // InternalDomainmodel.g:1480:4: rule__Value__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000013280000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000011200002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});

}