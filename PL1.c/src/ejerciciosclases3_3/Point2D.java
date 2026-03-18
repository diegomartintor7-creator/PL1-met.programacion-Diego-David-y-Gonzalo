package ejerciciosclases3_3;

public class Point2D{
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public Point2D(){
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y=y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        return new float[]{x, y};
    }

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    public static class Point3D extends Point2D{
        private float z=0.0f;

        public Point3D(float x, float y, float z){
            super(x,y);
            this.z=z;
        }

        public Point3D(){
            super();
        }

        public float getZ(){
            return z;
        }

        public void setZ(float z){
            this.z=z;
        }

        public void setXYZ(float x, float y, float z){
            setXY(x,y);
            this.z=z;
        }

        public float[] getXYZ(){
            return new float[]{getX(), getY(), z};
        }

        @Override
        public String toString(){
            return "("+getX()+","+getY()+","+z+")";
        }
    }
}
