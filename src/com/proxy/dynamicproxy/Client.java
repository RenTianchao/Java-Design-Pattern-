package com.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args){
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        //System.out.println("proxyInstance = "+proxyInstance);

        //内存中动态生成了代理对象
        //System.out.println("proxyInstance = "+proxyInstance.getClass());

        proxyInstance.teach();

    }
}
