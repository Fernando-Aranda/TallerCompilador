package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class LogicalOr implements ASTNode {
    private ASTNode left;
    private ASTNode right;

    public LogicalOr(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object leftValue = left.execute(symbolTable);
        Object rightValue = right.execute(symbolTable);

        if (leftValue instanceof Boolean && rightValue instanceof Boolean) {
            return (Boolean) leftValue || (Boolean) rightValue;
        } else {
            throw new RuntimeException("Operands of OR must be boolean.");
        }
    }

}
