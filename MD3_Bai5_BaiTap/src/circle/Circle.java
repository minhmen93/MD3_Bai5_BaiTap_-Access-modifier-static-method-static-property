package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    // hàm tạo không có tham số
    public Circle(){

    };

    // hàm tạo có tham số là radius;
    public Circle(double radius){
     this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea (){
        return Math.PI * radius*radius;
    }
}

