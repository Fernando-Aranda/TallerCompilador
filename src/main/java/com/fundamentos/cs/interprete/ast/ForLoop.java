package com.fundamentos.cs.interprete.ast;

import java.util.List;
import java.util.Map;

public class ForLoop implements ASTNode {
    private int iterations;
    private List<ASTNode> body;

    public ForLoop(String iterations, List<ASTNode> body) {
        this.iterations = Integer.parseInt(iterations);
        this.body = body;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        for (int i = 0; i < iterations; i++) {
            for (ASTNode statement : body) {
                statement.execute(symbolTable);
            }
        }
        return null;
    }

}
