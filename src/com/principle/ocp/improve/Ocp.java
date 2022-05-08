package com.principle.ocp.improve;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());

    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("矩形");

    }
}

class Circle extends Shape {
    public Circle() {
        m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}

class Triangle extends Shape{
    public Triangle() {
        m_type =3;
    }

    @Override
    public void draw() {
        System.out.println("三角形");
    }
}

class OtherGraphic extends Shape{
    public OtherGraphic() {
        super.m_type =4;
    }

    @Override
    public void draw() {
        System.out.println("其他图形");
    }
}