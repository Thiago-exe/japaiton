grammar japaiton;

// DECLARAÇÃO DE TIPOS
INT: 'int';
FLOAT: 'float';
STR: 'str';
BOOL: 'bool';
VOID: 'void';

// PALAVRAS RESERVADAS
IF: 'if';
ELSE: 'else';
WHILE: 'while';
CONST: 'const';
VAR: 'var';
END: 'end';
RETURN: 'return';
PRINT: 'print';
SCANF: 'scanf';

// TIPOS
INTEGER: '0' | '0'* [1-9] [0-9]*;
FLOAT_NUMBER: [0-9]+ '.' [0-9]*;
STRING: '"' ~["\r\n\\]* '"';
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE' | 'True' | 'False';
ID: [a-z] [a-zA-Z0-9_]*;

// SÍMBOLOS
EQUAL: '=';
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
SEMICOLON: ';';
COLON: ':';
PLUS: '+';
MINUS: '-';
ASTERISK: '*';
SLASH: '/';
EQUALS: '==';
NOTEQUALS: '!=';
GREATEREQUAL: '>=';
LESSEQUAL: '<=';
GREATER: '>';
LESS: '<';
NOT: '!';

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;

// Regras do parser
programa: funcao* main;
main: 'main' ':' (variaveis)? escopo END;
funcao: ID '(' parametros? ')' ':' type (variaveis)? escopo END;
parametros: parametro (',' parametro)*;
parametro: type ID;

escopo: blocoDeCodigo*;

blocoDeCodigo: ifDeclaracao
    | ifElseDeclaracao
    | whileDeclaracao
    | atribuicaoValorVariavel
    | printDeclaracao
    | scanfDeclaracao
    | returnDeclaracao;

returnDeclaracao: RETURN expressoesDeclaracao;

variaveis: declaracaoVariavel (blocoDeCodigo)?;

declaracaoVariavel: VAR COLON listaVariaveis*;

listaVariaveis: atribuicaoVariavel | atribuicaoMultiplaVariaveis | atribuicaoValorVariavel | declaracaoConstante;

atribuicaoVariavel: (ID COLON type SEMICOLON)+;

atribuicaoMultiplaVariaveis: ID (COMMA ID)+ COLON type SEMICOLON;

atribuicaoValorVariavel: ID EQUAL expressoesDeclaracao;

declaracaoConstante: CONST listaConstantes SEMICOLON;

listaConstantes: (atribuicaoConstante (COMMA atribuicaoConstante)*)?;

atribuicaoConstante: ID EQUAL valorConstante;

valorConstante: INTEGER | FLOAT_NUMBER | STRING | BOOLEAN;

ifDeclaracao: IF LPAREN condicao RPAREN COLON escopo END;

ifElseDeclaracao: IF LPAREN condicao RPAREN COLON escopo ELSE COLON escopo END;

whileDeclaracao: WHILE LPAREN condicao RPAREN COLON escopo END;

printDeclaracao: PRINT LPAREN printParametros (COMMA printParametros)* RPAREN SEMICOLON;

printParametros: idOrString | listaExpressoes | chamadaFuncao;

scanfDeclaracao: SCANF LPAREN listaIDs RPAREN SEMICOLON;

listaIDs: ID (COMMA ID)*;

idOrString: STRING | ID;

expressoesDeclaracao: expressoes SEMICOLON;

listaExpressoes: expressoes (COMMA expressoes)*;

condicao: expressoes;

expressoes: expressaoLogica
    | expressaoGrandeza
    | expressaoIgualdade
    | expressaoMultiplicativa
    | expressaoNegativa
    | expressaoPrimaria
    | expressaoRelacional
    | expressaoString;

expressaoString: STRING;

expressaoLogica: expressaoIgualdade (operadoresLogicos expressaoIgualdade)*;

operadoresLogicos: 'AND' | 'OR';

expressaoIgualdade: expressaoRelacional (operadorIgualdade expressaoRelacional)*;

operadorIgualdade: EQUALS | NOTEQUALS;

expressaoRelacional: expressaoGrandeza (operadorGrandeza expressaoGrandeza)*;

operadorGrandeza: GREATEREQUAL | LESSEQUAL | GREATER | LESS;

expressaoGrandeza: expressaoMultiplicativa (operadorAditivo expressaoMultiplicativa)*;

operadorAditivo: PLUS | MINUS;

expressaoMultiplicativa: expressaoNegativa (operadorMultiplicativo expressaoNegativa)*;

operadorMultiplicativo: ASTERISK | SLASH;

expressaoNegativa: operadorNegacao? expressaoPrimaria;

operadorNegacao: MINUS | NOT;

expressaoPrimaria: INTEGER
    | FLOAT_NUMBER
    | STRING
    | BOOLEAN
    | ID
    | chamadaFuncao
    | LPAREN expressoes RPAREN;

chamadaFuncao: ID LPAREN listaArgumentos? RPAREN;

listaArgumentos: expressoes (COMMA expressoes)*;

type: INT | FLOAT | STR | BOOL | VOID;
