package com.memento.game;

import java.util.ArrayList;
import java.util.HashMap;

public class Caretaker {
    //只保存一次状态
    private Memento memento;
    //对GameRole 保存多次
//    private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
//    private HashMap<String,ArrayList<Memento>> rolesMementos;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
