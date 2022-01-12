// Generated from C:/Users/saed/Desktop/Helpers/Compiler-project/src\HTMLParser.g4 by ANTLR 4.9.1
package saed;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, NG_FOR=12, 
		NG_SWITCH=13, TAG_CLOSE=14, TAG_SLASH_CLOSE=15, TAG_SLASH=16, TAG_EQUALS=17, 
		TAG_NAME=18, TAG_WHITESPACE=19, SCRIPT_BODY=20, SCRIPT_SHORT_BODY=21, 
		STYLE_BODY=22, STYLE_SHORT_BODY=23, ATTVALUE_VALUE=24, ATTRIBUTE=25, NOT=26, 
		Q_OPEN=27, Q_CLOSE=28, CLOSE=29, NUMBER=30, CHAR=31, COLUMN=32, DOT=33, 
		IN=34, INDEX=35, BOOLEAN=36, AND_OR=37, PLUS_PLUS=38, PLUS=39, MINUS=40, 
		MINUS_MINUS=41, MULT=42, DIV=43, REMAIN=44, ARRAY_TAG_OPEN=45, ARRAY_TAG_CLOSE=46, 
		OPEN_C=47, CLOSE_C=48, EQUAL=49, SEMICOLONN=50, COMMA=51, TRUE=52, FALSE=53, 
		DOUBLE_Q=54, CURLY_OPEN=55, CURLY_CLOSE=56, APOSTROPHE=57, VARNAME=58;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElements = 2, 
		RULE_elementAttribute = 3, RULE_htmlElement = 4, RULE_htmlContent = 5, 
		RULE_htmlAttribute = 6, RULE_ngAttribute = 7, RULE_ng_for = 8, RULE_forExpressionFirst = 9, 
		RULE_forExpressionSecund = 10, RULE_beforIN = 11, RULE_afterIN = 12, RULE_var = 13, 
		RULE_dotVar = 14, RULE_morVar = 15, RULE_semiColonn = 16, RULE_expression = 17, 
		RULE_array = 18, RULE_morArrayElement = 19, RULE_constt = 20, RULE_htmlChardata = 21, 
		RULE_htmlMisc = 22, RULE_htmlComment = 23, RULE_script = 24, RULE_style = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElements", "elementAttribute", 
			"htmlElement", "htmlContent", "htmlAttribute", "ngAttribute", "ng_for", 
			"forExpressionFirst", "forExpressionSecund", "beforIN", "afterIN", "var", 
			"dotVar", "morVar", "semiColonn", "expression", "array", "morArrayElement", 
			"constt", "htmlChardata", "htmlMisc", "htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			null, null, "'>'", "'/>'", "'/'", "'='", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"NG_FOR", "NG_SWITCH", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "NOT", "Q_OPEN", "Q_CLOSE", 
			"CLOSE", "NUMBER", "CHAR", "COLUMN", "DOT", "IN", "INDEX", "BOOLEAN", 
			"AND_OR", "PLUS_PLUS", "PLUS", "MINUS", "MINUS_MINUS", "MULT", "DIV", 
			"REMAIN", "ARRAY_TAG_OPEN", "ARRAY_TAG_CLOSE", "OPEN_C", "CLOSE_C", "EQUAL", 
			"SEMICOLONN", "COMMA", "TRUE", "FALSE", "DOUBLE_Q", "CURLY_OPEN", "CURLY_CLOSE", 
			"APOSTROPHE", "VARNAME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HTMLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(HTMLParser.XML, 0); }
		public TerminalNode DTD() { return getToken(HTMLParser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(58);
				match(XML);
				}
			}

			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(67);
				match(DTD);
				}
			}

			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SCRIPTLET) | (1L << SEA_WS) | (1L << SCRIPT_OPEN) | (1L << STYLE_OPEN) | (1L << TAG_OPEN))) != 0)) {
				{
				{
				setState(76);
				htmlElements();
				}
				}
				setState(81);
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

	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HTML_COMMENT) | (1L << HTML_CONDITIONAL_COMMENT) | (1L << SEA_WS))) != 0)) {
				{
				{
				setState(84);
				htmlMisc();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			htmlElement();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91);
					htmlMisc();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ElementAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute() {
			return getRuleContext(HtmlAttributeContext.class,0);
		}
		public NgAttributeContext ngAttribute() {
			return getRuleContext(NgAttributeContext.class,0);
		}
		public ElementAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterElementAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitElementAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitElementAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeContext elementAttribute() throws RecognitionException {
		ElementAttributeContext _localctx = new ElementAttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elementAttribute);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				htmlAttribute();
				}
				break;
			case NG_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				ngAttribute();
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

	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HTMLParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HTMLParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public List<ElementAttributeContext> elementAttribute() {
			return getRuleContexts(ElementAttributeContext.class);
		}
		public ElementAttributeContext elementAttribute(int i) {
			return getRuleContext(ElementAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HTMLParser.TAG_SLASH, 0); }
		public TerminalNode SCRIPTLET() { return getToken(HTMLParser.SCRIPTLET, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlElement);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(TAG_OPEN);
				setState(102);
				match(TAG_NAME);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NG_FOR || _la==TAG_NAME) {
					{
					{
					setState(103);
					elementAttribute();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(109);
					match(TAG_CLOSE);
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(110);
						htmlContent();
						setState(111);
						match(TAG_OPEN);
						setState(112);
						match(TAG_SLASH);
						setState(113);
						match(TAG_NAME);
						setState(114);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(118);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(SCRIPTLET);
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				script();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				style();
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

	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(HTMLParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(HTMLParser.CDATA, i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEA_WS || _la==HTML_TEXT) {
				{
				setState(126);
				htmlChardata();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(129);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(130);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(131);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEA_WS || _la==HTML_TEXT) {
						{
						setState(134);
						htmlChardata();
						}
					}

					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HTMLParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(TAG_NAME);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(143);
				match(TAG_EQUALS);
				setState(144);
				match(ATTVALUE_VALUE);
				}
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

	public static class NgAttributeContext extends ParserRuleContext {
		public Ng_forContext ng_for() {
			return getRuleContext(Ng_forContext.class,0);
		}
		public NgAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNgAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNgAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNgAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgAttributeContext ngAttribute() throws RecognitionException {
		NgAttributeContext _localctx = new NgAttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ngAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			ng_for();
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

	public static class Ng_forContext extends ParserRuleContext {
		public TerminalNode NG_FOR() { return getToken(HTMLParser.NG_FOR, 0); }
		public TerminalNode NOT() { return getToken(HTMLParser.NOT, 0); }
		public TerminalNode Q_OPEN() { return getToken(HTMLParser.Q_OPEN, 0); }
		public TerminalNode Q_CLOSE() { return getToken(HTMLParser.Q_CLOSE, 0); }
		public ForExpressionFirstContext forExpressionFirst() {
			return getRuleContext(ForExpressionFirstContext.class,0);
		}
		public ForExpressionSecundContext forExpressionSecund() {
			return getRuleContext(ForExpressionSecundContext.class,0);
		}
		public Ng_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ng_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNg_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNg_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNg_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ng_forContext ng_for() throws RecognitionException {
		Ng_forContext _localctx = new Ng_forContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ng_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(NG_FOR);
			setState(150);
			match(NOT);
			setState(151);
			match(Q_OPEN);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(152);
				forExpressionFirst();
				}
				break;
			case 2:
				{
				setState(153);
				forExpressionSecund();
				}
				break;
			}
			setState(156);
			match(Q_CLOSE);
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

	public static class ForExpressionFirstContext extends ParserRuleContext {
		public BeforINContext beforIN() {
			return getRuleContext(BeforINContext.class,0);
		}
		public TerminalNode IN() { return getToken(HTMLParser.IN, 0); }
		public AfterINContext afterIN() {
			return getRuleContext(AfterINContext.class,0);
		}
		public ForExpressionFirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpressionFirst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterForExpressionFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitForExpressionFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitForExpressionFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionFirstContext forExpressionFirst() throws RecognitionException {
		ForExpressionFirstContext _localctx = new ForExpressionFirstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forExpressionFirst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			beforIN();
			setState(159);
			match(IN);
			setState(160);
			afterIN();
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

	public static class ForExpressionSecundContext extends ParserRuleContext {
		public BeforINContext beforIN() {
			return getRuleContext(BeforINContext.class,0);
		}
		public TerminalNode IN() { return getToken(HTMLParser.IN, 0); }
		public AfterINContext afterIN() {
			return getRuleContext(AfterINContext.class,0);
		}
		public SemiColonnContext semiColonn() {
			return getRuleContext(SemiColonnContext.class,0);
		}
		public ForExpressionSecundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpressionSecund; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterForExpressionSecund(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitForExpressionSecund(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitForExpressionSecund(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionSecundContext forExpressionSecund() throws RecognitionException {
		ForExpressionSecundContext _localctx = new ForExpressionSecundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forExpressionSecund);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			beforIN();
			setState(163);
			match(IN);
			setState(164);
			afterIN();
			setState(165);
			semiColonn();
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

	public static class BeforINContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<MorVarContext> morVar() {
			return getRuleContexts(MorVarContext.class);
		}
		public MorVarContext morVar(int i) {
			return getRuleContext(MorVarContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BeforINContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beforIN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBeforIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBeforIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBeforIN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeforINContext beforIN() throws RecognitionException {
		BeforINContext _localctx = new BeforINContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_beforIN);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(167);
				var();
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(168);
					morVar();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expression();
				}
				break;
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

	public static class AfterINContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AfterINContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterIN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAfterIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAfterIN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAfterIN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfterINContext afterIN() throws RecognitionException {
		AfterINContext _localctx = new AfterINContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_afterIN);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				var();
				}
				break;
			case ARRAY_TAG_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				array();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(HTMLParser.VARNAME, 0); }
		public List<DotVarContext> dotVar() {
			return getRuleContexts(DotVarContext.class);
		}
		public DotVarContext dotVar(int i) {
			return getRuleContext(DotVarContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(VARNAME);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(182);
					dotVar();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class DotVarContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DotVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterDotVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitDotVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitDotVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotVarContext dotVar() throws RecognitionException {
		DotVarContext _localctx = new DotVarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dotVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(DOT);
			setState(189);
			var();
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

	public static class MorVarContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public MorVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMorVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMorVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMorVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MorVarContext morVar() throws RecognitionException {
		MorVarContext _localctx = new MorVarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_morVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(COMMA);
			setState(192);
			var();
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

	public static class SemiColonnContext extends ParserRuleContext {
		public TerminalNode SEMICOLONN() { return getToken(HTMLParser.SEMICOLONN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(HTMLParser.EQUAL, 0); }
		public TerminalNode INDEX() { return getToken(HTMLParser.INDEX, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public SemiColonnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semiColonn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterSemiColonn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitSemiColonn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitSemiColonn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiColonnContext semiColonn() throws RecognitionException {
		SemiColonnContext _localctx = new SemiColonnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_semiColonn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SEMICOLONN);
			setState(195);
			var();
			setState(196);
			match(EQUAL);
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				{
				setState(197);
				var();
				}
				break;
			case INDEX:
				{
				setState(198);
				match(INDEX);
				}
				break;
			case NUMBER:
				{
				setState(199);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ConsttContext constt() {
			return getRuleContext(ConsttContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				var();
				}
				break;
			case ARRAY_TAG_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				array();
				}
				break;
			case NUMBER:
			case CHAR:
			case OPEN_C:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				constt();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY_TAG_OPEN() { return getToken(HTMLParser.ARRAY_TAG_OPEN, 0); }
		public TerminalNode ARRAY_TAG_CLOSE() { return getToken(HTMLParser.ARRAY_TAG_CLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<MorArrayElementContext> morArrayElement() {
			return getRuleContexts(MorArrayElementContext.class);
		}
		public MorArrayElementContext morArrayElement(int i) {
			return getRuleContext(MorArrayElementContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ARRAY_TAG_OPEN);
				{
				setState(208);
				expression();
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209);
					morArrayElement();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(ARRAY_TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(ARRAY_TAG_OPEN);
				setState(218);
				array();
				setState(219);
				match(ARRAY_TAG_CLOSE);
				}
				break;
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

	public static class MorArrayElementContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MorArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morArrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMorArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMorArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMorArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MorArrayElementContext morArrayElement() throws RecognitionException {
		MorArrayElementContext _localctx = new MorArrayElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_morArrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(COMMA);
			{
			setState(224);
			expression();
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

	public static class ConsttContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(HTMLParser.CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode OPEN_C() { return getToken(HTMLParser.OPEN_C, 0); }
		public ConsttContext constt() {
			return getRuleContext(ConsttContext.class,0);
		}
		public TerminalNode CLOSE_C() { return getToken(HTMLParser.CLOSE_C, 0); }
		public ConsttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterConstt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitConstt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitConstt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsttContext constt() throws RecognitionException {
		ConsttContext _localctx = new ConsttContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constt);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(CHAR);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(NUMBER);
				}
				break;
			case OPEN_C:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(OPEN_C);
				setState(229);
				constt();
				setState(230);
				match(CLOSE_C);
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

	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HTMLParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HTMLParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_htmlMisc);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(SEA_WS);
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

	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HTMLParser.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(HTMLParser.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HTMLParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(HTMLParser.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(HTMLParser.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(SCRIPT_OPEN);
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HTMLParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(HTMLParser.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(HTMLParser.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(STYLE_OPEN);
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\5\2>\n\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\5\2G\n\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2"+
		"P\n\2\f\2\16\2S\13\2\3\3\3\3\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\7\4_"+
		"\n\4\f\4\16\4b\13\4\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6w\n\6\3\6\5\6z\n\6\3\6\3\6\3\6\5\6\177"+
		"\n\6\3\7\5\7\u0082\n\7\3\7\3\7\3\7\5\7\u0087\n\7\3\7\5\7\u008a\n\7\7\7"+
		"\u008c\n\7\f\7\16\7\u008f\13\7\3\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u009d\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\7\r\u00ac\n\r\f\r\16\r\u00af\13\r\3\r\5\r\u00b2\n\r\3\16"+
		"\3\16\5\16\u00b6\n\16\3\17\3\17\7\17\u00ba\n\17\f\17\16\17\u00bd\13\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cb"+
		"\n\22\3\23\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\3\24\7\24\u00d5\n\24\f"+
		"\24\16\24\u00d8\13\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e0\n\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00eb\n\26\3\27\3\27"+
		"\3\30\3\30\5\30\u00f1\n\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3"+
		"\2\b\t\4\2\t\t\r\r\3\2\3\4\3\2\26\27\3\2\30\31\2\u0103\29\3\2\2\2\4T\3"+
		"\2\2\2\6Y\3\2\2\2\be\3\2\2\2\n~\3\2\2\2\f\u0081\3\2\2\2\16\u0090\3\2\2"+
		"\2\20\u0095\3\2\2\2\22\u0097\3\2\2\2\24\u00a0\3\2\2\2\26\u00a4\3\2\2\2"+
		"\30\u00b1\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36\u00be\3\2\2\2 "+
		"\u00c1\3\2\2\2\"\u00c4\3\2\2\2$\u00cf\3\2\2\2&\u00df\3\2\2\2(\u00e1\3"+
		"\2\2\2*\u00ea\3\2\2\2,\u00ec\3\2\2\2.\u00f0\3\2\2\2\60\u00f2\3\2\2\2\62"+
		"\u00f4\3\2\2\2\64\u00f7\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\29\67"+
		"\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\7\5\2\2=<\3\2\2\2=>\3\2\2\2>"+
		"B\3\2\2\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2"+
		"DB\3\2\2\2EG\7\7\2\2FE\3\2\2\2FG\3\2\2\2GK\3\2\2\2HJ\5\4\3\2IH\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\6\4\2ON\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SQ\3\2\2\2TU\t\2\2\2U\5\3\2\2"+
		"\2VX\5.\30\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2"+
		"\2\2\\`\5\n\6\2]_\5.\30\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\7\3"+
		"\2\2\2b`\3\2\2\2cf\5\16\b\2df\5\20\t\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2"+
		"gh\7\f\2\2hl\7\24\2\2ik\5\b\5\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2my\3\2\2\2nl\3\2\2\2ov\7\20\2\2pq\5\f\7\2qr\7\f\2\2rs\7\22\2\2st\7\24"+
		"\2\2tu\7\20\2\2uw\3\2\2\2vp\3\2\2\2vw\3\2\2\2wz\3\2\2\2xz\7\21\2\2yo\3"+
		"\2\2\2yx\3\2\2\2z\177\3\2\2\2{\177\7\b\2\2|\177\5\62\32\2}\177\5\64\33"+
		"\2~g\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\13\3\2\2\2\u0080\u0082"+
		"\5,\27\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008d\3\2\2\2\u0083"+
		"\u0087\5\n\6\2\u0084\u0087\7\6\2\2\u0085\u0087\5\60\31\2\u0086\u0083\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u008a\5,\27\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\7\24\2"+
		"\2\u0091\u0092\7\23\2\2\u0092\u0094\7\32\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\17\3\2\2\2\u0095\u0096\5\22\n\2\u0096\21\3\2\2\2"+
		"\u0097\u0098\7\16\2\2\u0098\u0099\7\34\2\2\u0099\u009c\7\35\2\2\u009a"+
		"\u009d\5\24\13\2\u009b\u009d\5\26\f\2\u009c\u009a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\36\2\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a1\5\30\r\2\u00a1\u00a2\7$\2\2\u00a2\u00a3\5\32\16\2\u00a3\25\3\2"+
		"\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7$\2\2\u00a6\u00a7\5\32\16\2\u00a7"+
		"\u00a8\5\"\22\2\u00a8\27\3\2\2\2\u00a9\u00ad\5\34\17\2\u00aa\u00ac\5 "+
		"\21\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\5$"+
		"\23\2\u00b1\u00a9\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b6"+
		"\5\34\17\2\u00b4\u00b6\5&\24\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\33\3\2\2\2\u00b7\u00bb\7<\2\2\u00b8\u00ba\5\36\20\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\35\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0\5\34\17"+
		"\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\65\2\2\u00c2\u00c3\5\34\17\2\u00c3!"+
		"\3\2\2\2\u00c4\u00c5\7\64\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00ca\7\63\2"+
		"\2\u00c7\u00cb\5\34\17\2\u00c8\u00cb\7%\2\2\u00c9\u00cb\7 \2\2\u00ca\u00c7"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb#\3\2\2\2\u00cc"+
		"\u00d0\5\34\17\2\u00cd\u00d0\5&\24\2\u00ce\u00d0\5*\26\2\u00cf\u00cc\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00d2"+
		"\7/\2\2\u00d2\u00d6\5$\23\2\u00d3\u00d5\5(\25\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\60\2\2\u00da\u00e0\3\2\2\2\u00db"+
		"\u00dc\7/\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\7\60\2\2\u00de\u00e0\3\2"+
		"\2\2\u00df\u00d1\3\2\2\2\u00df\u00db\3\2\2\2\u00e0\'\3\2\2\2\u00e1\u00e2"+
		"\7\65\2\2\u00e2\u00e3\5$\23\2\u00e3)\3\2\2\2\u00e4\u00eb\7!\2\2\u00e5"+
		"\u00eb\7 \2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\7\62"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00eb+\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed-\3\2\2\2\u00ee"+
		"\u00f1\5\60\31\2\u00ef\u00f1\7\t\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3"+
		"\2\2\2\u00f1/\3\2\2\2\u00f2\u00f3\t\4\2\2\u00f3\61\3\2\2\2\u00f4\u00f5"+
		"\7\n\2\2\u00f5\u00f6\t\5\2\2\u00f6\63\3\2\2\2\u00f7\u00f8\7\13\2\2\u00f8"+
		"\u00f9\t\6\2\2\u00f9\65\3\2\2\2\379=BFKQY`elvy~\u0081\u0086\u0089\u008d"+
		"\u0093\u009c\u00ad\u00b1\u00b5\u00bb\u00ca\u00cf\u00d6\u00df\u00ea\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}