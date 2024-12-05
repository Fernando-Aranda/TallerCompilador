grammar Digital;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import com.fundamentos.cs.interprete.ast.*;
	
}

@parser::members{
	Map<String, Object> symbolTable = new HashMap<String, Object>();
}



program: PROGRAM ID BRACKET_OP 
	{
		List<ASTNode> body = new ArrayList<ASTNode>(); 
		Map<String, Object> symbolTable = new HashMap<String,Object>();
	}
	(sentence {body.add($sentence.node);})*
	BRACKET_CLOSE
	{
		for(ASTNode n: body){
			n.execute(symbolTable);
		}	
	};

sentence returns [ASTNode node]: println{$node = $println.node;} 
  								| conditional{$node = $conditional.node;}
  								| var_decl{$node = $var_decl.node;}
 								| var_assign{$node = $var_assign.node;}
  								| while_loop{$node = $while_loop.node;}
  								| for_loop{$node = $for_loop.node;}
  								;
		
println returns [ASTNode node]: PRINTLN expression SEMICOLON
		{$node = new Println($expression.node);};
		
while_loop returns [ASTNode node]:
    WHILE PAR_OPEN expression PAR_CLOSE BRACKET_OP 
    {
        List<ASTNode> body = new ArrayList<ASTNode>();  // Crea la lista de sentencias
    }
    (s=sentence { body.add($s.node); })*
    BRACKET_CLOSE
    {
        $node = new While($expression.node, body);  // Pasa la lista al constructor de While
    }
    ;

for_loop returns [ASTNode node]:
    FOR PAR_OPEN NUMBER PAR_CLOSE BRACKET_OP 
    {
        List<ASTNode> body = new ArrayList<ASTNode>();
    }
    (s=sentence { body.add($s.node); })*  
    BRACKET_CLOSE
    {
        $node = new ForLoop(($NUMBER.text), body);
    }
	;



		
conditional returns [ASTNode node]: IF PAR_OPEN expression PAR_CLOSE
			 {
			 	List<ASTNode> body = new ArrayList<ASTNode>(); 
			 }
			 BRACKET_OP (s1=sentence{body.add($s1.node);})* BRACKET_CLOSE
			 ELSE
			 {
			 	List<ASTNode> elsebody = new ArrayList<ASTNode>(); 
			 }
			 BRACKET_OP (s2=sentence{elsebody.add($s2.node);})* BRACKET_CLOSE
			 {
			 	$node = new If($expression.node,body,elsebody);
			 };

var_decl returns [ASTNode node]:
	VAR ID SEMICOLON {$node = new VarDecl($ID.text);}
	;

var_assign returns [ASTNode node]:
	ID ASSIGN expression SEMICOLON {$node = new VarAssign($ID.text, $expression.node);}
	;

expression returns [ASTNode node]
    : t1=factor {$node = $t1.node;}
      (AND t2=factor {$node = new LogicalAnd($node, $t2.node);}
      | OR t2=factor {$node = new LogicalOr($node, $t2.node);}
      | GT t2=factor {$node = new GreaterThan($node, $t2.node);}
      | LT t2=factor {$node = new LessThan($node, $t2.node);}
      | GEQ t2=factor {$node = new GreaterThanOrEqual($node, $t2.node);}
      | LEQ t2=factor {$node = new LessThanOrEqual($node, $t2.node);}
      | EQ t2=factor {$node = new Equal($node, $t2.node);}
      | NEQ t2=factor {$node = new NotEqual($node, $t2.node);} 
      | PLUS t2=factor {$node = new Addition($node, $t2.node);}
      | MINUS t2=factor {$node = new Subtraction($node, $t2.node);}
      )*
    ;


factor returns [ASTNode node]
    : t1=term {$node = $t1.node;}
      (MULT t2=term {$node = new Multiplication($node, $t2.node);}
      | DIV t2=term {$node = new Division($node, $t2.node);}
      | MOD t2=term {$node = new Modulo($node, $t2.node);}
      )*
    ;

term returns [ASTNode node]
    : NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
    | FLOAT {$node = new Constant(Float.parseFloat($FLOAT.text));}
    | ID {$node = new VarRef($ID.text);}
    | STRING {$node = new Constant($STRING.text);}
    | BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
    | PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE
    ;

PROGRAM: 'digimon';
VAR: 'digital';
PRINTLN: 'digitalk';
IF: 'digivolution_if';
ELSE: 'digivolution_else';
WHILE: 'training';
FOR: 'fight';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OP: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

BOOLEAN: 'true' | 'false';

ID: [a-zA-Z0-9_]*'mon'[0-9]*;

STRING: '"' .*? '"';

FLOAT: [0-9]+'.'[0-9]* | '.'[0-9]+;
NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;
COMMENT: '//' ~[\n\r]* -> skip; 
