package com.state;

import java.util.Random;

public class CanraffleState extends State{
    RaffleActivity activity;

    public CanraffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分！");

    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍后!");
        Random r = new Random();
        int num = r.nextInt(10);
        if (num == 0){
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("没有抽到奖品！");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");

    }
}
