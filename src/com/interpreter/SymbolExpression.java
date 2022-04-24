package com.interpreter;

import java.util.HashMap;

public class SymbolExpression extends Expression{
    protected Expression left;
    protected   Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //因为SymbolExpression 是让其子类实现，因此interpreter是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
