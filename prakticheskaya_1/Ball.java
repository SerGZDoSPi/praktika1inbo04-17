package com.zubkov;

public class Ball {
    public static void main(String[] args){
        Ball firstBall = new Ball("Мяч №1", "красный", 13.91);
        Ball secondBall = new Ball("Мяч №2", "зелёный", 31.77);
        firstBall.Print();
        System.out.println(secondBall.toString());
        System.out.println(Ball.getCOUNT());
    }

    private static int COUNT=0;
    private String name;
    private String color;
    private double radius;

    Ball(String name, String col, double radius) {
        this.name = name;
        this.color = col;
        this.radius = radius;
        COUNT++;
    }

    public Ball() {}

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    static int getCOUNT(){ return COUNT; }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void Print() {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Radius: " + this.radius + "\n");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(name);
        sb.append("\nColor: ");
        sb.append(color);
        sb.append("\nRadius: ");
        sb.append(radius);
        return sb.toString();
    }
}
