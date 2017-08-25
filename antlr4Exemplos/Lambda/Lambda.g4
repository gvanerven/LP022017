// Define a grammar called Hello
grammar Lambda;
program: (exp)* ;
exp: (term)+ ;
term: variable | expression | application 
    | '(' term ')' | '(' exp ')' ;
expression : 'l_' variable '.' term ;
application : '(' term term ')' ;
variable: LETTER (LETTER)* ;
LETTER : [a-zA-Z\u0080-\u00FF_] | '0'..'9' ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
