package org.example;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return (int)begin.getX();
    }

    public int getBeginY(){
        return (int)begin.getY();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }

    public void setBeginY(int y){
        begin.setY(y);
    }

    public int getEndX(){
        return (int)end.getX();
    }

    public int getEndY(){
        return (int)end.getY();
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[] { (int) begin.getX(), (int) begin.getY() };
    }

    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }

    public int[] getEndXY(){
        return new int[] { (int) end.getX(), (int) end.getY() };
    }

    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient(){
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    public String toString(){
        return "MyLine[begin=" + begin.toSrtring() + ", end=" + end.toSrtring() + "]";
    }
}
