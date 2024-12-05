package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class LogicalNot implements ASTNode {
    private ASTNode operand;

    public LogicalNot(ASTNode operand) {
        this.operand = operand;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        Object value = operand.execute(symbolTable);
        

        if (value instanceof Boolean) {
            return !(Boolean) value;
        } else {
            throw new RuntimeException("Operando no booleano para operador '!' en: " + value);
        }
    }

	
}
