package com.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    public String name;//String 不是基本数据类型，是引用类型，视频觉得它是基本数据类型，想让他走浅拷贝。
    public DeepCloneableTarger deepCloneableTarger;

    public DeepProtoType() {
    }

    //深拷贝 方式一 使用clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆。
        deep = super.clone();
        //对引用类型的属性，进行单独处理。
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarger = (DeepCloneableTarger) deepCloneableTarger.clone();
        return deepProtoType;
    }

    //深拷贝 方式二 通过对象序列化实现
    public Object deepclone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;
        } catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }
}
