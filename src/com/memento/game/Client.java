package com.memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);

        System.out.println("大战前的状态");
        gameRole.display();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("大战......");
        gameRole.setVit(30);
        gameRole.setDef(30);
        gameRole.display();

        System.out.println("大战后使用备忘录恢复到大战前");
        gameRole.recoverGameRoleFromeMemento(caretaker.getMemento());

        System.out.println("恢复了！");
        gameRole.display();

    }
}
