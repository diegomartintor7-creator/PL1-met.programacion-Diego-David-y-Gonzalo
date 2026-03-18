package org.example;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{(int)this.x, (int)this.y};
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(int x, int y){
        double distance = Math.sqrt(Math.pow((this.x-x),2) + Math.pow((this.y-y),2));
        return distance;
    }

    public double distance(MyPoint another){
        double distance = Math.sqrt(Math.pow((this.x- another.getX()),2) + Math.pow((this.y- another.getY()),2));
        return distance;
    }

    public double distance(){
        return Math.sqrt(Math.pow((this.x),2) + Math.pow((this.y),2));
    }
}