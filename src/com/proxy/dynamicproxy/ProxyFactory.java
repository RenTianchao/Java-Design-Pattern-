package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /*
    public static Object newProxyInstance(ClassLoader loader,//指定当前目标对象使用的类加载器,获取加载器的方法固定
                                          Class<?>[] interfaces,//目标对象实现的接口类型，使用泛型方法确认类型
                                          InvocationHandler h)//事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前执行的目标对象方法最为参数传入
        throws IllegalArgumentException
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始...");
                        //反射机制调用目标对象方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理提交...");
                        return returnVal;
                    }
                }
        );
    }
}
