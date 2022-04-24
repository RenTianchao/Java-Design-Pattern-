package com.memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1 攻击力是100");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2 攻击力是80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3 攻击力是50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态是： "+ originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复到状态1后，当前的状态是： "+ originator.getState());
    }
}
