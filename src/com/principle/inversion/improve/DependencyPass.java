package com.principle.inversion.improve;

public class DependencyPass {
    public static void main(String[] args) {

        //method1
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);


        //method2
//        ChangHong changHong = new ChangHong();
//        OpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();


        //method3
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}
//method 1
//interface IOpenAndClose{
//    public void open(ITV tv);
//
//}
//interface ITV{
//    public void play();
//}
//
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机");
//    }
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

////method 2
//interface IOpenAndClose{
//    public void open();
//
//}
//interface ITV{
//    public void play();
//}
//
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机");
//    }
//}
//
//class OpenAndClose implements IOpenAndClose{
//
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}


//method 3
interface IOpenAndClose {
    public void open();

    public void setTv(ITV tv);

}

interface ITV {
    public void play();
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机");
    }
}

class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}


