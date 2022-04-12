package com.proxy.cglib;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor{//没有引入包，所以报错。

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //1.创建工具类
        Enhancer enhancer = new Enhancer();//没有引入包，所以报错。
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写 intercept方法，会调用目标对象的方法
    public Object intercept(Object arg0, Method method, Object[] args, MethodHandle arg3) throws Throwable{
        System.out.println("Cglib 代理模式~~开始");
        Object returnVal = method.invoke(target,args);
        System.out.println("Cglib 代理模式~~提交");
        return returnVal;
    }
}
