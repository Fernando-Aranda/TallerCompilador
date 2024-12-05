package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class NotEqual implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public NotEqual(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        // Compara si ambos valores son diferentes
        if (leftValue instanceof Number && rightValue instanceof Number) {
            return !leftValue.equals(rightValue);
        } else if (leftValue instanceof String && rightValue instanceof String) {
            return !leftValue.equals(rightValue);
        } else if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return !leftValue.equals(rightValue);
        } else {
            // Si los tipos no son iguales, lanza una excepción
            throw new RuntimeException("Operands of '!=' must be of the same type.");
        }
    }

}
