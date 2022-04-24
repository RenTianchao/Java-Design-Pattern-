package com.interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression{


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //返回left表达式对应的值  super.left.interpreter(var)
        //返回right表达式对应的值  super.right.interpreter(var)
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
