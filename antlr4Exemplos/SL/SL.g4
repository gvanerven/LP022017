// Define a grammar called Hello
grammar SL;
program : 'begin' stmt_list ';' 'end' ;
stmt_list : stmt
	  | stmt ';' stmt_list  ;
stmt : assign ;
assign : id '=' exp ;
id : 'A' | 'B' | 'C' ;
exp : id '+' exp 
     | id '*' exp
     | '(' exp ')' 
     | id ;      
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
