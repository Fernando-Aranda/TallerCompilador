// Generated from Digital.g4 by ANTLR 4.4
package com.fundamentos.cs.interprete;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.fundamentos.cs.interprete.ast.*;
	

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DigitalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, IF=4, ELSE=5, WHILE=6, FOR=7, PLUS=8, MINUS=9, 
		MULT=10, DIV=11, MOD=12, AND=13, OR=14, NOT=15, GT=16, LT=17, GEQ=18, 
		LEQ=19, EQ=20, NEQ=21, ASSIGN=22, BRACKET_OP=23, BRACKET_CLOSE=24, PAR_OPEN=25, 
		PAR_CLOSE=26, SEMICOLON=27, BOOLEAN=28, ID=29, STRING=30, FLOAT=31, NUMBER=32, 
		WS=33, COMMENT=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'digimon'", "'digital'", "'digitalk'", "'digivolution_if'", 
		"'digivolution_else'", "'training'", "'fight'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
		"'='", "'{'", "'}'", "'('", "')'", "';'", "BOOLEAN", "ID", "STRING", "FLOAT", 
		"NUMBER", "WS", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_println = 2, RULE_while_loop = 3, 
		RULE_for_loop = 4, RULE_conditional = 5, RULE_var_decl = 6, RULE_var_assign = 7, 
		RULE_expression = 8, RULE_factor = 9, RULE_term = 10;
	public static final String[] ruleNames = {
		"program", "sentence", "println", "while_loop", "for_loop", "conditional", 
		"var_decl", "var_assign", "expression", "factor", "term"
	};

	@Override
	public String getGrammarFileName() { return "Digital.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();

	public DigitalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public TerminalNode ID() { return getToken(DigitalParser.ID, 0); }
		public TerminalNode BRACKET_OP() { return getToken(DigitalParser.BRACKET_OP, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(DigitalParser.BRACKET_CLOSE, 0); }
		public TerminalNode PROGRAM() { return getToken(DigitalParser.PROGRAM, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(PROGRAM);
			setState(23); match(ID);
			setState(24); match(BRACKET_OP);

					List<ASTNode> body = new ArrayList<ASTNode>(); 
					Map<String, Object> symbolTable = new HashMap<String,Object>();
				
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(26); ((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(BRACKET_CLOSE);

					for(ASTNode n: body){
						n.execute(symbolTable);
					}	
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintlnContext println;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public While_loopContext while_loop;
		public For_loopContext for_loop;
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case PRINTLN:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); ((SentenceContext)_localctx).println = println();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).println.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); ((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); ((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); ((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(49); ((SentenceContext)_localctx).while_loop = while_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).while_loop.node;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(52); ((SentenceContext)_localctx).for_loop = for_loop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).for_loop.node;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintlnContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(DigitalParser.SEMICOLON, 0); }
		public TerminalNode PRINTLN() { return getToken(DigitalParser.PRINTLN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(PRINTLN);
			setState(58); ((PrintlnContext)_localctx).expression = expression();
			setState(59); match(SEMICOLON);
			((PrintlnContext)_localctx).node =  new Println(((PrintlnContext)_localctx).expression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s;
		public TerminalNode PAR_CLOSE() { return getToken(DigitalParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OP() { return getToken(DigitalParser.BRACKET_OP, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(DigitalParser.BRACKET_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(DigitalParser.PAR_OPEN, 0); }
		public TerminalNode WHILE() { return getToken(DigitalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(WHILE);
			setState(63); match(PAR_OPEN);
			setState(64); ((While_loopContext)_localctx).expression = expression();
			setState(65); match(PAR_CLOSE);
			setState(66); match(BRACKET_OP);

			        List<ASTNode> body = new ArrayList<ASTNode>();  // Crea la lista de sentencias
			    
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(68); ((While_loopContext)_localctx).s = sentence();
				 body.add(((While_loopContext)_localctx).s.node); 
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); match(BRACKET_CLOSE);

			        ((While_loopContext)_localctx).node =  new While(((While_loopContext)_localctx).expression.node, body);  // Pasa la lista al constructor de While
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public SentenceContext s;
		public TerminalNode PAR_CLOSE() { return getToken(DigitalParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OP() { return getToken(DigitalParser.BRACKET_OP, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode FOR() { return getToken(DigitalParser.FOR, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(DigitalParser.BRACKET_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(DigitalParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(DigitalParser.NUMBER, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(FOR);
			setState(80); match(PAR_OPEN);
			setState(81); ((For_loopContext)_localctx).NUMBER = match(NUMBER);
			setState(82); match(PAR_CLOSE);
			setState(83); match(BRACKET_OP);

			        List<ASTNode> body = new ArrayList<ASTNode>();
			    
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(85); ((For_loopContext)_localctx).s = sentence();
				 body.add(((For_loopContext)_localctx).s.node); 
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(BRACKET_CLOSE);

			        ((For_loopContext)_localctx).node =  new ForLoop(((((For_loopContext)_localctx).NUMBER!=null?((For_loopContext)_localctx).NUMBER.getText():null)), body);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode ELSE() { return getToken(DigitalParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(DigitalParser.IF, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(DigitalParser.PAR_CLOSE, 0); }
		public List<TerminalNode> BRACKET_OP() { return getTokens(DigitalParser.BRACKET_OP); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(DigitalParser.BRACKET_CLOSE); }
		public TerminalNode PAR_OPEN() { return getToken(DigitalParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(DigitalParser.BRACKET_CLOSE, i);
		}
		public TerminalNode BRACKET_OP(int i) {
			return getToken(DigitalParser.BRACKET_OP, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(IF);
			setState(97); match(PAR_OPEN);
			setState(98); ((ConditionalContext)_localctx).expression = expression();
			setState(99); match(PAR_CLOSE);

						 	List<ASTNode> body = new ArrayList<ASTNode>(); 
						 
			setState(101); match(BRACKET_OP);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(102); ((ConditionalContext)_localctx).s1 = sentence();
				body.add(((ConditionalContext)_localctx).s1.node);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(BRACKET_CLOSE);
			setState(111); match(ELSE);

						 	List<ASTNode> elsebody = new ArrayList<ASTNode>(); 
						 
			setState(113); match(BRACKET_OP);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(114); ((ConditionalContext)_localctx).s2 = sentence();
				elsebody.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); match(BRACKET_CLOSE);

						 	((ConditionalContext)_localctx).node =  new If(((ConditionalContext)_localctx).expression.node,body,elsebody);
						 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(DigitalParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DigitalParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(DigitalParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(VAR);
			setState(126); ((Var_declContext)_localctx).ID = match(ID);
			setState(127); match(SEMICOLON);
			((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(DigitalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DigitalParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DigitalParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); ((Var_assignContext)_localctx).ID = match(ID);
			setState(131); match(ASSIGN);
			setState(132); ((Var_assignContext)_localctx).expression = expression();
			setState(133); match(SEMICOLON);
			((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(DigitalParser.AND, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(DigitalParser.NEQ); }
		public TerminalNode MINUS(int i) {
			return getToken(DigitalParser.MINUS, i);
		}
		public TerminalNode EQ(int i) {
			return getToken(DigitalParser.EQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(DigitalParser.LT); }
		public List<TerminalNode> GT() { return getTokens(DigitalParser.GT); }
		public List<TerminalNode> OR() { return getTokens(DigitalParser.OR); }
		public TerminalNode NEQ(int i) {
			return getToken(DigitalParser.NEQ, i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(DigitalParser.PLUS, i);
		}
		public TerminalNode OR(int i) {
			return getToken(DigitalParser.OR, i);
		}
		public List<TerminalNode> GEQ() { return getTokens(DigitalParser.GEQ); }
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> LEQ() { return getTokens(DigitalParser.LEQ); }
		public TerminalNode LEQ(int i) {
			return getToken(DigitalParser.LEQ, i);
		}
		public List<TerminalNode> AND() { return getTokens(DigitalParser.AND); }
		public List<TerminalNode> EQ() { return getTokens(DigitalParser.EQ); }
		public List<TerminalNode> PLUS() { return getTokens(DigitalParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(DigitalParser.MINUS); }
		public TerminalNode GT(int i) {
			return getToken(DigitalParser.GT, i);
		}
		public TerminalNode LT(int i) {
			return getToken(DigitalParser.LT, i);
		}
		public TerminalNode GEQ(int i) {
			return getToken(DigitalParser.GEQ, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); ((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << AND) | (1L << OR) | (1L << GT) | (1L << LT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
				{
				setState(178);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(138); match(AND);
					setState(139); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new LogicalAnd(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case OR:
					{
					setState(142); match(OR);
					setState(143); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new LogicalOr(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case GT:
					{
					setState(146); match(GT);
					setState(147); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new GreaterThan(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case LT:
					{
					setState(150); match(LT);
					setState(151); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new LessThan(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case GEQ:
					{
					setState(154); match(GEQ);
					setState(155); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new GreaterThanOrEqual(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case LEQ:
					{
					setState(158); match(LEQ);
					setState(159); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new LessThanOrEqual(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case EQ:
					{
					setState(162); match(EQ);
					setState(163); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new Equal(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case NEQ:
					{
					setState(166); match(NEQ);
					setState(167); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new NotEqual(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case PLUS:
					{
					setState(170); match(PLUS);
					setState(171); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				case MINUS:
					{
					setState(174); match(MINUS);
					setState(175); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new Subtraction(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public TerminalNode MULT(int i) {
			return getToken(DigitalParser.MULT, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(DigitalParser.MULT); }
		public List<TerminalNode> MOD() { return getTokens(DigitalParser.MOD); }
		public List<TerminalNode> DIV() { return getTokens(DigitalParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(DigitalParser.DIV, i);
		}
		public TerminalNode MOD(int i) {
			return getToken(DigitalParser.MOD, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				setState(197);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(185); match(MULT);
					setState(186); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				case DIV:
					{
					setState(189); match(DIV);
					setState(190); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				case MOD:
					{
					setState(193); match(MOD);
					setState(194); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Modulo(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token FLOAT;
		public Token ID;
		public Token STRING;
		public Token BOOLEAN;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(DigitalParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(DigitalParser.PAR_CLOSE, 0); }
		public TerminalNode STRING() { return getToken(DigitalParser.STRING, 0); }
		public TerminalNode PAR_OPEN() { return getToken(DigitalParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(DigitalParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(DigitalParser.BOOLEAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(DigitalParser.FLOAT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DigitalListener ) ((DigitalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Integer.parseInt((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); ((TermContext)_localctx).FLOAT = match(FLOAT);
				((TermContext)_localctx).node =  new Constant(Float.parseFloat((((TermContext)_localctx).FLOAT!=null?((TermContext)_localctx).FLOAT.getText():null)));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(206); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(208); ((TermContext)_localctx).STRING = match(STRING);
				((TermContext)_localctx).node =  new Constant((((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(210); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(212); match(PAR_OPEN);
				setState(213); ((TermContext)_localctx).expression = expression();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node;
				setState(215); match(PAR_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7x\n\7"+
		"\f\7\16\7{\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b5\n\n\f\n\16\n\u00b8\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00c8\n\13\f\13\16\13\u00cb\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00dc\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\2\u00ee\2\30\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b@\3\2\2\2\nQ\3\2"+
		"\2\2\fb\3\2\2\2\16\177\3\2\2\2\20\u0084\3\2\2\2\22\u008a\3\2\2\2\24\u00b9"+
		"\3\2\2\2\26\u00db\3\2\2\2\30\31\7\3\2\2\31\32\7\37\2\2\32\33\7\31\2\2"+
		"\33!\b\2\1\2\34\35\5\4\3\2\35\36\b\2\1\2\36 \3\2\2\2\37\34\3\2\2\2 #\3"+
		"\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\32\2\2%&\b\2\1"+
		"\2&\3\3\2\2\2\'(\5\6\4\2()\b\3\1\2):\3\2\2\2*+\5\f\7\2+,\b\3\1\2,:\3\2"+
		"\2\2-.\5\16\b\2./\b\3\1\2/:\3\2\2\2\60\61\5\20\t\2\61\62\b\3\1\2\62:\3"+
		"\2\2\2\63\64\5\b\5\2\64\65\b\3\1\2\65:\3\2\2\2\66\67\5\n\6\2\678\b\3\1"+
		"\28:\3\2\2\29\'\3\2\2\29*\3\2\2\29-\3\2\2\29\60\3\2\2\29\63\3\2\2\29\66"+
		"\3\2\2\2:\5\3\2\2\2;<\7\5\2\2<=\5\22\n\2=>\7\35\2\2>?\b\4\1\2?\7\3\2\2"+
		"\2@A\7\b\2\2AB\7\33\2\2BC\5\22\n\2CD\7\34\2\2DE\7\31\2\2EK\b\5\1\2FG\5"+
		"\4\3\2GH\b\5\1\2HJ\3\2\2\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3"+
		"\2\2\2MK\3\2\2\2NO\7\32\2\2OP\b\5\1\2P\t\3\2\2\2QR\7\t\2\2RS\7\33\2\2"+
		"ST\7\"\2\2TU\7\34\2\2UV\7\31\2\2V\\\b\6\1\2WX\5\4\3\2XY\b\6\1\2Y[\3\2"+
		"\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`"+
		"\7\32\2\2`a\b\6\1\2a\13\3\2\2\2bc\7\6\2\2cd\7\33\2\2de\5\22\n\2ef\7\34"+
		"\2\2fg\b\7\1\2gm\7\31\2\2hi\5\4\3\2ij\b\7\1\2jl\3\2\2\2kh\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\32\2\2qr\7\7\2\2rs"+
		"\b\7\1\2sy\7\31\2\2tu\5\4\3\2uv\b\7\1\2vx\3\2\2\2wt\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\32\2\2}~\b\7\1\2~\r\3\2\2"+
		"\2\177\u0080\7\4\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7\35\2\2\u0082\u0083"+
		"\b\b\1\2\u0083\17\3\2\2\2\u0084\u0085\7\37\2\2\u0085\u0086\7\30\2\2\u0086"+
		"\u0087\5\22\n\2\u0087\u0088\7\35\2\2\u0088\u0089\b\t\1\2\u0089\21\3\2"+
		"\2\2\u008a\u008b\5\24\13\2\u008b\u00b6\b\n\1\2\u008c\u008d\7\17\2\2\u008d"+
		"\u008e\5\24\13\2\u008e\u008f\b\n\1\2\u008f\u00b5\3\2\2\2\u0090\u0091\7"+
		"\20\2\2\u0091\u0092\5\24\13\2\u0092\u0093\b\n\1\2\u0093\u00b5\3\2\2\2"+
		"\u0094\u0095\7\22\2\2\u0095\u0096\5\24\13\2\u0096\u0097\b\n\1\2\u0097"+
		"\u00b5\3\2\2\2\u0098\u0099\7\23\2\2\u0099\u009a\5\24\13\2\u009a\u009b"+
		"\b\n\1\2\u009b\u00b5\3\2\2\2\u009c\u009d\7\24\2\2\u009d\u009e\5\24\13"+
		"\2\u009e\u009f\b\n\1\2\u009f\u00b5\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1"+
		"\u00a2\5\24\13\2\u00a2\u00a3\b\n\1\2\u00a3\u00b5\3\2\2\2\u00a4\u00a5\7"+
		"\26\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\b\n\1\2\u00a7\u00b5\3\2\2\2"+
		"\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\b\n\1\2\u00ab"+
		"\u00b5\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\b"+
		"\n\1\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\5\24\13\2"+
		"\u00b2\u00b3\b\n\1\2\u00b3\u00b5\3\2\2\2\u00b4\u008c\3\2\2\2\u00b4\u0090"+
		"\3\2\2\2\u00b4\u0094\3\2\2\2\u00b4\u0098\3\2\2\2\u00b4\u009c\3\2\2\2\u00b4"+
		"\u00a0\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00b0\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\5\26\f"+
		"\2\u00ba\u00c9\b\13\1\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\5\26\f\2\u00bd"+
		"\u00be\b\13\1\2\u00be\u00c8\3\2\2\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1\5"+
		"\26\f\2\u00c1\u00c2\b\13\1\2\u00c2\u00c8\3\2\2\2\u00c3\u00c4\7\16\2\2"+
		"\u00c4\u00c5\5\26\f\2\u00c5\u00c6\b\13\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00bb"+
		"\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cc\u00cd\7\"\2\2\u00cd\u00dc\b\f\1\2\u00ce\u00cf\7!\2\2\u00cf\u00dc"+
		"\b\f\1\2\u00d0\u00d1\7\37\2\2\u00d1\u00dc\b\f\1\2\u00d2\u00d3\7 \2\2\u00d3"+
		"\u00dc\b\f\1\2\u00d4\u00d5\7\36\2\2\u00d5\u00dc\b\f\1\2\u00d6\u00d7\7"+
		"\33\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\b\f\1\2\u00d9\u00da\7\34\2\2"+
		"\u00da\u00dc\3\2\2\2\u00db\u00cc\3\2\2\2\u00db\u00ce\3\2\2\2\u00db\u00d0"+
		"\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d4\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc"+
		"\27\3\2\2\2\r!9K\\my\u00b4\u00b6\u00c7\u00c9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}