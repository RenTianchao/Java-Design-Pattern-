package com.state;

public class NoRaffleState extends State{
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除20积分成功，可以抽奖了！");
        activity.setState(activity.getCanRaffleState());

    }

    @Override
    public boolean raffle() {
        System.out.println("扣除了积分才能抽奖！");
        return false;

    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");


    }
}
