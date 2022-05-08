package com.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());

    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        } else if (s.m_type ==3){
            drawTriangle(s);
        }

    }

    private void drawTriangle(Shape s) {
        System.out.println("三角形");
    }

    private void drawCircle(Shape s) {
        System.out.println("圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("矩形");
    }

}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        m_type = 2;
    }
}

class Triangle extends Shape{
    public Triangle() {
        m_type =3;
    }
}