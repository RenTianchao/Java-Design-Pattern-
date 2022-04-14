package com.command;

public class TVOnCommand implements Command {
    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    TVReceiver tv;

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
