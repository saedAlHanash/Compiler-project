
parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument

    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

elementAttribute
: htmlAttribute|(ngAttribute);

htmlElement
    : TAG_OPEN TAG_NAME |elementAttribute*
    (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*

    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;

 ngAttribute :
    ng_for|
    ng_switch|
    ng_switch_case|
    ng_switch_default
    ;

ng_for: NG_FOR NOT Q_OPEN (forExpressionFirst|forExpressionSecund) Q_CLOSE;
ng_switch: NG_SWITCH NOT Q_OPEN (var) Q_CLOSE;
ng_switch_case :NG_SWITCH_CASE NOT Q_OPEN (constt|var) Q_CLOSE;
ng_switch_default :NG_SWITCH_DEFAULT ;

forExpressionFirst:

beforIN IN afterIN
;

forExpressionSecund:
beforIN IN afterIN semiColonn
;


beforIN:
    (var)(morVar)*|
    expression
    ;

afterIN:
    var|array
    ;

var
    :VARNAME (dotVar)*
    ;

dotVar
    :DOT var
    ;

 morVar :
    COMMA var
    ;

semiColonn :
SEMICOLONN var EQUAL (var|INDEX|NUMBER)
;


expression :

var|array|constt
;

array:
    ARRAY_TAG_OPEN (expression) (morArrayElement)* ARRAY_TAG_CLOSE
    |ARRAY_TAG_OPEN array ARRAY_TAG_CLOSE
;

morArrayElement :
    COMMA (expression)
;

constt
    :CHAR
    |NUMBER
    |OPEN_C constt CLOSE_C
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;
