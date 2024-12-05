package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class LessThan implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public LessThan(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Number && rightValue instanceof Number) {
            return ((Number) leftValue).doubleValue() < ((Number) rightValue).doubleValue();
        } else {
            throw new RuntimeException("Operands of '<' must be numeric.");
        }
    }

}
