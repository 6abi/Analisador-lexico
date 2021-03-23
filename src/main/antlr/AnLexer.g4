lexer grammar AnLexer;

@header {
package analisador_lexico.grammar;
}

//progama e bloco
PROGRAM: 'Program'(' '[a-zA-Z0-9]+[,]?);
BLOCK: 'BEGIN' | 'END.'
    ;

//Tipos de dados
TYPES : 'Int'| 'String' | 'Char' | 'Long' | 'Boolean' | 'Var'
    ;

//palavras chaves
SPECSYM : 'AND' | 'NOT' | 'IF' | 'THEN' | 'ELSE' | 'OF' | 'WHILE' | 'DO' |
                          'READ' | 'WRITE' | 'VAR' | 'ARRAY' |
                          'PROCEDURE' | 'PROGRAM'
     ;

//Declarações palavra e digito
LETTER : ('a'..'z'|'A'..'Z')
    ;
DIGIT  : ('0'..'9')+
    ;

//variavel
VARIABLES : TYPES? (' ')? ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
    ;

//Operacionais
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
EQUALS      : '=';

//comparativos
RT          : '>';
LT          : '<';
LE          : '<=';
RE          : '>=';
LR :        '<>';


//string
STR     : '"'[a-zA-Z0-9\t ]*'"'
    ;

//especiais
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

SMCOLON : ';'
    ;

COLON : ':'
    ;

DBDOT : '..'
    ;

SPECCHARS : '(' | ')'
    ;

COMMENTS : '\\' | '/*' | '*/'
    ;

//Entrada valores
CONSOLE: 'READLN' | 'WRITELN'
    ;

//ignora
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;