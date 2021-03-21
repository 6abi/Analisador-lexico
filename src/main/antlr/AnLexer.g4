lexer grammar AnLexer;

@header {
package analisador_lexico.grammar;
}

PalavraChave
	:	'DECLARACOES' | 'ALGORITMO' | 'INT' | 'REAL' | 'ATRIBUIR' | 'A' | 'LER' | 'IMPRIMIR' | 'SE' | 'ENTAO'
	| 'ENQUANTO' | 'INICIO' | 'FIM' | 'E' | 'OU'
	;

NumInt	: [+|-]?[0-9]+
	;

NumReal	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;

Variavel : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;

Cadeia 	: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
	;

fragment
ESC_SEQ	: '\\\'';
Comentario
    :   '%' ~('\n'|'\r')* '\r'? '\n' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OpRelacional	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OPAritmetico	:	'+' | '-' | '*' | '/'
	;
Delimitador 	:	':'
	;
AbrePar :	'('
	;
FechaPar:	')'
	;
