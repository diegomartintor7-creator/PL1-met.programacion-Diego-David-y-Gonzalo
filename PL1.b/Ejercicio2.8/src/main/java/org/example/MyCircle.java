package org.example;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(){
        center = new MyPoint(0,0);
        radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return (int)center.getX();
    }

    public void setCenterX(int centerX){
        this.center.setX(centerX);
    }

    public int getCenterY(){
        return (int)center.getY();
    }

    public void setCenterY(int centerY){
        this.center.setY(centerY);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }

    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }

    public String toString(){
        return "MyCircle[radius=" + radius + ", center=" + center.toString() + "]";
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    public double distance(MyCircle another){
        return (center.distance(another.center)-this.radius - another.radius);
    }
}
