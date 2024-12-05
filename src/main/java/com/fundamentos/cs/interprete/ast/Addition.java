package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class Addition implements ASTNode {
    private ASTNode operand1;
    private ASTNode operand2;

    public Addition(ASTNode operand1, ASTNode operand2) {
        super();
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object value1 = operand1.execute(symbolTable);
        Object value2 = operand2.execute(symbolTable);
        Object result;

        if (value1 instanceof Integer && value2 instanceof Integer) {
            result = (Integer) value1 + (Integer) value2;
        } else if (value1 instanceof Integer) {
            result = (float) ((Integer) value1) + (float) value2;
        } else if (value2 instanceof Integer) {
            result = (float) value1 + (float) ((Integer) value2);
        } else if (value1 instanceof Float && value2 instanceof Float){
            result = (float) value1 + (float) value2;
        } else if (value1 instanceof String) {
            result = (String) value1 + String.valueOf(value2);  
        } else if (value2 instanceof String) {
            result = String.valueOf(value1) + (String) value2; 
        }else {
        	result = (String) value1 + (String) value2;
        }

        return result;
    }
}
