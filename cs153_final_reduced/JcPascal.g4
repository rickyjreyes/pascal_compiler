/**
 * CS153 - Homework 6
 * 
 * Team: JupiterCom
 * 
 * sample programs included:
 *      sample.pas
 */

grammar JcPascal;

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program   : header mainBlock '.' ;
header    : PROGRAM IDENTIFIER ';' ;
mainBlock : block;
block     : (declarations | procedureFunctionDEF)* compoundStmt ;

declarations : VAR declList ';'
	 ;
declList     : decl ( ';' decl )* ;
decl         : varList ':' typeId ;
varList      : varId ( ',' varId )* ;
varId        : IDENTIFIER ;
typeId       : IDENTIFIER ;

paramList    : paramId ( ',' paramId )* ;
paramId      : IDENTIFIER ;
funcTypeId   : IDENTIFIER ;

procedureFunctionDEF 
	: functionDeclaration SEMI
    | functionDeclaration SEMI;
   
functionDeclaration : FUNCTION IDENTIFIER (formalParameterList)? COLON typeId SEMI block;
procedureDeclaration : PROCEDURE identifier (formalParameterList)? SEMI block;


formalParameterList : LPAREN formalParameterSection (SEMI formalParameterSection)* RPAREN;
formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   ;
   
parameterGroup
   : varList COLON typeId
   ;
   
compoundStmt : BEGIN stmtList END ;

stmt : compoundStmt
     | assignmentStmt
     | ifStatement
     | whileStatement
     | whenStatement
     | caseStatement
     | repeatStatement
     | forStatement
     | procedureStatement
     |      
     ;
          
stmtList       : stmt ( ';' stmt )* ;
assignmentStmt : variable ':=' expr ;

procedureStatement : identifier (LPAREN parameterList RPAREN)? ;
parameterList : actualParameter (COMMA actualParameter)* ;
actualParameter : expr ;

ifStatement    : IF compareExpr THEN stmt (: ELSE stmt)? ;

whileStatement : WHILE compareExpr DO stmt ;

caseStatement : CASE expr OF caseListElement (SEMI caseListElement)* (SEMI ELSE stmt)? END;
constList: number (COMMA number)*;
caseListElement : constList COLON stmt;

whenStatement : WHEN whenListElement (SEMI whenListElement)* (SEMI OTHERWISE ARROW stmt)? END;
whenListElement : expr ARROW stmt;   
repeatStatement : REPEAT stmt UNTIL compareExpr ;
forStatement : FOR IDENTIFIER ASSIGN forList DO stmt ;

forList : initialValue (TO | DOWNTO) finalValue ;
initialValue : expr;
finalValue : expr;


variable : IDENTIFIER ;
identifier: IDENTIFIER;

compareExpr : simpleExpression compareOp simpleExpression;

expr locals [ TypeSpec type = null ]
   : simpleExpression # simpleExpr
   ;

simpleExpression locals [ TypeSpec type = null ]
   : term (addSubOp term)* # addSubExpr
   ;

term locals [ TypeSpec type = null ]
   : signedFactor (mulDivOp signedFactor)* # mulDivExpr
   ;

signedFactor locals [ TypeSpec type = null ]
   : sign? factor # signedNumber
   ;

factor locals [ TypeSpec type = null ]
   : variable # variableExpr
   | LPAREN expr RPAREN # parenExpr    
   | unsignedConstant #unsignedConstantExp
   | functionCall #functionCallExp
   ;

unsignedConstant locals [ TypeSpec type = null ]
   : number # unsignedNumberExpr
   ;


functionCall locals [ TypeSpec type = null ]
   : identifier LPAREN parameterList RPAREN
   ;


mulDivOp : MUL_OP | DIV_OP | AND;
addSubOp : ADD_OP | SUB_OP | OR;
compareOp : EQUAL | NOT_EQUAL | LT | LE | GE | GT ;
         
sign : ADD_OP | SUB_OP ;

number locals [ TypeSpec type = null ]
    : INTEGER_NUM    # integerConst
    | FLOAT_NUM      # floatConst
    ;

PROGRAM : P R O G R A M ;
VAR     : V A R ;
BEGIN   : B E G I N ;
END     : E N D ;

IF : I F ;
THEN : T H E N ;
ELSE : E L S E ;

WHILE : W H I L E;
DO : D O;

CASE : C A S E ; 
OF : O F ;
WHEN : W H E N ;
OTHERWISE : O T H E R W I S E ; 

REPEAT : R E P E A T ; 
UNTIL : U N T I L ;

FOR : F O R ;
TO : T O ;
DOWNTO : D O W N T O ;

AND: A N D ;
OR: O R ;

FUNCTION : F U N C T I O N ;
PROCEDURE : P R O C E D U R E;

LPAREN : '(' ;
RPAREN : ')' ;

SEMI : ';' ;
COMMA : ',' ;
COLON : ':' ;
ARROW : '=>' ;

ASSIGN : ':=' ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER_NUM    : [0-9]+ ;
FLOAT_NUM      : [0-9]+ '.' [0-9]+ ;

MUL_OP :   '*' ;
DIV_OP :   '/' ;
ADD_OP :   '+' ;
SUB_OP :   '-' ;

EQUAL : '=' ;
NOT_EQUAL   : '<>' ;
LT : '<' ;
LE : '<=' ;
GE : '>=' ;
GT : '>' ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 
COMMENT_1   : '(*' .*? '*)' -> skip ;
COMMENT_2   : '{' .*? '}' -> skip ;


fragment A  : ('a' | 'A') ;
fragment B  : ('b' | 'B') ;
fragment C  : ('c' | 'C') ;
fragment D  : ('d' | 'D') ;
fragment E  : ('e' | 'E') ;
fragment F  : ('f' | 'F') ;
fragment G  : ('g' | 'G') ;
fragment H  : ('h' | 'H') ;
fragment I  : ('i' | 'I') ;
fragment J  : ('j' | 'J') ;
fragment K  : ('k' | 'K') ;
fragment L  : ('l' | 'L') ;
fragment M  : ('m' | 'M') ;
fragment N  : ('n' | 'N') ;
fragment O  : ('o' | 'O') ;
fragment P  : ('p' | 'P') ;
fragment Q  : ('q' | 'Q') ;
fragment R  : ('r' | 'R') ;
fragment S  : ('s' | 'S') ;
fragment T  : ('t' | 'T') ;
fragment U  : ('u' | 'U') ;
fragment V  : ('v' | 'V') ;
fragment W  : ('w' | 'W') ;
fragment X  : ('x' | 'X') ;
fragment Y  : ('y' | 'Y') ;
fragment Z  : ('z' | 'Z') ;   

