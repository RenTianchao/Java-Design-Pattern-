package com.flyweight;

public class Client {

    public static void main(String[] args){
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use(new User("Tom"));

        WebSite webSite1 = webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(new User("Jack"));

        WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
        webSite2.use(new User("Smith"));
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("Jerry"));

        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("John"));

        System.out.println("--------------");
        System.out.println(webSiteFactory.getWebSiteCount());


    }
}
