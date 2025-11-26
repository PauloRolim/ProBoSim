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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'input'", "'output'", "'NAT'", "'INT'", "'REAL'", "'BOOL'", "'stm'", "'{'", "'}'", "'interface'", "'('", "')'", "','", "'event'", "':'", "'context'", "'uses'", "'const'", "'var'", "'='", "'clock'", "'cycleDef'", "'cycle'", "'=='"
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


    // $ANTLR start "entryRuleInterface"
    // InternalDomainmodel.g:78:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleInterface EOF )
            // InternalDomainmodel.g:80:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalDomainmodel.g:87:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Interface__Group__0 ) )
            // InternalDomainmodel.g:93:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalDomainmodel.g:94:3: ( rule__Interface__Group__0 )
            // InternalDomainmodel.g:94:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleOperationDecl"
    // InternalDomainmodel.g:103:1: entryRuleOperationDecl : ruleOperationDecl EOF ;
    public final void entryRuleOperationDecl() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleOperationDecl EOF )
            // InternalDomainmodel.g:105:1: ruleOperationDecl EOF
            {
             before(grammarAccess.getOperationDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationDecl();

            state._fsp--;

             after(grammarAccess.getOperationDeclRule()); 
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
    // $ANTLR end "entryRuleOperationDecl"


    // $ANTLR start "ruleOperationDecl"
    // InternalDomainmodel.g:112:1: ruleOperationDecl : ( ( rule__OperationDecl__Group__0 ) ) ;
    public final void ruleOperationDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__OperationDecl__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__OperationDecl__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__OperationDecl__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__OperationDecl__Group__0 )
            {
             before(grammarAccess.getOperationDeclAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__OperationDecl__Group__0 )
            // InternalDomainmodel.g:119:4: rule__OperationDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleOperationDecl"


    // $ANTLR start "entryRuleEventDecl"
    // InternalDomainmodel.g:128:1: entryRuleEventDecl : ruleEventDecl EOF ;
    public final void entryRuleEventDecl() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleEventDecl EOF )
            // InternalDomainmodel.g:130:1: ruleEventDecl EOF
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
    // InternalDomainmodel.g:137:1: ruleEventDecl : ( ( rule__EventDecl__Group__0 ) ) ;
    public final void ruleEventDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__EventDecl__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__EventDecl__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__EventDecl__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__EventDecl__Group__0 )
            {
             before(grammarAccess.getEventDeclAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__EventDecl__Group__0 )
            // InternalDomainmodel.g:144:4: rule__EventDecl__Group__0
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


    // $ANTLR start "entryRuleParam"
    // InternalDomainmodel.g:153:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleParam EOF )
            // InternalDomainmodel.g:155:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalDomainmodel.g:162:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Param__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__Param__Group__0 )
            // InternalDomainmodel.g:169:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleContextDecl"
    // InternalDomainmodel.g:178:1: entryRuleContextDecl : ruleContextDecl EOF ;
    public final void entryRuleContextDecl() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleContextDecl EOF )
            // InternalDomainmodel.g:180:1: ruleContextDecl EOF
            {
             before(grammarAccess.getContextDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleContextDecl();

            state._fsp--;

             after(grammarAccess.getContextDeclRule()); 
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
    // $ANTLR end "entryRuleContextDecl"


    // $ANTLR start "ruleContextDecl"
    // InternalDomainmodel.g:187:1: ruleContextDecl : ( ( rule__ContextDecl__Group__0 ) ) ;
    public final void ruleContextDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__ContextDecl__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__ContextDecl__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__ContextDecl__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__ContextDecl__Group__0 )
            {
             before(grammarAccess.getContextDeclAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__ContextDecl__Group__0 )
            // InternalDomainmodel.g:194:4: rule__ContextDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleContextDecl"


    // $ANTLR start "entryRuleConstant"
    // InternalDomainmodel.g:203:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleConstant EOF )
            // InternalDomainmodel.g:205:1: ruleConstant EOF
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
    // InternalDomainmodel.g:212:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__Constant__Group__0 ) )
            // InternalDomainmodel.g:218:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalDomainmodel.g:219:3: ( rule__Constant__Group__0 )
            // InternalDomainmodel.g:219:4: rule__Constant__Group__0
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


    // $ANTLR start "entryRuleVariable"
    // InternalDomainmodel.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalDomainmodel.g:229:1: ( ruleVariable EOF )
            // InternalDomainmodel.g:230:1: ruleVariable EOF
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
    // InternalDomainmodel.g:237:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalDomainmodel.g:242:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalDomainmodel.g:242:2: ( ( rule__Variable__Group__0 ) )
            // InternalDomainmodel.g:243:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalDomainmodel.g:244:3: ( rule__Variable__Group__0 )
            // InternalDomainmodel.g:244:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleClock"
    // InternalDomainmodel.g:253:1: entryRuleClock : ruleClock EOF ;
    public final void entryRuleClock() throws RecognitionException {
        try {
            // InternalDomainmodel.g:254:1: ( ruleClock EOF )
            // InternalDomainmodel.g:255:1: ruleClock EOF
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
    // InternalDomainmodel.g:262:1: ruleClock : ( ( rule__Clock__Group__0 ) ) ;
    public final void ruleClock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:266:2: ( ( ( rule__Clock__Group__0 ) ) )
            // InternalDomainmodel.g:267:2: ( ( rule__Clock__Group__0 ) )
            {
            // InternalDomainmodel.g:267:2: ( ( rule__Clock__Group__0 ) )
            // InternalDomainmodel.g:268:3: ( rule__Clock__Group__0 )
            {
             before(grammarAccess.getClockAccess().getGroup()); 
            // InternalDomainmodel.g:269:3: ( rule__Clock__Group__0 )
            // InternalDomainmodel.g:269:4: rule__Clock__Group__0
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


    // $ANTLR start "entryRuleCycleDef"
    // InternalDomainmodel.g:278:1: entryRuleCycleDef : ruleCycleDef EOF ;
    public final void entryRuleCycleDef() throws RecognitionException {
        try {
            // InternalDomainmodel.g:279:1: ( ruleCycleDef EOF )
            // InternalDomainmodel.g:280:1: ruleCycleDef EOF
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
    // InternalDomainmodel.g:287:1: ruleCycleDef : ( ( rule__CycleDef__Group__0 ) ) ;
    public final void ruleCycleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:291:2: ( ( ( rule__CycleDef__Group__0 ) ) )
            // InternalDomainmodel.g:292:2: ( ( rule__CycleDef__Group__0 ) )
            {
            // InternalDomainmodel.g:292:2: ( ( rule__CycleDef__Group__0 ) )
            // InternalDomainmodel.g:293:3: ( rule__CycleDef__Group__0 )
            {
             before(grammarAccess.getCycleDefAccess().getGroup()); 
            // InternalDomainmodel.g:294:3: ( rule__CycleDef__Group__0 )
            // InternalDomainmodel.g:294:4: rule__CycleDef__Group__0
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


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:303:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:307:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDomainmodel.g:308:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDomainmodel.g:308:2: ( ( rule__DataType__Alternatives ) )
            // InternalDomainmodel.g:309:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:310:3: ( rule__DataType__Alternatives )
            // InternalDomainmodel.g:310:4: rule__DataType__Alternatives
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


    // $ANTLR start "rule__Interface__Alternatives_3"
    // InternalDomainmodel.g:318:1: rule__Interface__Alternatives_3 : ( ( ( rule__Interface__OperationsAssignment_3_0 ) ) | ( ( rule__Interface__EventsAssignment_3_1 ) ) );
    public final void rule__Interface__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:322:1: ( ( ( rule__Interface__OperationsAssignment_3_0 ) ) | ( ( rule__Interface__EventsAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:323:2: ( ( rule__Interface__OperationsAssignment_3_0 ) )
                    {
                    // InternalDomainmodel.g:323:2: ( ( rule__Interface__OperationsAssignment_3_0 ) )
                    // InternalDomainmodel.g:324:3: ( rule__Interface__OperationsAssignment_3_0 )
                    {
                     before(grammarAccess.getInterfaceAccess().getOperationsAssignment_3_0()); 
                    // InternalDomainmodel.g:325:3: ( rule__Interface__OperationsAssignment_3_0 )
                    // InternalDomainmodel.g:325:4: rule__Interface__OperationsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__OperationsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getOperationsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:329:2: ( ( rule__Interface__EventsAssignment_3_1 ) )
                    {
                    // InternalDomainmodel.g:329:2: ( ( rule__Interface__EventsAssignment_3_1 ) )
                    // InternalDomainmodel.g:330:3: ( rule__Interface__EventsAssignment_3_1 )
                    {
                     before(grammarAccess.getInterfaceAccess().getEventsAssignment_3_1()); 
                    // InternalDomainmodel.g:331:3: ( rule__Interface__EventsAssignment_3_1 )
                    // InternalDomainmodel.g:331:4: rule__Interface__EventsAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__EventsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInterfaceAccess().getEventsAssignment_3_1()); 

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
    // $ANTLR end "rule__Interface__Alternatives_3"


    // $ANTLR start "rule__ContextDecl__KindAlternatives_0_0"
    // InternalDomainmodel.g:339:1: rule__ContextDecl__KindAlternatives_0_0 : ( ( 'input' ) | ( 'output' ) );
    public final void rule__ContextDecl__KindAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:343:1: ( ( 'input' ) | ( 'output' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:344:2: ( 'input' )
                    {
                    // InternalDomainmodel.g:344:2: ( 'input' )
                    // InternalDomainmodel.g:345:3: 'input'
                    {
                     before(grammarAccess.getContextDeclAccess().getKindInputKeyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getContextDeclAccess().getKindInputKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:350:2: ( 'output' )
                    {
                    // InternalDomainmodel.g:350:2: ( 'output' )
                    // InternalDomainmodel.g:351:3: 'output'
                    {
                     before(grammarAccess.getContextDeclAccess().getKindOutputKeyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getContextDeclAccess().getKindOutputKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ContextDecl__KindAlternatives_0_0"


    // $ANTLR start "rule__ContextDecl__Alternatives_6"
    // InternalDomainmodel.g:360:1: rule__ContextDecl__Alternatives_6 : ( ( ( rule__ContextDecl__OpsAssignment_6_0 ) ) | ( ( rule__ContextDecl__EventsAssignment_6_1 ) ) );
    public final void rule__ContextDecl__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:364:1: ( ( ( rule__ContextDecl__OpsAssignment_6_0 ) ) | ( ( rule__ContextDecl__EventsAssignment_6_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:365:2: ( ( rule__ContextDecl__OpsAssignment_6_0 ) )
                    {
                    // InternalDomainmodel.g:365:2: ( ( rule__ContextDecl__OpsAssignment_6_0 ) )
                    // InternalDomainmodel.g:366:3: ( rule__ContextDecl__OpsAssignment_6_0 )
                    {
                     before(grammarAccess.getContextDeclAccess().getOpsAssignment_6_0()); 
                    // InternalDomainmodel.g:367:3: ( rule__ContextDecl__OpsAssignment_6_0 )
                    // InternalDomainmodel.g:367:4: rule__ContextDecl__OpsAssignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextDecl__OpsAssignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContextDeclAccess().getOpsAssignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:371:2: ( ( rule__ContextDecl__EventsAssignment_6_1 ) )
                    {
                    // InternalDomainmodel.g:371:2: ( ( rule__ContextDecl__EventsAssignment_6_1 ) )
                    // InternalDomainmodel.g:372:3: ( rule__ContextDecl__EventsAssignment_6_1 )
                    {
                     before(grammarAccess.getContextDeclAccess().getEventsAssignment_6_1()); 
                    // InternalDomainmodel.g:373:3: ( rule__ContextDecl__EventsAssignment_6_1 )
                    // InternalDomainmodel.g:373:4: rule__ContextDecl__EventsAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextDecl__EventsAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getContextDeclAccess().getEventsAssignment_6_1()); 

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
    // $ANTLR end "rule__ContextDecl__Alternatives_6"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalDomainmodel.g:381:1: rule__DataType__Alternatives : ( ( ( 'NAT' ) ) | ( ( 'INT' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:385:1: ( ( ( 'NAT' ) ) | ( ( 'INT' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
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
                    // InternalDomainmodel.g:386:2: ( ( 'NAT' ) )
                    {
                    // InternalDomainmodel.g:386:2: ( ( 'NAT' ) )
                    // InternalDomainmodel.g:387:3: ( 'NAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0()); 
                    // InternalDomainmodel.g:388:3: ( 'NAT' )
                    // InternalDomainmodel.g:388:4: 'NAT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:392:2: ( ( 'INT' ) )
                    {
                    // InternalDomainmodel.g:392:2: ( ( 'INT' ) )
                    // InternalDomainmodel.g:393:3: ( 'INT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalDomainmodel.g:394:3: ( 'INT' )
                    // InternalDomainmodel.g:394:4: 'INT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:398:2: ( ( 'REAL' ) )
                    {
                    // InternalDomainmodel.g:398:2: ( ( 'REAL' ) )
                    // InternalDomainmodel.g:399:3: ( 'REAL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDomainmodel.g:400:3: ( 'REAL' )
                    // InternalDomainmodel.g:400:4: 'REAL'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:404:2: ( ( 'BOOL' ) )
                    {
                    // InternalDomainmodel.g:404:2: ( ( 'BOOL' ) )
                    // InternalDomainmodel.g:405:3: ( 'BOOL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_3()); 
                    // InternalDomainmodel.g:406:3: ( 'BOOL' )
                    // InternalDomainmodel.g:406:4: 'BOOL'
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
    // InternalDomainmodel.g:414:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:418:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDomainmodel.g:419:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDomainmodel.g:426:1: rule__Model__Group__0__Impl : ( ( rule__Model__InterfaceAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:430:1: ( ( ( rule__Model__InterfaceAssignment_0 )* ) )
            // InternalDomainmodel.g:431:1: ( ( rule__Model__InterfaceAssignment_0 )* )
            {
            // InternalDomainmodel.g:431:1: ( ( rule__Model__InterfaceAssignment_0 )* )
            // InternalDomainmodel.g:432:2: ( rule__Model__InterfaceAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getInterfaceAssignment_0()); 
            // InternalDomainmodel.g:433:2: ( rule__Model__InterfaceAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainmodel.g:433:3: rule__Model__InterfaceAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__InterfaceAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getInterfaceAssignment_0()); 

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
    // InternalDomainmodel.g:441:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:445:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDomainmodel.g:446:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainmodel.g:453:1: rule__Model__Group__1__Impl : ( 'stm' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:457:1: ( ( 'stm' ) )
            // InternalDomainmodel.g:458:1: ( 'stm' )
            {
            // InternalDomainmodel.g:458:1: ( 'stm' )
            // InternalDomainmodel.g:459:2: 'stm'
            {
             before(grammarAccess.getModelAccess().getStmKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getStmKeyword_1()); 

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
    // InternalDomainmodel.g:468:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:472:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDomainmodel.g:473:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDomainmodel.g:480:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:484:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalDomainmodel.g:485:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalDomainmodel.g:485:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalDomainmodel.g:486:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalDomainmodel.g:487:2: ( rule__Model__NameAssignment_2 )
            // InternalDomainmodel.g:487:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // InternalDomainmodel.g:495:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:499:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDomainmodel.g:500:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:507:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:511:1: ( ( '{' ) )
            // InternalDomainmodel.g:512:1: ( '{' )
            {
            // InternalDomainmodel.g:512:1: ( '{' )
            // InternalDomainmodel.g:513:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalDomainmodel.g:522:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:526:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalDomainmodel.g:527:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalDomainmodel.g:534:1: rule__Model__Group__4__Impl : ( ( rule__Model__CycleDefAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:538:1: ( ( ( rule__Model__CycleDefAssignment_4 )? ) )
            // InternalDomainmodel.g:539:1: ( ( rule__Model__CycleDefAssignment_4 )? )
            {
            // InternalDomainmodel.g:539:1: ( ( rule__Model__CycleDefAssignment_4 )? )
            // InternalDomainmodel.g:540:2: ( rule__Model__CycleDefAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getCycleDefAssignment_4()); 
            // InternalDomainmodel.g:541:2: ( rule__Model__CycleDefAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:541:3: rule__Model__CycleDefAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__CycleDefAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getCycleDefAssignment_4()); 

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
    // InternalDomainmodel.g:549:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:553:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalDomainmodel.g:554:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:561:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConstantsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:565:1: ( ( ( rule__Model__ConstantsAssignment_5 )* ) )
            // InternalDomainmodel.g:566:1: ( ( rule__Model__ConstantsAssignment_5 )* )
            {
            // InternalDomainmodel.g:566:1: ( ( rule__Model__ConstantsAssignment_5 )* )
            // InternalDomainmodel.g:567:2: ( rule__Model__ConstantsAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getConstantsAssignment_5()); 
            // InternalDomainmodel.g:568:2: ( rule__Model__ConstantsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainmodel.g:568:3: rule__Model__ConstantsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ConstantsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getConstantsAssignment_5()); 

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
    // InternalDomainmodel.g:576:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:580:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalDomainmodel.g:581:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:588:1: rule__Model__Group__6__Impl : ( ( rule__Model__VariablesAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:592:1: ( ( ( rule__Model__VariablesAssignment_6 )* ) )
            // InternalDomainmodel.g:593:1: ( ( rule__Model__VariablesAssignment_6 )* )
            {
            // InternalDomainmodel.g:593:1: ( ( rule__Model__VariablesAssignment_6 )* )
            // InternalDomainmodel.g:594:2: ( rule__Model__VariablesAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_6()); 
            // InternalDomainmodel.g:595:2: ( rule__Model__VariablesAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainmodel.g:595:3: rule__Model__VariablesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__VariablesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment_6()); 

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
    // InternalDomainmodel.g:603:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:607:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalDomainmodel.g:608:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:615:1: rule__Model__Group__7__Impl : ( ( rule__Model__ClockAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:619:1: ( ( ( rule__Model__ClockAssignment_7 )* ) )
            // InternalDomainmodel.g:620:1: ( ( rule__Model__ClockAssignment_7 )* )
            {
            // InternalDomainmodel.g:620:1: ( ( rule__Model__ClockAssignment_7 )* )
            // InternalDomainmodel.g:621:2: ( rule__Model__ClockAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getClockAssignment_7()); 
            // InternalDomainmodel.g:622:2: ( rule__Model__ClockAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomainmodel.g:622:3: rule__Model__ClockAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__ClockAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getClockAssignment_7()); 

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
    // InternalDomainmodel.g:630:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:634:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalDomainmodel.g:635:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:642:1: rule__Model__Group__8__Impl : ( ( rule__Model__ContextsAssignment_8 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:646:1: ( ( ( rule__Model__ContextsAssignment_8 )* ) )
            // InternalDomainmodel.g:647:1: ( ( rule__Model__ContextsAssignment_8 )* )
            {
            // InternalDomainmodel.g:647:1: ( ( rule__Model__ContextsAssignment_8 )* )
            // InternalDomainmodel.g:648:2: ( rule__Model__ContextsAssignment_8 )*
            {
             before(grammarAccess.getModelAccess().getContextsAssignment_8()); 
            // InternalDomainmodel.g:649:2: ( rule__Model__ContextsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDomainmodel.g:649:3: rule__Model__ContextsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__ContextsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getContextsAssignment_8()); 

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
    // InternalDomainmodel.g:657:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:661:1: ( rule__Model__Group__9__Impl )
            // InternalDomainmodel.g:662:2: rule__Model__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__9__Impl();

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
    // InternalDomainmodel.g:668:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:672:1: ( ( '}' ) )
            // InternalDomainmodel.g:673:1: ( '}' )
            {
            // InternalDomainmodel.g:673:1: ( '}' )
            // InternalDomainmodel.g:674:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 

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


    // $ANTLR start "rule__Interface__Group__0"
    // InternalDomainmodel.g:684:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:688:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalDomainmodel.g:689:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalDomainmodel.g:696:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:700:1: ( ( 'interface' ) )
            // InternalDomainmodel.g:701:1: ( 'interface' )
            {
            // InternalDomainmodel.g:701:1: ( 'interface' )
            // InternalDomainmodel.g:702:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalDomainmodel.g:711:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:715:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalDomainmodel.g:716:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalDomainmodel.g:723:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:727:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:728:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:728:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalDomainmodel.g:729:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:730:2: ( rule__Interface__NameAssignment_1 )
            // InternalDomainmodel.g:730:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalDomainmodel.g:738:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:742:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalDomainmodel.g:743:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalDomainmodel.g:750:1: rule__Interface__Group__2__Impl : ( '{' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:754:1: ( ( '{' ) )
            // InternalDomainmodel.g:755:1: ( '{' )
            {
            // InternalDomainmodel.g:755:1: ( '{' )
            // InternalDomainmodel.g:756:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalDomainmodel.g:765:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:769:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalDomainmodel.g:770:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalDomainmodel.g:777:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__Alternatives_3 )* ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:781:1: ( ( ( rule__Interface__Alternatives_3 )* ) )
            // InternalDomainmodel.g:782:1: ( ( rule__Interface__Alternatives_3 )* )
            {
            // InternalDomainmodel.g:782:1: ( ( rule__Interface__Alternatives_3 )* )
            // InternalDomainmodel.g:783:2: ( rule__Interface__Alternatives_3 )*
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives_3()); 
            // InternalDomainmodel.g:784:2: ( rule__Interface__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDomainmodel.g:784:3: rule__Interface__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Interface__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalDomainmodel.g:792:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:796:1: ( rule__Interface__Group__4__Impl )
            // InternalDomainmodel.g:797:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__4__Impl();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalDomainmodel.g:803:1: rule__Interface__Group__4__Impl : ( '}' ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:807:1: ( ( '}' ) )
            // InternalDomainmodel.g:808:1: ( '}' )
            {
            // InternalDomainmodel.g:808:1: ( '}' )
            // InternalDomainmodel.g:809:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__OperationDecl__Group__0"
    // InternalDomainmodel.g:819:1: rule__OperationDecl__Group__0 : rule__OperationDecl__Group__0__Impl rule__OperationDecl__Group__1 ;
    public final void rule__OperationDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:823:1: ( rule__OperationDecl__Group__0__Impl rule__OperationDecl__Group__1 )
            // InternalDomainmodel.g:824:2: rule__OperationDecl__Group__0__Impl rule__OperationDecl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__OperationDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group__1();

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
    // $ANTLR end "rule__OperationDecl__Group__0"


    // $ANTLR start "rule__OperationDecl__Group__0__Impl"
    // InternalDomainmodel.g:831:1: rule__OperationDecl__Group__0__Impl : ( ( rule__OperationDecl__NameAssignment_0 ) ) ;
    public final void rule__OperationDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:835:1: ( ( ( rule__OperationDecl__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:836:1: ( ( rule__OperationDecl__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:836:1: ( ( rule__OperationDecl__NameAssignment_0 ) )
            // InternalDomainmodel.g:837:2: ( rule__OperationDecl__NameAssignment_0 )
            {
             before(grammarAccess.getOperationDeclAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:838:2: ( rule__OperationDecl__NameAssignment_0 )
            // InternalDomainmodel.g:838:3: rule__OperationDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__OperationDecl__Group__0__Impl"


    // $ANTLR start "rule__OperationDecl__Group__1"
    // InternalDomainmodel.g:846:1: rule__OperationDecl__Group__1 : rule__OperationDecl__Group__1__Impl rule__OperationDecl__Group__2 ;
    public final void rule__OperationDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:850:1: ( rule__OperationDecl__Group__1__Impl rule__OperationDecl__Group__2 )
            // InternalDomainmodel.g:851:2: rule__OperationDecl__Group__1__Impl rule__OperationDecl__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__OperationDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group__2();

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
    // $ANTLR end "rule__OperationDecl__Group__1"


    // $ANTLR start "rule__OperationDecl__Group__1__Impl"
    // InternalDomainmodel.g:858:1: rule__OperationDecl__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:862:1: ( ( '(' ) )
            // InternalDomainmodel.g:863:1: ( '(' )
            {
            // InternalDomainmodel.g:863:1: ( '(' )
            // InternalDomainmodel.g:864:2: '('
            {
             before(grammarAccess.getOperationDeclAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOperationDeclAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__OperationDecl__Group__1__Impl"


    // $ANTLR start "rule__OperationDecl__Group__2"
    // InternalDomainmodel.g:873:1: rule__OperationDecl__Group__2 : rule__OperationDecl__Group__2__Impl rule__OperationDecl__Group__3 ;
    public final void rule__OperationDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:877:1: ( rule__OperationDecl__Group__2__Impl rule__OperationDecl__Group__3 )
            // InternalDomainmodel.g:878:2: rule__OperationDecl__Group__2__Impl rule__OperationDecl__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__OperationDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group__3();

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
    // $ANTLR end "rule__OperationDecl__Group__2"


    // $ANTLR start "rule__OperationDecl__Group__2__Impl"
    // InternalDomainmodel.g:885:1: rule__OperationDecl__Group__2__Impl : ( ( rule__OperationDecl__Group_2__0 )? ) ;
    public final void rule__OperationDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:889:1: ( ( ( rule__OperationDecl__Group_2__0 )? ) )
            // InternalDomainmodel.g:890:1: ( ( rule__OperationDecl__Group_2__0 )? )
            {
            // InternalDomainmodel.g:890:1: ( ( rule__OperationDecl__Group_2__0 )? )
            // InternalDomainmodel.g:891:2: ( rule__OperationDecl__Group_2__0 )?
            {
             before(grammarAccess.getOperationDeclAccess().getGroup_2()); 
            // InternalDomainmodel.g:892:2: ( rule__OperationDecl__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:892:3: rule__OperationDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationDecl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationDeclAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OperationDecl__Group__2__Impl"


    // $ANTLR start "rule__OperationDecl__Group__3"
    // InternalDomainmodel.g:900:1: rule__OperationDecl__Group__3 : rule__OperationDecl__Group__3__Impl ;
    public final void rule__OperationDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:904:1: ( rule__OperationDecl__Group__3__Impl )
            // InternalDomainmodel.g:905:2: rule__OperationDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group__3__Impl();

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
    // $ANTLR end "rule__OperationDecl__Group__3"


    // $ANTLR start "rule__OperationDecl__Group__3__Impl"
    // InternalDomainmodel.g:911:1: rule__OperationDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:915:1: ( ( ')' ) )
            // InternalDomainmodel.g:916:1: ( ')' )
            {
            // InternalDomainmodel.g:916:1: ( ')' )
            // InternalDomainmodel.g:917:2: ')'
            {
             before(grammarAccess.getOperationDeclAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOperationDeclAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__OperationDecl__Group__3__Impl"


    // $ANTLR start "rule__OperationDecl__Group_2__0"
    // InternalDomainmodel.g:927:1: rule__OperationDecl__Group_2__0 : rule__OperationDecl__Group_2__0__Impl rule__OperationDecl__Group_2__1 ;
    public final void rule__OperationDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:931:1: ( rule__OperationDecl__Group_2__0__Impl rule__OperationDecl__Group_2__1 )
            // InternalDomainmodel.g:932:2: rule__OperationDecl__Group_2__0__Impl rule__OperationDecl__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__OperationDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group_2__1();

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
    // $ANTLR end "rule__OperationDecl__Group_2__0"


    // $ANTLR start "rule__OperationDecl__Group_2__0__Impl"
    // InternalDomainmodel.g:939:1: rule__OperationDecl__Group_2__0__Impl : ( ( rule__OperationDecl__ParamsAssignment_2_0 ) ) ;
    public final void rule__OperationDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:943:1: ( ( ( rule__OperationDecl__ParamsAssignment_2_0 ) ) )
            // InternalDomainmodel.g:944:1: ( ( rule__OperationDecl__ParamsAssignment_2_0 ) )
            {
            // InternalDomainmodel.g:944:1: ( ( rule__OperationDecl__ParamsAssignment_2_0 ) )
            // InternalDomainmodel.g:945:2: ( rule__OperationDecl__ParamsAssignment_2_0 )
            {
             before(grammarAccess.getOperationDeclAccess().getParamsAssignment_2_0()); 
            // InternalDomainmodel.g:946:2: ( rule__OperationDecl__ParamsAssignment_2_0 )
            // InternalDomainmodel.g:946:3: rule__OperationDecl__ParamsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__ParamsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclAccess().getParamsAssignment_2_0()); 

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
    // $ANTLR end "rule__OperationDecl__Group_2__0__Impl"


    // $ANTLR start "rule__OperationDecl__Group_2__1"
    // InternalDomainmodel.g:954:1: rule__OperationDecl__Group_2__1 : rule__OperationDecl__Group_2__1__Impl ;
    public final void rule__OperationDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:958:1: ( rule__OperationDecl__Group_2__1__Impl )
            // InternalDomainmodel.g:959:2: rule__OperationDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group_2__1__Impl();

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
    // $ANTLR end "rule__OperationDecl__Group_2__1"


    // $ANTLR start "rule__OperationDecl__Group_2__1__Impl"
    // InternalDomainmodel.g:965:1: rule__OperationDecl__Group_2__1__Impl : ( ( rule__OperationDecl__Group_2_1__0 )* ) ;
    public final void rule__OperationDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:969:1: ( ( ( rule__OperationDecl__Group_2_1__0 )* ) )
            // InternalDomainmodel.g:970:1: ( ( rule__OperationDecl__Group_2_1__0 )* )
            {
            // InternalDomainmodel.g:970:1: ( ( rule__OperationDecl__Group_2_1__0 )* )
            // InternalDomainmodel.g:971:2: ( rule__OperationDecl__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationDeclAccess().getGroup_2_1()); 
            // InternalDomainmodel.g:972:2: ( rule__OperationDecl__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDomainmodel.g:972:3: rule__OperationDecl__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__OperationDecl__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getOperationDeclAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__OperationDecl__Group_2__1__Impl"


    // $ANTLR start "rule__OperationDecl__Group_2_1__0"
    // InternalDomainmodel.g:981:1: rule__OperationDecl__Group_2_1__0 : rule__OperationDecl__Group_2_1__0__Impl rule__OperationDecl__Group_2_1__1 ;
    public final void rule__OperationDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:985:1: ( rule__OperationDecl__Group_2_1__0__Impl rule__OperationDecl__Group_2_1__1 )
            // InternalDomainmodel.g:986:2: rule__OperationDecl__Group_2_1__0__Impl rule__OperationDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__OperationDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group_2_1__1();

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
    // $ANTLR end "rule__OperationDecl__Group_2_1__0"


    // $ANTLR start "rule__OperationDecl__Group_2_1__0__Impl"
    // InternalDomainmodel.g:993:1: rule__OperationDecl__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:997:1: ( ( ',' ) )
            // InternalDomainmodel.g:998:1: ( ',' )
            {
            // InternalDomainmodel.g:998:1: ( ',' )
            // InternalDomainmodel.g:999:2: ','
            {
             before(grammarAccess.getOperationDeclAccess().getCommaKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOperationDeclAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__OperationDecl__Group_2_1__0__Impl"


    // $ANTLR start "rule__OperationDecl__Group_2_1__1"
    // InternalDomainmodel.g:1008:1: rule__OperationDecl__Group_2_1__1 : rule__OperationDecl__Group_2_1__1__Impl ;
    public final void rule__OperationDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1012:1: ( rule__OperationDecl__Group_2_1__1__Impl )
            // InternalDomainmodel.g:1013:2: rule__OperationDecl__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__OperationDecl__Group_2_1__1"


    // $ANTLR start "rule__OperationDecl__Group_2_1__1__Impl"
    // InternalDomainmodel.g:1019:1: rule__OperationDecl__Group_2_1__1__Impl : ( ( rule__OperationDecl__ParamsAssignment_2_1_1 ) ) ;
    public final void rule__OperationDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1023:1: ( ( ( rule__OperationDecl__ParamsAssignment_2_1_1 ) ) )
            // InternalDomainmodel.g:1024:1: ( ( rule__OperationDecl__ParamsAssignment_2_1_1 ) )
            {
            // InternalDomainmodel.g:1024:1: ( ( rule__OperationDecl__ParamsAssignment_2_1_1 ) )
            // InternalDomainmodel.g:1025:2: ( rule__OperationDecl__ParamsAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationDeclAccess().getParamsAssignment_2_1_1()); 
            // InternalDomainmodel.g:1026:2: ( rule__OperationDecl__ParamsAssignment_2_1_1 )
            // InternalDomainmodel.g:1026:3: rule__OperationDecl__ParamsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationDecl__ParamsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationDeclAccess().getParamsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__OperationDecl__Group_2_1__1__Impl"


    // $ANTLR start "rule__EventDecl__Group__0"
    // InternalDomainmodel.g:1035:1: rule__EventDecl__Group__0 : rule__EventDecl__Group__0__Impl rule__EventDecl__Group__1 ;
    public final void rule__EventDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1039:1: ( rule__EventDecl__Group__0__Impl rule__EventDecl__Group__1 )
            // InternalDomainmodel.g:1040:2: rule__EventDecl__Group__0__Impl rule__EventDecl__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainmodel.g:1047:1: rule__EventDecl__Group__0__Impl : ( 'event' ) ;
    public final void rule__EventDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1051:1: ( ( 'event' ) )
            // InternalDomainmodel.g:1052:1: ( 'event' )
            {
            // InternalDomainmodel.g:1052:1: ( 'event' )
            // InternalDomainmodel.g:1053:2: 'event'
            {
             before(grammarAccess.getEventDeclAccess().getEventKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDomainmodel.g:1062:1: rule__EventDecl__Group__1 : rule__EventDecl__Group__1__Impl ;
    public final void rule__EventDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1066:1: ( rule__EventDecl__Group__1__Impl )
            // InternalDomainmodel.g:1067:2: rule__EventDecl__Group__1__Impl
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
    // InternalDomainmodel.g:1073:1: rule__EventDecl__Group__1__Impl : ( ( rule__EventDecl__NameAssignment_1 ) ) ;
    public final void rule__EventDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1077:1: ( ( ( rule__EventDecl__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1078:1: ( ( rule__EventDecl__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1078:1: ( ( rule__EventDecl__NameAssignment_1 ) )
            // InternalDomainmodel.g:1079:2: ( rule__EventDecl__NameAssignment_1 )
            {
             before(grammarAccess.getEventDeclAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1080:2: ( rule__EventDecl__NameAssignment_1 )
            // InternalDomainmodel.g:1080:3: rule__EventDecl__NameAssignment_1
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


    // $ANTLR start "rule__Param__Group__0"
    // InternalDomainmodel.g:1089:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1093:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalDomainmodel.g:1094:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalDomainmodel.g:1101:1: rule__Param__Group__0__Impl : ( ( rule__Param__NameAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1105:1: ( ( ( rule__Param__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1106:1: ( ( rule__Param__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1106:1: ( ( rule__Param__NameAssignment_0 ) )
            // InternalDomainmodel.g:1107:2: ( rule__Param__NameAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1108:2: ( rule__Param__NameAssignment_0 )
            // InternalDomainmodel.g:1108:3: rule__Param__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalDomainmodel.g:1116:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1120:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalDomainmodel.g:1121:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__2();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalDomainmodel.g:1128:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1132:1: ( ( ':' ) )
            // InternalDomainmodel.g:1133:1: ( ':' )
            {
            // InternalDomainmodel.g:1133:1: ( ':' )
            // InternalDomainmodel.g:1134:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // InternalDomainmodel.g:1143:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1147:1: ( rule__Param__Group__2__Impl )
            // InternalDomainmodel.g:1148:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__2__Impl();

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
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // InternalDomainmodel.g:1154:1: rule__Param__Group__2__Impl : ( ( rule__Param__TypeAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1158:1: ( ( ( rule__Param__TypeAssignment_2 ) ) )
            // InternalDomainmodel.g:1159:1: ( ( rule__Param__TypeAssignment_2 ) )
            {
            // InternalDomainmodel.g:1159:1: ( ( rule__Param__TypeAssignment_2 ) )
            // InternalDomainmodel.g:1160:2: ( rule__Param__TypeAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getTypeAssignment_2()); 
            // InternalDomainmodel.g:1161:2: ( rule__Param__TypeAssignment_2 )
            // InternalDomainmodel.g:1161:3: rule__Param__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__ContextDecl__Group__0"
    // InternalDomainmodel.g:1170:1: rule__ContextDecl__Group__0 : rule__ContextDecl__Group__0__Impl rule__ContextDecl__Group__1 ;
    public final void rule__ContextDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1174:1: ( rule__ContextDecl__Group__0__Impl rule__ContextDecl__Group__1 )
            // InternalDomainmodel.g:1175:2: rule__ContextDecl__Group__0__Impl rule__ContextDecl__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ContextDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__1();

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
    // $ANTLR end "rule__ContextDecl__Group__0"


    // $ANTLR start "rule__ContextDecl__Group__0__Impl"
    // InternalDomainmodel.g:1182:1: rule__ContextDecl__Group__0__Impl : ( ( rule__ContextDecl__KindAssignment_0 ) ) ;
    public final void rule__ContextDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1186:1: ( ( ( rule__ContextDecl__KindAssignment_0 ) ) )
            // InternalDomainmodel.g:1187:1: ( ( rule__ContextDecl__KindAssignment_0 ) )
            {
            // InternalDomainmodel.g:1187:1: ( ( rule__ContextDecl__KindAssignment_0 ) )
            // InternalDomainmodel.g:1188:2: ( rule__ContextDecl__KindAssignment_0 )
            {
             before(grammarAccess.getContextDeclAccess().getKindAssignment_0()); 
            // InternalDomainmodel.g:1189:2: ( rule__ContextDecl__KindAssignment_0 )
            // InternalDomainmodel.g:1189:3: rule__ContextDecl__KindAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclAccess().getKindAssignment_0()); 

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
    // $ANTLR end "rule__ContextDecl__Group__0__Impl"


    // $ANTLR start "rule__ContextDecl__Group__1"
    // InternalDomainmodel.g:1197:1: rule__ContextDecl__Group__1 : rule__ContextDecl__Group__1__Impl rule__ContextDecl__Group__2 ;
    public final void rule__ContextDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1201:1: ( rule__ContextDecl__Group__1__Impl rule__ContextDecl__Group__2 )
            // InternalDomainmodel.g:1202:2: rule__ContextDecl__Group__1__Impl rule__ContextDecl__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ContextDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__2();

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
    // $ANTLR end "rule__ContextDecl__Group__1"


    // $ANTLR start "rule__ContextDecl__Group__1__Impl"
    // InternalDomainmodel.g:1209:1: rule__ContextDecl__Group__1__Impl : ( 'context' ) ;
    public final void rule__ContextDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1213:1: ( ( 'context' ) )
            // InternalDomainmodel.g:1214:1: ( 'context' )
            {
            // InternalDomainmodel.g:1214:1: ( 'context' )
            // InternalDomainmodel.g:1215:2: 'context'
            {
             before(grammarAccess.getContextDeclAccess().getContextKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getContextKeyword_1()); 

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
    // $ANTLR end "rule__ContextDecl__Group__1__Impl"


    // $ANTLR start "rule__ContextDecl__Group__2"
    // InternalDomainmodel.g:1224:1: rule__ContextDecl__Group__2 : rule__ContextDecl__Group__2__Impl rule__ContextDecl__Group__3 ;
    public final void rule__ContextDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1228:1: ( rule__ContextDecl__Group__2__Impl rule__ContextDecl__Group__3 )
            // InternalDomainmodel.g:1229:2: rule__ContextDecl__Group__2__Impl rule__ContextDecl__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ContextDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__3();

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
    // $ANTLR end "rule__ContextDecl__Group__2"


    // $ANTLR start "rule__ContextDecl__Group__2__Impl"
    // InternalDomainmodel.g:1236:1: rule__ContextDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__ContextDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1240:1: ( ( '{' ) )
            // InternalDomainmodel.g:1241:1: ( '{' )
            {
            // InternalDomainmodel.g:1241:1: ( '{' )
            // InternalDomainmodel.g:1242:2: '{'
            {
             before(grammarAccess.getContextDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ContextDecl__Group__2__Impl"


    // $ANTLR start "rule__ContextDecl__Group__3"
    // InternalDomainmodel.g:1251:1: rule__ContextDecl__Group__3 : rule__ContextDecl__Group__3__Impl rule__ContextDecl__Group__4 ;
    public final void rule__ContextDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1255:1: ( rule__ContextDecl__Group__3__Impl rule__ContextDecl__Group__4 )
            // InternalDomainmodel.g:1256:2: rule__ContextDecl__Group__3__Impl rule__ContextDecl__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ContextDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__4();

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
    // $ANTLR end "rule__ContextDecl__Group__3"


    // $ANTLR start "rule__ContextDecl__Group__3__Impl"
    // InternalDomainmodel.g:1263:1: rule__ContextDecl__Group__3__Impl : ( 'uses' ) ;
    public final void rule__ContextDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1267:1: ( ( 'uses' ) )
            // InternalDomainmodel.g:1268:1: ( 'uses' )
            {
            // InternalDomainmodel.g:1268:1: ( 'uses' )
            // InternalDomainmodel.g:1269:2: 'uses'
            {
             before(grammarAccess.getContextDeclAccess().getUsesKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getUsesKeyword_3()); 

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
    // $ANTLR end "rule__ContextDecl__Group__3__Impl"


    // $ANTLR start "rule__ContextDecl__Group__4"
    // InternalDomainmodel.g:1278:1: rule__ContextDecl__Group__4 : rule__ContextDecl__Group__4__Impl rule__ContextDecl__Group__5 ;
    public final void rule__ContextDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1282:1: ( rule__ContextDecl__Group__4__Impl rule__ContextDecl__Group__5 )
            // InternalDomainmodel.g:1283:2: rule__ContextDecl__Group__4__Impl rule__ContextDecl__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ContextDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__5();

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
    // $ANTLR end "rule__ContextDecl__Group__4"


    // $ANTLR start "rule__ContextDecl__Group__4__Impl"
    // InternalDomainmodel.g:1290:1: rule__ContextDecl__Group__4__Impl : ( ( rule__ContextDecl__UsedInterfacesAssignment_4 ) ) ;
    public final void rule__ContextDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1294:1: ( ( ( rule__ContextDecl__UsedInterfacesAssignment_4 ) ) )
            // InternalDomainmodel.g:1295:1: ( ( rule__ContextDecl__UsedInterfacesAssignment_4 ) )
            {
            // InternalDomainmodel.g:1295:1: ( ( rule__ContextDecl__UsedInterfacesAssignment_4 ) )
            // InternalDomainmodel.g:1296:2: ( rule__ContextDecl__UsedInterfacesAssignment_4 )
            {
             before(grammarAccess.getContextDeclAccess().getUsedInterfacesAssignment_4()); 
            // InternalDomainmodel.g:1297:2: ( rule__ContextDecl__UsedInterfacesAssignment_4 )
            // InternalDomainmodel.g:1297:3: rule__ContextDecl__UsedInterfacesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__UsedInterfacesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclAccess().getUsedInterfacesAssignment_4()); 

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
    // $ANTLR end "rule__ContextDecl__Group__4__Impl"


    // $ANTLR start "rule__ContextDecl__Group__5"
    // InternalDomainmodel.g:1305:1: rule__ContextDecl__Group__5 : rule__ContextDecl__Group__5__Impl rule__ContextDecl__Group__6 ;
    public final void rule__ContextDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1309:1: ( rule__ContextDecl__Group__5__Impl rule__ContextDecl__Group__6 )
            // InternalDomainmodel.g:1310:2: rule__ContextDecl__Group__5__Impl rule__ContextDecl__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__ContextDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__6();

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
    // $ANTLR end "rule__ContextDecl__Group__5"


    // $ANTLR start "rule__ContextDecl__Group__5__Impl"
    // InternalDomainmodel.g:1317:1: rule__ContextDecl__Group__5__Impl : ( ( rule__ContextDecl__Group_5__0 )* ) ;
    public final void rule__ContextDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1321:1: ( ( ( rule__ContextDecl__Group_5__0 )* ) )
            // InternalDomainmodel.g:1322:1: ( ( rule__ContextDecl__Group_5__0 )* )
            {
            // InternalDomainmodel.g:1322:1: ( ( rule__ContextDecl__Group_5__0 )* )
            // InternalDomainmodel.g:1323:2: ( rule__ContextDecl__Group_5__0 )*
            {
             before(grammarAccess.getContextDeclAccess().getGroup_5()); 
            // InternalDomainmodel.g:1324:2: ( rule__ContextDecl__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDomainmodel.g:1324:3: rule__ContextDecl__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ContextDecl__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getContextDeclAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ContextDecl__Group__5__Impl"


    // $ANTLR start "rule__ContextDecl__Group__6"
    // InternalDomainmodel.g:1332:1: rule__ContextDecl__Group__6 : rule__ContextDecl__Group__6__Impl rule__ContextDecl__Group__7 ;
    public final void rule__ContextDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1336:1: ( rule__ContextDecl__Group__6__Impl rule__ContextDecl__Group__7 )
            // InternalDomainmodel.g:1337:2: rule__ContextDecl__Group__6__Impl rule__ContextDecl__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__ContextDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__7();

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
    // $ANTLR end "rule__ContextDecl__Group__6"


    // $ANTLR start "rule__ContextDecl__Group__6__Impl"
    // InternalDomainmodel.g:1344:1: rule__ContextDecl__Group__6__Impl : ( ( rule__ContextDecl__Alternatives_6 )* ) ;
    public final void rule__ContextDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1348:1: ( ( ( rule__ContextDecl__Alternatives_6 )* ) )
            // InternalDomainmodel.g:1349:1: ( ( rule__ContextDecl__Alternatives_6 )* )
            {
            // InternalDomainmodel.g:1349:1: ( ( rule__ContextDecl__Alternatives_6 )* )
            // InternalDomainmodel.g:1350:2: ( rule__ContextDecl__Alternatives_6 )*
            {
             before(grammarAccess.getContextDeclAccess().getAlternatives_6()); 
            // InternalDomainmodel.g:1351:2: ( rule__ContextDecl__Alternatives_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDomainmodel.g:1351:3: rule__ContextDecl__Alternatives_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ContextDecl__Alternatives_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContextDeclAccess().getAlternatives_6()); 

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
    // $ANTLR end "rule__ContextDecl__Group__6__Impl"


    // $ANTLR start "rule__ContextDecl__Group__7"
    // InternalDomainmodel.g:1359:1: rule__ContextDecl__Group__7 : rule__ContextDecl__Group__7__Impl ;
    public final void rule__ContextDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1363:1: ( rule__ContextDecl__Group__7__Impl )
            // InternalDomainmodel.g:1364:2: rule__ContextDecl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group__7__Impl();

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
    // $ANTLR end "rule__ContextDecl__Group__7"


    // $ANTLR start "rule__ContextDecl__Group__7__Impl"
    // InternalDomainmodel.g:1370:1: rule__ContextDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__ContextDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1374:1: ( ( '}' ) )
            // InternalDomainmodel.g:1375:1: ( '}' )
            {
            // InternalDomainmodel.g:1375:1: ( '}' )
            // InternalDomainmodel.g:1376:2: '}'
            {
             before(grammarAccess.getContextDeclAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ContextDecl__Group__7__Impl"


    // $ANTLR start "rule__ContextDecl__Group_5__0"
    // InternalDomainmodel.g:1386:1: rule__ContextDecl__Group_5__0 : rule__ContextDecl__Group_5__0__Impl rule__ContextDecl__Group_5__1 ;
    public final void rule__ContextDecl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1390:1: ( rule__ContextDecl__Group_5__0__Impl rule__ContextDecl__Group_5__1 )
            // InternalDomainmodel.g:1391:2: rule__ContextDecl__Group_5__0__Impl rule__ContextDecl__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ContextDecl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group_5__1();

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
    // $ANTLR end "rule__ContextDecl__Group_5__0"


    // $ANTLR start "rule__ContextDecl__Group_5__0__Impl"
    // InternalDomainmodel.g:1398:1: rule__ContextDecl__Group_5__0__Impl : ( ',' ) ;
    public final void rule__ContextDecl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1402:1: ( ( ',' ) )
            // InternalDomainmodel.g:1403:1: ( ',' )
            {
            // InternalDomainmodel.g:1403:1: ( ',' )
            // InternalDomainmodel.g:1404:2: ','
            {
             before(grammarAccess.getContextDeclAccess().getCommaKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__ContextDecl__Group_5__0__Impl"


    // $ANTLR start "rule__ContextDecl__Group_5__1"
    // InternalDomainmodel.g:1413:1: rule__ContextDecl__Group_5__1 : rule__ContextDecl__Group_5__1__Impl ;
    public final void rule__ContextDecl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1417:1: ( rule__ContextDecl__Group_5__1__Impl )
            // InternalDomainmodel.g:1418:2: rule__ContextDecl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__Group_5__1__Impl();

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
    // $ANTLR end "rule__ContextDecl__Group_5__1"


    // $ANTLR start "rule__ContextDecl__Group_5__1__Impl"
    // InternalDomainmodel.g:1424:1: rule__ContextDecl__Group_5__1__Impl : ( ( rule__ContextDecl__UsedInterfacesAssignment_5_1 ) ) ;
    public final void rule__ContextDecl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1428:1: ( ( ( rule__ContextDecl__UsedInterfacesAssignment_5_1 ) ) )
            // InternalDomainmodel.g:1429:1: ( ( rule__ContextDecl__UsedInterfacesAssignment_5_1 ) )
            {
            // InternalDomainmodel.g:1429:1: ( ( rule__ContextDecl__UsedInterfacesAssignment_5_1 ) )
            // InternalDomainmodel.g:1430:2: ( rule__ContextDecl__UsedInterfacesAssignment_5_1 )
            {
             before(grammarAccess.getContextDeclAccess().getUsedInterfacesAssignment_5_1()); 
            // InternalDomainmodel.g:1431:2: ( rule__ContextDecl__UsedInterfacesAssignment_5_1 )
            // InternalDomainmodel.g:1431:3: rule__ContextDecl__UsedInterfacesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__UsedInterfacesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclAccess().getUsedInterfacesAssignment_5_1()); 

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
    // $ANTLR end "rule__ContextDecl__Group_5__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalDomainmodel.g:1440:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1444:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalDomainmodel.g:1445:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainmodel.g:1452:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1456:1: ( ( 'const' ) )
            // InternalDomainmodel.g:1457:1: ( 'const' )
            {
            // InternalDomainmodel.g:1457:1: ( 'const' )
            // InternalDomainmodel.g:1458:2: 'const'
            {
             before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDomainmodel.g:1467:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1471:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalDomainmodel.g:1472:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDomainmodel.g:1479:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__NameAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1483:1: ( ( ( rule__Constant__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1484:1: ( ( rule__Constant__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1484:1: ( ( rule__Constant__NameAssignment_1 ) )
            // InternalDomainmodel.g:1485:2: ( rule__Constant__NameAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1486:2: ( rule__Constant__NameAssignment_1 )
            // InternalDomainmodel.g:1486:3: rule__Constant__NameAssignment_1
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
    // InternalDomainmodel.g:1494:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1498:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalDomainmodel.g:1499:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalDomainmodel.g:1506:1: rule__Constant__Group__2__Impl : ( ':' ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1510:1: ( ( ':' ) )
            // InternalDomainmodel.g:1511:1: ( ':' )
            {
            // InternalDomainmodel.g:1511:1: ( ':' )
            // InternalDomainmodel.g:1512:2: ':'
            {
             before(grammarAccess.getConstantAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDomainmodel.g:1521:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1525:1: ( rule__Constant__Group__3__Impl )
            // InternalDomainmodel.g:1526:2: rule__Constant__Group__3__Impl
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
    // InternalDomainmodel.g:1532:1: rule__Constant__Group__3__Impl : ( ( rule__Constant__TypeAssignment_3 ) ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1536:1: ( ( ( rule__Constant__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:1537:1: ( ( rule__Constant__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:1537:1: ( ( rule__Constant__TypeAssignment_3 ) )
            // InternalDomainmodel.g:1538:2: ( rule__Constant__TypeAssignment_3 )
            {
             before(grammarAccess.getConstantAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:1539:2: ( rule__Constant__TypeAssignment_3 )
            // InternalDomainmodel.g:1539:3: rule__Constant__TypeAssignment_3
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalDomainmodel.g:1548:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1552:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalDomainmodel.g:1553:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainmodel.g:1560:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1564:1: ( ( 'var' ) )
            // InternalDomainmodel.g:1565:1: ( 'var' )
            {
            // InternalDomainmodel.g:1565:1: ( 'var' )
            // InternalDomainmodel.g:1566:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDomainmodel.g:1575:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1579:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalDomainmodel.g:1580:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDomainmodel.g:1587:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1591:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1592:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1592:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalDomainmodel.g:1593:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1594:2: ( rule__Variable__NameAssignment_1 )
            // InternalDomainmodel.g:1594:3: rule__Variable__NameAssignment_1
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
    // InternalDomainmodel.g:1602:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1606:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalDomainmodel.g:1607:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalDomainmodel.g:1614:1: rule__Variable__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1618:1: ( ( ':' ) )
            // InternalDomainmodel.g:1619:1: ( ':' )
            {
            // InternalDomainmodel.g:1619:1: ( ':' )
            // InternalDomainmodel.g:1620:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDomainmodel.g:1629:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1633:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalDomainmodel.g:1634:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDomainmodel.g:1641:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__TypeAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1645:1: ( ( ( rule__Variable__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:1646:1: ( ( rule__Variable__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:1646:1: ( ( rule__Variable__TypeAssignment_3 ) )
            // InternalDomainmodel.g:1647:2: ( rule__Variable__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:1648:2: ( rule__Variable__TypeAssignment_3 )
            // InternalDomainmodel.g:1648:3: rule__Variable__TypeAssignment_3
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
    // InternalDomainmodel.g:1656:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1660:1: ( rule__Variable__Group__4__Impl )
            // InternalDomainmodel.g:1661:2: rule__Variable__Group__4__Impl
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
    // InternalDomainmodel.g:1667:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1671:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalDomainmodel.g:1672:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalDomainmodel.g:1672:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalDomainmodel.g:1673:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalDomainmodel.g:1674:2: ( rule__Variable__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomainmodel.g:1674:3: rule__Variable__Group_4__0
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
    // InternalDomainmodel.g:1683:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1687:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalDomainmodel.g:1688:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDomainmodel.g:1695:1: rule__Variable__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1699:1: ( ( '=' ) )
            // InternalDomainmodel.g:1700:1: ( '=' )
            {
            // InternalDomainmodel.g:1700:1: ( '=' )
            // InternalDomainmodel.g:1701:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDomainmodel.g:1710:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1714:1: ( rule__Variable__Group_4__1__Impl )
            // InternalDomainmodel.g:1715:2: rule__Variable__Group_4__1__Impl
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
    // InternalDomainmodel.g:1721:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__InitialValueAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1725:1: ( ( ( rule__Variable__InitialValueAssignment_4_1 ) ) )
            // InternalDomainmodel.g:1726:1: ( ( rule__Variable__InitialValueAssignment_4_1 ) )
            {
            // InternalDomainmodel.g:1726:1: ( ( rule__Variable__InitialValueAssignment_4_1 ) )
            // InternalDomainmodel.g:1727:2: ( rule__Variable__InitialValueAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_4_1()); 
            // InternalDomainmodel.g:1728:2: ( rule__Variable__InitialValueAssignment_4_1 )
            // InternalDomainmodel.g:1728:3: rule__Variable__InitialValueAssignment_4_1
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


    // $ANTLR start "rule__Clock__Group__0"
    // InternalDomainmodel.g:1737:1: rule__Clock__Group__0 : rule__Clock__Group__0__Impl rule__Clock__Group__1 ;
    public final void rule__Clock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1741:1: ( rule__Clock__Group__0__Impl rule__Clock__Group__1 )
            // InternalDomainmodel.g:1742:2: rule__Clock__Group__0__Impl rule__Clock__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalDomainmodel.g:1749:1: rule__Clock__Group__0__Impl : ( 'clock' ) ;
    public final void rule__Clock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1753:1: ( ( 'clock' ) )
            // InternalDomainmodel.g:1754:1: ( 'clock' )
            {
            // InternalDomainmodel.g:1754:1: ( 'clock' )
            // InternalDomainmodel.g:1755:2: 'clock'
            {
             before(grammarAccess.getClockAccess().getClockKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDomainmodel.g:1764:1: rule__Clock__Group__1 : rule__Clock__Group__1__Impl rule__Clock__Group__2 ;
    public final void rule__Clock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1768:1: ( rule__Clock__Group__1__Impl rule__Clock__Group__2 )
            // InternalDomainmodel.g:1769:2: rule__Clock__Group__1__Impl rule__Clock__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalDomainmodel.g:1776:1: rule__Clock__Group__1__Impl : ( ( rule__Clock__NameAssignment_1 ) ) ;
    public final void rule__Clock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1780:1: ( ( ( rule__Clock__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1781:1: ( ( rule__Clock__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1781:1: ( ( rule__Clock__NameAssignment_1 ) )
            // InternalDomainmodel.g:1782:2: ( rule__Clock__NameAssignment_1 )
            {
             before(grammarAccess.getClockAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1783:2: ( rule__Clock__NameAssignment_1 )
            // InternalDomainmodel.g:1783:3: rule__Clock__NameAssignment_1
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
    // InternalDomainmodel.g:1791:1: rule__Clock__Group__2 : rule__Clock__Group__2__Impl ;
    public final void rule__Clock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1795:1: ( rule__Clock__Group__2__Impl )
            // InternalDomainmodel.g:1796:2: rule__Clock__Group__2__Impl
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
    // InternalDomainmodel.g:1802:1: rule__Clock__Group__2__Impl : ( ( rule__Clock__Group_2__0 )? ) ;
    public final void rule__Clock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1806:1: ( ( ( rule__Clock__Group_2__0 )? ) )
            // InternalDomainmodel.g:1807:1: ( ( rule__Clock__Group_2__0 )? )
            {
            // InternalDomainmodel.g:1807:1: ( ( rule__Clock__Group_2__0 )? )
            // InternalDomainmodel.g:1808:2: ( rule__Clock__Group_2__0 )?
            {
             before(grammarAccess.getClockAccess().getGroup_2()); 
            // InternalDomainmodel.g:1809:2: ( rule__Clock__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDomainmodel.g:1809:3: rule__Clock__Group_2__0
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
    // InternalDomainmodel.g:1818:1: rule__Clock__Group_2__0 : rule__Clock__Group_2__0__Impl rule__Clock__Group_2__1 ;
    public final void rule__Clock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1822:1: ( rule__Clock__Group_2__0__Impl rule__Clock__Group_2__1 )
            // InternalDomainmodel.g:1823:2: rule__Clock__Group_2__0__Impl rule__Clock__Group_2__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalDomainmodel.g:1830:1: rule__Clock__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Clock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1834:1: ( ( '=' ) )
            // InternalDomainmodel.g:1835:1: ( '=' )
            {
            // InternalDomainmodel.g:1835:1: ( '=' )
            // InternalDomainmodel.g:1836:2: '='
            {
             before(grammarAccess.getClockAccess().getEqualsSignKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDomainmodel.g:1845:1: rule__Clock__Group_2__1 : rule__Clock__Group_2__1__Impl ;
    public final void rule__Clock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1849:1: ( rule__Clock__Group_2__1__Impl )
            // InternalDomainmodel.g:1850:2: rule__Clock__Group_2__1__Impl
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
    // InternalDomainmodel.g:1856:1: rule__Clock__Group_2__1__Impl : ( ( rule__Clock__InitialValueAssignment_2_1 ) ) ;
    public final void rule__Clock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1860:1: ( ( ( rule__Clock__InitialValueAssignment_2_1 ) ) )
            // InternalDomainmodel.g:1861:1: ( ( rule__Clock__InitialValueAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:1861:1: ( ( rule__Clock__InitialValueAssignment_2_1 ) )
            // InternalDomainmodel.g:1862:2: ( rule__Clock__InitialValueAssignment_2_1 )
            {
             before(grammarAccess.getClockAccess().getInitialValueAssignment_2_1()); 
            // InternalDomainmodel.g:1863:2: ( rule__Clock__InitialValueAssignment_2_1 )
            // InternalDomainmodel.g:1863:3: rule__Clock__InitialValueAssignment_2_1
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


    // $ANTLR start "rule__CycleDef__Group__0"
    // InternalDomainmodel.g:1872:1: rule__CycleDef__Group__0 : rule__CycleDef__Group__0__Impl rule__CycleDef__Group__1 ;
    public final void rule__CycleDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1876:1: ( rule__CycleDef__Group__0__Impl rule__CycleDef__Group__1 )
            // InternalDomainmodel.g:1877:2: rule__CycleDef__Group__0__Impl rule__CycleDef__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalDomainmodel.g:1884:1: rule__CycleDef__Group__0__Impl : ( 'cycleDef' ) ;
    public final void rule__CycleDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1888:1: ( ( 'cycleDef' ) )
            // InternalDomainmodel.g:1889:1: ( 'cycleDef' )
            {
            // InternalDomainmodel.g:1889:1: ( 'cycleDef' )
            // InternalDomainmodel.g:1890:2: 'cycleDef'
            {
             before(grammarAccess.getCycleDefAccess().getCycleDefKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDomainmodel.g:1899:1: rule__CycleDef__Group__1 : rule__CycleDef__Group__1__Impl rule__CycleDef__Group__2 ;
    public final void rule__CycleDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1903:1: ( rule__CycleDef__Group__1__Impl rule__CycleDef__Group__2 )
            // InternalDomainmodel.g:1904:2: rule__CycleDef__Group__1__Impl rule__CycleDef__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalDomainmodel.g:1911:1: rule__CycleDef__Group__1__Impl : ( 'cycle' ) ;
    public final void rule__CycleDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1915:1: ( ( 'cycle' ) )
            // InternalDomainmodel.g:1916:1: ( 'cycle' )
            {
            // InternalDomainmodel.g:1916:1: ( 'cycle' )
            // InternalDomainmodel.g:1917:2: 'cycle'
            {
             before(grammarAccess.getCycleDefAccess().getCycleKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDomainmodel.g:1926:1: rule__CycleDef__Group__2 : rule__CycleDef__Group__2__Impl rule__CycleDef__Group__3 ;
    public final void rule__CycleDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1930:1: ( rule__CycleDef__Group__2__Impl rule__CycleDef__Group__3 )
            // InternalDomainmodel.g:1931:2: rule__CycleDef__Group__2__Impl rule__CycleDef__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalDomainmodel.g:1938:1: rule__CycleDef__Group__2__Impl : ( '==' ) ;
    public final void rule__CycleDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1942:1: ( ( '==' ) )
            // InternalDomainmodel.g:1943:1: ( '==' )
            {
            // InternalDomainmodel.g:1943:1: ( '==' )
            // InternalDomainmodel.g:1944:2: '=='
            {
             before(grammarAccess.getCycleDefAccess().getEqualsSignEqualsSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDomainmodel.g:1953:1: rule__CycleDef__Group__3 : rule__CycleDef__Group__3__Impl ;
    public final void rule__CycleDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1957:1: ( rule__CycleDef__Group__3__Impl )
            // InternalDomainmodel.g:1958:2: rule__CycleDef__Group__3__Impl
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
    // InternalDomainmodel.g:1964:1: rule__CycleDef__Group__3__Impl : ( ( rule__CycleDef__ValueAssignment_3 ) ) ;
    public final void rule__CycleDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1968:1: ( ( ( rule__CycleDef__ValueAssignment_3 ) ) )
            // InternalDomainmodel.g:1969:1: ( ( rule__CycleDef__ValueAssignment_3 ) )
            {
            // InternalDomainmodel.g:1969:1: ( ( rule__CycleDef__ValueAssignment_3 ) )
            // InternalDomainmodel.g:1970:2: ( rule__CycleDef__ValueAssignment_3 )
            {
             before(grammarAccess.getCycleDefAccess().getValueAssignment_3()); 
            // InternalDomainmodel.g:1971:2: ( rule__CycleDef__ValueAssignment_3 )
            // InternalDomainmodel.g:1971:3: rule__CycleDef__ValueAssignment_3
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


    // $ANTLR start "rule__Model__InterfaceAssignment_0"
    // InternalDomainmodel.g:1980:1: rule__Model__InterfaceAssignment_0 : ( ruleInterface ) ;
    public final void rule__Model__InterfaceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1984:1: ( ( ruleInterface ) )
            // InternalDomainmodel.g:1985:2: ( ruleInterface )
            {
            // InternalDomainmodel.g:1985:2: ( ruleInterface )
            // InternalDomainmodel.g:1986:3: ruleInterface
            {
             before(grammarAccess.getModelAccess().getInterfaceInterfaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInterfaceInterfaceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__InterfaceAssignment_0"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalDomainmodel.g:1995:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1999:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2000:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2000:2: ( RULE_ID )
            // InternalDomainmodel.g:2001:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__CycleDefAssignment_4"
    // InternalDomainmodel.g:2010:1: rule__Model__CycleDefAssignment_4 : ( ruleCycleDef ) ;
    public final void rule__Model__CycleDefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2014:1: ( ( ruleCycleDef ) )
            // InternalDomainmodel.g:2015:2: ( ruleCycleDef )
            {
            // InternalDomainmodel.g:2015:2: ( ruleCycleDef )
            // InternalDomainmodel.g:2016:3: ruleCycleDef
            {
             before(grammarAccess.getModelAccess().getCycleDefCycleDefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCycleDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCycleDefCycleDefParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__CycleDefAssignment_4"


    // $ANTLR start "rule__Model__ConstantsAssignment_5"
    // InternalDomainmodel.g:2025:1: rule__Model__ConstantsAssignment_5 : ( ruleConstant ) ;
    public final void rule__Model__ConstantsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2029:1: ( ( ruleConstant ) )
            // InternalDomainmodel.g:2030:2: ( ruleConstant )
            {
            // InternalDomainmodel.g:2030:2: ( ruleConstant )
            // InternalDomainmodel.g:2031:3: ruleConstant
            {
             before(grammarAccess.getModelAccess().getConstantsConstantParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getModelAccess().getConstantsConstantParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__ConstantsAssignment_5"


    // $ANTLR start "rule__Model__VariablesAssignment_6"
    // InternalDomainmodel.g:2040:1: rule__Model__VariablesAssignment_6 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2044:1: ( ( ruleVariable ) )
            // InternalDomainmodel.g:2045:2: ( ruleVariable )
            {
            // InternalDomainmodel.g:2045:2: ( ruleVariable )
            // InternalDomainmodel.g:2046:3: ruleVariable
            {
             before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__VariablesAssignment_6"


    // $ANTLR start "rule__Model__ClockAssignment_7"
    // InternalDomainmodel.g:2055:1: rule__Model__ClockAssignment_7 : ( ruleClock ) ;
    public final void rule__Model__ClockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2059:1: ( ( ruleClock ) )
            // InternalDomainmodel.g:2060:2: ( ruleClock )
            {
            // InternalDomainmodel.g:2060:2: ( ruleClock )
            // InternalDomainmodel.g:2061:3: ruleClock
            {
             before(grammarAccess.getModelAccess().getClockClockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleClock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClockClockParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__ClockAssignment_7"


    // $ANTLR start "rule__Model__ContextsAssignment_8"
    // InternalDomainmodel.g:2070:1: rule__Model__ContextsAssignment_8 : ( ruleContextDecl ) ;
    public final void rule__Model__ContextsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2074:1: ( ( ruleContextDecl ) )
            // InternalDomainmodel.g:2075:2: ( ruleContextDecl )
            {
            // InternalDomainmodel.g:2075:2: ( ruleContextDecl )
            // InternalDomainmodel.g:2076:3: ruleContextDecl
            {
             before(grammarAccess.getModelAccess().getContextsContextDeclParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleContextDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContextsContextDeclParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Model__ContextsAssignment_8"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalDomainmodel.g:2085:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2089:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2090:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2090:2: ( RULE_ID )
            // InternalDomainmodel.g:2091:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__OperationsAssignment_3_0"
    // InternalDomainmodel.g:2100:1: rule__Interface__OperationsAssignment_3_0 : ( ruleOperationDecl ) ;
    public final void rule__Interface__OperationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2104:1: ( ( ruleOperationDecl ) )
            // InternalDomainmodel.g:2105:2: ( ruleOperationDecl )
            {
            // InternalDomainmodel.g:2105:2: ( ruleOperationDecl )
            // InternalDomainmodel.g:2106:3: ruleOperationDecl
            {
             before(grammarAccess.getInterfaceAccess().getOperationsOperationDeclParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDecl();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getOperationsOperationDeclParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Interface__OperationsAssignment_3_0"


    // $ANTLR start "rule__Interface__EventsAssignment_3_1"
    // InternalDomainmodel.g:2115:1: rule__Interface__EventsAssignment_3_1 : ( ruleEventDecl ) ;
    public final void rule__Interface__EventsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2119:1: ( ( ruleEventDecl ) )
            // InternalDomainmodel.g:2120:2: ( ruleEventDecl )
            {
            // InternalDomainmodel.g:2120:2: ( ruleEventDecl )
            // InternalDomainmodel.g:2121:3: ruleEventDecl
            {
             before(grammarAccess.getInterfaceAccess().getEventsEventDeclParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDecl();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getEventsEventDeclParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Interface__EventsAssignment_3_1"


    // $ANTLR start "rule__OperationDecl__NameAssignment_0"
    // InternalDomainmodel.g:2130:1: rule__OperationDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OperationDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2134:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2135:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2135:2: ( RULE_ID )
            // InternalDomainmodel.g:2136:3: RULE_ID
            {
             before(grammarAccess.getOperationDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOperationDeclAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__OperationDecl__NameAssignment_0"


    // $ANTLR start "rule__OperationDecl__ParamsAssignment_2_0"
    // InternalDomainmodel.g:2145:1: rule__OperationDecl__ParamsAssignment_2_0 : ( ruleParam ) ;
    public final void rule__OperationDecl__ParamsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2149:1: ( ( ruleParam ) )
            // InternalDomainmodel.g:2150:2: ( ruleParam )
            {
            // InternalDomainmodel.g:2150:2: ( ruleParam )
            // InternalDomainmodel.g:2151:3: ruleParam
            {
             before(grammarAccess.getOperationDeclAccess().getParamsParamParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getOperationDeclAccess().getParamsParamParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__OperationDecl__ParamsAssignment_2_0"


    // $ANTLR start "rule__OperationDecl__ParamsAssignment_2_1_1"
    // InternalDomainmodel.g:2160:1: rule__OperationDecl__ParamsAssignment_2_1_1 : ( ruleParam ) ;
    public final void rule__OperationDecl__ParamsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2164:1: ( ( ruleParam ) )
            // InternalDomainmodel.g:2165:2: ( ruleParam )
            {
            // InternalDomainmodel.g:2165:2: ( ruleParam )
            // InternalDomainmodel.g:2166:3: ruleParam
            {
             before(grammarAccess.getOperationDeclAccess().getParamsParamParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getOperationDeclAccess().getParamsParamParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__OperationDecl__ParamsAssignment_2_1_1"


    // $ANTLR start "rule__EventDecl__NameAssignment_1"
    // InternalDomainmodel.g:2175:1: rule__EventDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EventDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2179:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2180:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2180:2: ( RULE_ID )
            // InternalDomainmodel.g:2181:3: RULE_ID
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


    // $ANTLR start "rule__Param__NameAssignment_0"
    // InternalDomainmodel.g:2190:1: rule__Param__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2194:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2195:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2195:2: ( RULE_ID )
            // InternalDomainmodel.g:2196:3: RULE_ID
            {
             before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__NameAssignment_0"


    // $ANTLR start "rule__Param__TypeAssignment_2"
    // InternalDomainmodel.g:2205:1: rule__Param__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Param__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2209:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:2210:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:2210:2: ( ruleDataType )
            // InternalDomainmodel.g:2211:3: ruleDataType
            {
             before(grammarAccess.getParamAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getParamAccess().getTypeDataTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Param__TypeAssignment_2"


    // $ANTLR start "rule__ContextDecl__KindAssignment_0"
    // InternalDomainmodel.g:2220:1: rule__ContextDecl__KindAssignment_0 : ( ( rule__ContextDecl__KindAlternatives_0_0 ) ) ;
    public final void rule__ContextDecl__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2224:1: ( ( ( rule__ContextDecl__KindAlternatives_0_0 ) ) )
            // InternalDomainmodel.g:2225:2: ( ( rule__ContextDecl__KindAlternatives_0_0 ) )
            {
            // InternalDomainmodel.g:2225:2: ( ( rule__ContextDecl__KindAlternatives_0_0 ) )
            // InternalDomainmodel.g:2226:3: ( rule__ContextDecl__KindAlternatives_0_0 )
            {
             before(grammarAccess.getContextDeclAccess().getKindAlternatives_0_0()); 
            // InternalDomainmodel.g:2227:3: ( rule__ContextDecl__KindAlternatives_0_0 )
            // InternalDomainmodel.g:2227:4: rule__ContextDecl__KindAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextDecl__KindAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getContextDeclAccess().getKindAlternatives_0_0()); 

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
    // $ANTLR end "rule__ContextDecl__KindAssignment_0"


    // $ANTLR start "rule__ContextDecl__UsedInterfacesAssignment_4"
    // InternalDomainmodel.g:2235:1: rule__ContextDecl__UsedInterfacesAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ContextDecl__UsedInterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2239:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:2240:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:2240:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2241:3: ( RULE_ID )
            {
             before(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceCrossReference_4_0()); 
            // InternalDomainmodel.g:2242:3: ( RULE_ID )
            // InternalDomainmodel.g:2243:4: RULE_ID
            {
             before(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceCrossReference_4_0()); 

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
    // $ANTLR end "rule__ContextDecl__UsedInterfacesAssignment_4"


    // $ANTLR start "rule__ContextDecl__UsedInterfacesAssignment_5_1"
    // InternalDomainmodel.g:2254:1: rule__ContextDecl__UsedInterfacesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ContextDecl__UsedInterfacesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2258:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:2259:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:2259:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2260:3: ( RULE_ID )
            {
             before(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceCrossReference_5_1_0()); 
            // InternalDomainmodel.g:2261:3: ( RULE_ID )
            // InternalDomainmodel.g:2262:4: RULE_ID
            {
             before(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getContextDeclAccess().getUsedInterfacesInterfaceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ContextDecl__UsedInterfacesAssignment_5_1"


    // $ANTLR start "rule__ContextDecl__OpsAssignment_6_0"
    // InternalDomainmodel.g:2273:1: rule__ContextDecl__OpsAssignment_6_0 : ( ruleOperationDecl ) ;
    public final void rule__ContextDecl__OpsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2277:1: ( ( ruleOperationDecl ) )
            // InternalDomainmodel.g:2278:2: ( ruleOperationDecl )
            {
            // InternalDomainmodel.g:2278:2: ( ruleOperationDecl )
            // InternalDomainmodel.g:2279:3: ruleOperationDecl
            {
             before(grammarAccess.getContextDeclAccess().getOpsOperationDeclParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationDecl();

            state._fsp--;

             after(grammarAccess.getContextDeclAccess().getOpsOperationDeclParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__ContextDecl__OpsAssignment_6_0"


    // $ANTLR start "rule__ContextDecl__EventsAssignment_6_1"
    // InternalDomainmodel.g:2288:1: rule__ContextDecl__EventsAssignment_6_1 : ( ruleEventDecl ) ;
    public final void rule__ContextDecl__EventsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2292:1: ( ( ruleEventDecl ) )
            // InternalDomainmodel.g:2293:2: ( ruleEventDecl )
            {
            // InternalDomainmodel.g:2293:2: ( ruleEventDecl )
            // InternalDomainmodel.g:2294:3: ruleEventDecl
            {
             before(grammarAccess.getContextDeclAccess().getEventsEventDeclParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventDecl();

            state._fsp--;

             after(grammarAccess.getContextDeclAccess().getEventsEventDeclParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__ContextDecl__EventsAssignment_6_1"


    // $ANTLR start "rule__Constant__NameAssignment_1"
    // InternalDomainmodel.g:2303:1: rule__Constant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2307:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2308:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2308:2: ( RULE_ID )
            // InternalDomainmodel.g:2309:3: RULE_ID
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
    // InternalDomainmodel.g:2318:1: rule__Constant__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Constant__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2322:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:2323:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:2323:2: ( ruleDataType )
            // InternalDomainmodel.g:2324:3: ruleDataType
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


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalDomainmodel.g:2333:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2337:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2338:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2338:2: ( RULE_ID )
            // InternalDomainmodel.g:2339:3: RULE_ID
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
    // InternalDomainmodel.g:2348:1: rule__Variable__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2352:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:2353:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:2353:2: ( ruleDataType )
            // InternalDomainmodel.g:2354:3: ruleDataType
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
    // InternalDomainmodel.g:2363:1: rule__Variable__InitialValueAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Variable__InitialValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2367:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:2368:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:2368:2: ( RULE_INT )
            // InternalDomainmodel.g:2369:3: RULE_INT
            {
             before(grammarAccess.getVariableAccess().getInitialValueINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getInitialValueINTTerminalRuleCall_4_1_0()); 

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


    // $ANTLR start "rule__Clock__NameAssignment_1"
    // InternalDomainmodel.g:2378:1: rule__Clock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Clock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2382:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:2383:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:2383:2: ( RULE_ID )
            // InternalDomainmodel.g:2384:3: RULE_ID
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
    // InternalDomainmodel.g:2393:1: rule__Clock__InitialValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Clock__InitialValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2397:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:2398:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:2398:2: ( RULE_INT )
            // InternalDomainmodel.g:2399:3: RULE_INT
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


    // $ANTLR start "rule__CycleDef__ValueAssignment_3"
    // InternalDomainmodel.g:2408:1: rule__CycleDef__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__CycleDef__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:2412:1: ( ( RULE_INT ) )
            // InternalDomainmodel.g:2413:2: ( RULE_INT )
            {
            // InternalDomainmodel.g:2413:2: ( RULE_INT )
            // InternalDomainmodel.g:2414:3: RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000001B0081800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001880010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});

}