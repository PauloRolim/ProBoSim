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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NAT'", "'INT'", "'REAL'", "'true'", "'false'", "'BOOL'", "'stm'", "'{'", "'}'", "'var'", "':'", "'='"
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


    // $ANTLR start "entryRuleValue"
    // InternalDomainmodel.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleValue EOF )
            // InternalDomainmodel.g:105:1: ruleValue EOF
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
    // InternalDomainmodel.g:112:1: ruleValue : ( ( rule__Value__ValueAssignment ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__Value__ValueAssignment ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__Value__ValueAssignment ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__Value__ValueAssignment ) )
            // InternalDomainmodel.g:118:3: ( rule__Value__ValueAssignment )
            {
             before(grammarAccess.getValueAccess().getValueAssignment()); 
            // InternalDomainmodel.g:119:3: ( rule__Value__ValueAssignment )
            // InternalDomainmodel.g:119:4: rule__Value__ValueAssignment
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
    // InternalDomainmodel.g:128:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:132:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalDomainmodel.g:133:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalDomainmodel.g:133:2: ( ( rule__DataType__Alternatives ) )
            // InternalDomainmodel.g:134:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:135:3: ( rule__DataType__Alternatives )
            // InternalDomainmodel.g:135:4: rule__DataType__Alternatives
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


    // $ANTLR start "rule__Value__ValueAlternatives_0"
    // InternalDomainmodel.g:143:1: rule__Value__ValueAlternatives_0 : ( ( 'NAT' ) | ( 'INT' ) | ( 'REAL' ) | ( 'true' ) | ( 'false' ) );
    public final void rule__Value__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:147:1: ( ( 'NAT' ) | ( 'INT' ) | ( 'REAL' ) | ( 'true' ) | ( 'false' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDomainmodel.g:148:2: ( 'NAT' )
                    {
                    // InternalDomainmodel.g:148:2: ( 'NAT' )
                    // InternalDomainmodel.g:149:3: 'NAT'
                    {
                     before(grammarAccess.getValueAccess().getValueNATKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueNATKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:154:2: ( 'INT' )
                    {
                    // InternalDomainmodel.g:154:2: ( 'INT' )
                    // InternalDomainmodel.g:155:3: 'INT'
                    {
                     before(grammarAccess.getValueAccess().getValueINTKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueINTKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:160:2: ( 'REAL' )
                    {
                    // InternalDomainmodel.g:160:2: ( 'REAL' )
                    // InternalDomainmodel.g:161:3: 'REAL'
                    {
                     before(grammarAccess.getValueAccess().getValueREALKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueREALKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:166:2: ( 'true' )
                    {
                    // InternalDomainmodel.g:166:2: ( 'true' )
                    // InternalDomainmodel.g:167:3: 'true'
                    {
                     before(grammarAccess.getValueAccess().getValueTrueKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getValueTrueKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:172:2: ( 'false' )
                    {
                    // InternalDomainmodel.g:172:2: ( 'false' )
                    // InternalDomainmodel.g:173:3: 'false'
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
    // InternalDomainmodel.g:182:1: rule__DataType__Alternatives : ( ( ( 'NAT' ) ) | ( ( 'INT' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:186:1: ( ( ( 'NAT' ) ) | ( ( 'INT' ) ) | ( ( 'REAL' ) ) | ( ( 'BOOL' ) ) )
            int alt2=4;
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
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:187:2: ( ( 'NAT' ) )
                    {
                    // InternalDomainmodel.g:187:2: ( ( 'NAT' ) )
                    // InternalDomainmodel.g:188:3: ( 'NAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0()); 
                    // InternalDomainmodel.g:189:3: ( 'NAT' )
                    // InternalDomainmodel.g:189:4: 'NAT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getNATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:193:2: ( ( 'INT' ) )
                    {
                    // InternalDomainmodel.g:193:2: ( ( 'INT' ) )
                    // InternalDomainmodel.g:194:3: ( 'INT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 
                    // InternalDomainmodel.g:195:3: ( 'INT' )
                    // InternalDomainmodel.g:195:4: 'INT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:199:2: ( ( 'REAL' ) )
                    {
                    // InternalDomainmodel.g:199:2: ( ( 'REAL' ) )
                    // InternalDomainmodel.g:200:3: ( 'REAL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDomainmodel.g:201:3: ( 'REAL' )
                    // InternalDomainmodel.g:201:4: 'REAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getREALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:205:2: ( ( 'BOOL' ) )
                    {
                    // InternalDomainmodel.g:205:2: ( ( 'BOOL' ) )
                    // InternalDomainmodel.g:206:3: ( 'BOOL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_3()); 
                    // InternalDomainmodel.g:207:3: ( 'BOOL' )
                    // InternalDomainmodel.g:207:4: 'BOOL'
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
    // InternalDomainmodel.g:215:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:219:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDomainmodel.g:220:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDomainmodel.g:227:1: rule__Model__Group__0__Impl : ( 'stm' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:231:1: ( ( 'stm' ) )
            // InternalDomainmodel.g:232:1: ( 'stm' )
            {
            // InternalDomainmodel.g:232:1: ( 'stm' )
            // InternalDomainmodel.g:233:2: 'stm'
            {
             before(grammarAccess.getModelAccess().getStmKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getStmKeyword_0()); 

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
    // InternalDomainmodel.g:242:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:246:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDomainmodel.g:247:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalDomainmodel.g:254:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:258:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:259:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:259:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalDomainmodel.g:260:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:261:2: ( rule__Model__NameAssignment_1 )
            // InternalDomainmodel.g:261:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // InternalDomainmodel.g:269:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:273:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalDomainmodel.g:274:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalDomainmodel.g:281:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:285:1: ( ( '{' ) )
            // InternalDomainmodel.g:286:1: ( '{' )
            {
            // InternalDomainmodel.g:286:1: ( '{' )
            // InternalDomainmodel.g:287:2: '{'
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
    // InternalDomainmodel.g:296:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:300:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalDomainmodel.g:301:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalDomainmodel.g:308:1: rule__Model__Group__3__Impl : ( ( rule__Model__VariablesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:312:1: ( ( ( rule__Model__VariablesAssignment_3 )* ) )
            // InternalDomainmodel.g:313:1: ( ( rule__Model__VariablesAssignment_3 )* )
            {
            // InternalDomainmodel.g:313:1: ( ( rule__Model__VariablesAssignment_3 )* )
            // InternalDomainmodel.g:314:2: ( rule__Model__VariablesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_3()); 
            // InternalDomainmodel.g:315:2: ( rule__Model__VariablesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomainmodel.g:315:3: rule__Model__VariablesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__VariablesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment_3()); 

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
    // InternalDomainmodel.g:323:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:327:1: ( rule__Model__Group__4__Impl )
            // InternalDomainmodel.g:328:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__4__Impl();

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
    // InternalDomainmodel.g:334:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:338:1: ( ( '}' ) )
            // InternalDomainmodel.g:339:1: ( '}' )
            {
            // InternalDomainmodel.g:339:1: ( '}' )
            // InternalDomainmodel.g:340:2: '}'
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalDomainmodel.g:350:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:354:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalDomainmodel.g:355:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalDomainmodel.g:362:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:366:1: ( ( 'var' ) )
            // InternalDomainmodel.g:367:1: ( 'var' )
            {
            // InternalDomainmodel.g:367:1: ( 'var' )
            // InternalDomainmodel.g:368:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDomainmodel.g:377:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:381:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalDomainmodel.g:382:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalDomainmodel.g:389:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:393:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:394:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:394:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalDomainmodel.g:395:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:396:2: ( rule__Variable__NameAssignment_1 )
            // InternalDomainmodel.g:396:3: rule__Variable__NameAssignment_1
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
    // InternalDomainmodel.g:404:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:408:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalDomainmodel.g:409:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDomainmodel.g:416:1: rule__Variable__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:420:1: ( ( ':' ) )
            // InternalDomainmodel.g:421:1: ( ':' )
            {
            // InternalDomainmodel.g:421:1: ( ':' )
            // InternalDomainmodel.g:422:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDomainmodel.g:431:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:435:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalDomainmodel.g:436:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDomainmodel.g:443:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__TypeAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:447:1: ( ( ( rule__Variable__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:448:1: ( ( rule__Variable__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:448:1: ( ( rule__Variable__TypeAssignment_3 ) )
            // InternalDomainmodel.g:449:2: ( rule__Variable__TypeAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:450:2: ( rule__Variable__TypeAssignment_3 )
            // InternalDomainmodel.g:450:3: rule__Variable__TypeAssignment_3
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
    // InternalDomainmodel.g:458:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:462:1: ( rule__Variable__Group__4__Impl )
            // InternalDomainmodel.g:463:2: rule__Variable__Group__4__Impl
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
    // InternalDomainmodel.g:469:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:473:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalDomainmodel.g:474:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalDomainmodel.g:474:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalDomainmodel.g:475:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalDomainmodel.g:476:2: ( rule__Variable__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:476:3: rule__Variable__Group_4__0
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
    // InternalDomainmodel.g:485:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:489:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalDomainmodel.g:490:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDomainmodel.g:497:1: rule__Variable__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:501:1: ( ( '=' ) )
            // InternalDomainmodel.g:502:1: ( '=' )
            {
            // InternalDomainmodel.g:502:1: ( '=' )
            // InternalDomainmodel.g:503:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDomainmodel.g:512:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:516:1: ( rule__Variable__Group_4__1__Impl )
            // InternalDomainmodel.g:517:2: rule__Variable__Group_4__1__Impl
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
    // InternalDomainmodel.g:523:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__InitialValueAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:527:1: ( ( ( rule__Variable__InitialValueAssignment_4_1 ) ) )
            // InternalDomainmodel.g:528:1: ( ( rule__Variable__InitialValueAssignment_4_1 ) )
            {
            // InternalDomainmodel.g:528:1: ( ( rule__Variable__InitialValueAssignment_4_1 ) )
            // InternalDomainmodel.g:529:2: ( rule__Variable__InitialValueAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getInitialValueAssignment_4_1()); 
            // InternalDomainmodel.g:530:2: ( rule__Variable__InitialValueAssignment_4_1 )
            // InternalDomainmodel.g:530:3: rule__Variable__InitialValueAssignment_4_1
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


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalDomainmodel.g:539:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:543:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:544:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:544:2: ( RULE_ID )
            // InternalDomainmodel.g:545:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__VariablesAssignment_3"
    // InternalDomainmodel.g:554:1: rule__Model__VariablesAssignment_3 : ( ruleVariable ) ;
    public final void rule__Model__VariablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:558:1: ( ( ruleVariable ) )
            // InternalDomainmodel.g:559:2: ( ruleVariable )
            {
            // InternalDomainmodel.g:559:2: ( ruleVariable )
            // InternalDomainmodel.g:560:3: ruleVariable
            {
             before(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesVariableParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__VariablesAssignment_3"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalDomainmodel.g:569:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:573:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:574:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:574:2: ( RULE_ID )
            // InternalDomainmodel.g:575:3: RULE_ID
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
    // InternalDomainmodel.g:584:1: rule__Variable__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__Variable__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:588:1: ( ( ruleDataType ) )
            // InternalDomainmodel.g:589:2: ( ruleDataType )
            {
            // InternalDomainmodel.g:589:2: ( ruleDataType )
            // InternalDomainmodel.g:590:3: ruleDataType
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
    // InternalDomainmodel.g:599:1: rule__Variable__InitialValueAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Variable__InitialValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:603:1: ( ( ruleValue ) )
            // InternalDomainmodel.g:604:2: ( ruleValue )
            {
            // InternalDomainmodel.g:604:2: ( ruleValue )
            // InternalDomainmodel.g:605:3: ruleValue
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


    // $ANTLR start "rule__Value__ValueAssignment"
    // InternalDomainmodel.g:614:1: rule__Value__ValueAssignment : ( ( rule__Value__ValueAlternatives_0 ) ) ;
    public final void rule__Value__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:618:1: ( ( ( rule__Value__ValueAlternatives_0 ) ) )
            // InternalDomainmodel.g:619:2: ( ( rule__Value__ValueAlternatives_0 ) )
            {
            // InternalDomainmodel.g:619:2: ( ( rule__Value__ValueAlternatives_0 ) )
            // InternalDomainmodel.g:620:3: ( rule__Value__ValueAlternatives_0 )
            {
             before(grammarAccess.getValueAccess().getValueAlternatives_0()); 
            // InternalDomainmodel.g:621:3: ( rule__Value__ValueAlternatives_0 )
            // InternalDomainmodel.g:621:4: rule__Value__ValueAlternatives_0
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F800L});

}