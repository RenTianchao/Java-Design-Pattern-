package com.state.money;

public class ClientTest {
    public static void main(String[] args) {

        Context context = new Context();
        context.setState(new PublishState());

        System.out.println(context.getCurrentState());

        context.acceptOrderEvent(context);
        context.payOrderEvent(context);

        try {
            context.checkFailEvent(context);
            System.out.println("流程正常。。");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
