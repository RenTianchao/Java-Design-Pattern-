package com.command;

public class Client {

    public static void main(String[] args){

        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("电灯");
        System.out.println("----do---");
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);

        System.out.println("----undo---");
        remoteController.undoButtonWasPushed();

        System.out.println("=======================");

        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);

        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        System.out.println("电视");
        System.out.println("----do---");
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        System.out.println("----undo---");
        remoteController.undoButtonWasPushed();

    }
}
