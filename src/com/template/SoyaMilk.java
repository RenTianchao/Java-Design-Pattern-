package com.template;

public abstract class SoyaMilk {

    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步：选择好的新鲜黄豆 ");
    }


    //子类具体实现
    abstract void addCondiments();

    //
    void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要3小时");
    }

    void beat(){
        System.out.println("第四步，黄豆和配料放到豆浆机里面打碎");
    }
}
