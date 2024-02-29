class Circle{
    private int radius;
    
    public Circle(int radius){
        setRadius(radius);
    }

    public void setRadius(int radius){
        if (radius > 0) 
            this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

public class TestCircle{
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
    }
}