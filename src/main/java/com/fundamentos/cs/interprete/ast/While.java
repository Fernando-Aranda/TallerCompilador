package com.fundamentos.cs.interprete.ast;

import java.util.List;
import java.util.Map;

public class While implements ASTNode {
    private ASTNode condition;
    private List<ASTNode> body;

    public While(ASTNode condition, List<ASTNode> body) {
        this.condition = condition;
        this.body = body;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        while ((Boolean) condition.execute(symbolTable)) {
            for (ASTNode statement : body) {
                statement.execute(symbolTable);
            }
        }
        return null;
    }

}
