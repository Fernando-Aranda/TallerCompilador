package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class LogicalAnd implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public LogicalAnd(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return (Boolean) leftValue && (Boolean) rightValue;
        } else {
            throw new RuntimeException("Operands of AND must be boolean.");
        }
    }

}
