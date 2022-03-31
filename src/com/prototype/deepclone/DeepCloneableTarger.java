package com.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarger implements Serializable,Cloneable {
    private String cloneName;
    private String cloneClass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public DeepCloneableTarger(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
}
