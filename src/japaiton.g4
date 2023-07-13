grammar japaiton;

// DECLARAÇÃO TIPOS
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
STRING: '"' ~["\r\n]* '"';
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE';
IDENTIFICADOR: [a-zA-Z] [a-zA-Z0-9_]*;

// SIMBOLOS
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
AND: '&&';
OR: '|';

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;

// Parser rules
programa: funcao* main;
// main
main: 'main' ':' (variaveis)? escopo;
// modelo função
funcao: IDENTIFICADOR '(' parametros? ')' ':' type (variaveis)? escopo;

parametros: parametro (',' parametro)*;

parametro: type IDENTIFICADOR;
// escopo de toda funcao
escopo:  blocoDeCodigo* END;

blocoDeCodigo: ifDeclaracao
         | whileDeclaracao
         | expressoesDeclaracao
         | printDeclaracao
         | returnDeclaracao
         | ifElseDeclaracao;

returnDeclaracao: RETURN blocoDeCodigo;

variaveis: deeclaracaoVariavel (blocoDeCodigo)?;

deeclaracaoVariavel: VAR COLON listaVariaveis;

listaVariaveis: atribuicaoVariavel | atribuicaoMultiplaVariaveis ;

atribuicaoVariavel: IDENTIFICADOR COLON type SEMICOLON;

atribuicaoMultiplaVariaveis: IDENTIFICADOR (COMMA IDENTIFICADOR)+ COLON type SEMICOLON;
// NAO UTILIZADA Depois que resolver variaveis normais sera utilizada
declaracaoConstante: CONST listaConstantes SEMICOLON;

listaConstantes: (atribuicaoConstante (COMMA atribuicaoConstante)*)?;

atribuicaoConstante: IDENTIFICADOR '=' valorConstante;

valorConstante: INTEGER | FLOAT_NUMBER | STRING | BOOLEAN;
// FIM CONSTANTES

ifDeclaracao: IF LPAREN condicao RPAREN COLON escopo ;

ifElseDeclaracao:IF LPAREN condicao RPAREN COLON blocoDeCodigo* ELSE COLON escopo;

whileDeclaracao: WHILE LPAREN condicao RPAREN COLON escopo;

expressoesDeclaracao: expressao SEMICOLON;

printDeclaracao: PRINT LPAREN listaExpressoes? RPAREN SEMICOLON;

listaExpressoes: expressao (COMMA expressao)*;

condicao: expressao;

expressao: expressaoLogica;

expressaoLogica: expressaoIgualdade (operadoresLogicos expressaoIgualdade)*;

operadoresLogicos: AND | OR;

expressaoIgualdade: expressaoRelacional (operadorIgualdade expressaoRelacional)*;

operadorIgualdade: EQUALS | NOTEQUALS;

expressaoRelacional: expressaoGrandeza (operadorGrandeza expressaoGrandeza)*;

operadorGrandeza: GREATEREQUAL | LESSEQUAL | GREATER | LESS;

expressaoGrandeza: expressaoMultiplicativa (operadorAditivo expressaoMultiplicativa)*;

operadorAditivo: PLUS | MINUS;

expressaoMultiplicativa: expressaoNegativa (operadorMultiplicativo expressaoNegativa)*;

operadorMultiplicativo: ASTERISK | SLASH;

expressaoNegativa: operadorNegacao expressaoPrimaria | expressaoPrimaria;

operadorNegacao: MINUS | NOT;

expressaoPrimaria: INTEGER
                | FLOAT_NUMBER
                | STRING
                | BOOLEAN
                | IDENTIFICADOR
                | chamadaFuncao
                | LPAREN expressao RPAREN;

chamadaFuncao: IDENTIFICADOR LPAREN listaArgumentos? RPAREN;

listaArgumentos: expressao (COMMA expressao)*;

type: INT | FLOAT | STR | BOOL | VOID;
