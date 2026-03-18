package ejerciciosclases4_2;

public class Circle{
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        return "Circle[radius="+radius+", color="+color+"]";
    }

    public static class Cylinder {
        private Circle base;
        private double height;

        public Cylinder() {
            base=new Circle();
            height=1.0;
        }

        public Cylinder(double radius, String color, double height){
            base=new Circle(radius, color);
            this.height=height;
        }

        public double getHeight(){
            return height;
        }

        public void setHeight(double height){
            this.height=height;
        }

        public double getRadius(){
            return base.getRadius();
        }

        public void setRadius(double radius){
            base.setRadius(radius);
        }

        public String getColor(){
            return base.getColor();
        }

        public void setColor(String color){
            base.setColor(color);
        }

        public double getVolume(){
            return base.getArea()*height;
        }

        @Override
        public String toString(){
            return"Cylinder[base="+base.toString()+", height="+height+"]";
        }
    }
}
