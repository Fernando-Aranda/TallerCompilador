package com.fundamentos.cs.interprete.ast;

import java.util.Map;

public class Println implements ASTNode {
    private ASTNode expression;

    public Println(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        Object value = expression.execute(symbolTable);

        if (value instanceof String) {
            String strValue = (String) value;


            if (strValue.length() > 1) {

                strValue = strValue.substring(1, strValue.length() - 1);
            }
            System.out.println(strValue);
        } else {

            System.out.println(value);
        }

        return null;
    }
}
