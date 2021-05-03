grammar MiniPascal;

@header {
package analisador_lexico.grammar;
}

// Start
myStartingRule : program+;

//progama
program : PROGRAM STR SMCOLON statement*?  block
    ;

//bloco
block : BEGIN_BLOCK variable? statement*? END_BLOCK
    ;

//statements
statement : vardecl | assignment  | readstatement | writestatement | loops | ifStatement
    ;

//loops
loops:  whileStatement
    ;

//atribuição
assignment : (variable ':=' expression? SMCOLON)+;

//COMANDOS CONSOLE
writestatement : WRITE '('STR')' SMCOLON;
readstatement : READ '('expression (',' expression)* | ID ')' SMCOLON;

//IF e LOOPS
ifStatement : IF expression THEN statement (: ELSE statement)?;
whileStatement: WHILE expression DO statement;

//expressoes - RALACIONAL e OPERACIONAL
expression : simpleExpression | simpleExpression (relationop simpleExpression)?;
relationop: RT| LT| LE| RE| LR ;

simpleExpression: (PLUS | MINUS)? term((addop) term)* ;
term: factor (multop factor)* ;
factor: variable | DIGIT | '['expression']' | NOT factor;

//variavel
variable: ID | ID '['expression']';
addop : PLUS | MINUS | OR;
multop : DIV | MULT | AND;

//vardeclpart : (VAR (vardecl SMCOLON)+)?
//    ;
vardecl : type variable (',' variable)* SMCOLON
    ;
type : (INTEGER|STRING|FLOAT|BOOLEAN| VAR)
    ;
//forStatement: FOR identifier ASSIGN forList DO statement;

//*********** Regras lexicas ****************
PROGRAM: 'Program'
    ;

BEGIN: 'Begin'
    ;

END: 'End.'
    ;

BEGIN_BLOCK : 'begin'
    ;

END_BLOCK: 'end'
    ;

DO: 'do'
    ;

//CONSOLE
WRITE: 'write'
    ;
READ: 'read'
    ;
PRINT: 'print'
    ;
//console: WRITE | READ | PRINT
//    ;

WHILE: 'while'
    ;

FOR: 'for'
    ;

IF	: 	'if'
    ;

THEN:	'then'
	;

ELSE:	'else'
	;

//operadores condicional
OR	:	'or'
	;
NOT	:	'not'
	;
AND	:	'and'
	;

//booleanos
TRUE : 'True'
    ;
FALSE : 'False'
    ;

//Tipos de dados
VAR: 'var'
    ;
FLOAT: 'float'
    ;
BOOLEAN: 'boolean'
    ;
STRING: 'string'
    ;
INTEGER: 'integer'
    ;
OPERATORS : '-' | '+' | '*' | '/'
    ;
//*********** TOKENS ****************

//string
STR     : '"'[a-zA-Z0-9\t ]*'"'
    ;

DIGIT  : [+|-]?[0-9]+
    ;

ID  : [a-zA-Z][a-zA-Z0-9_]*
    ;

//Operacionais aritmeticos
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
EQUALS      : '=';
DIV         : '/';

//comparativos
RT          : '>';
LT          : '<';
LE          : '<=';
RE          : '>=';
LR          : '<>';
EQ          : '==';

RELATIONS: RT | LT | LE | RE | LR
    ;

//especiais

SMCOLON : ';'
    ;
OP : '('
    ;
CP : ')'
    ;
ATTRIB : ':='
    ;

DOT : '.'
    ;

COMMA : ','
    ;
COLON : ':'
    ;

DBDOT : '..'
    ;
SPECCHARS : '(' | ')'
    ;

COMMENTS : '\\' | '/*' | '*/'
    ;
//ignora
WS : [ \r\n\t] + -> skip ;