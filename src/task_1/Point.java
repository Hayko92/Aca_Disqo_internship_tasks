package task_1;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance() {
        double result = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return  result;

}

    public double distance(Point secondPoint) {
        double result = Math.sqrt(Math.pow(x-secondPoint.getX(),2)+Math.pow(y- secondPoint.getY(),2));
        return  result;

    }
    public Point() {
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
}
