package uc.inheritance.polimoephismexample;

class Shape {
    // "area()" metodunu tanımlıyoruz
    public double area() {
        return 0;
    }

    // "draw()" metodunu farklı parametreler alacak şekilde tanımlıyoruz
    public void draw(int x, int y) {
        System.out.println("Drawing shape at position (" + x + ", " + y + ")");
    }

    public void draw(String color) {
        System.out.println("Drawing shape with color " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // "area()" metodunu override ediyoruz
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // "area()" metodunu override ediyoruz
    @Override
    public double area() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);

        // "area()" metodunu, farklı sınıflardaki nesneler için kullanıyoruz
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());

        // "draw()" metodunu, farklı parametreler kullanarak çağırıyoruz
        circle.draw(3, 4);
        rectangle.draw("red");
    }
}

/*
CIKTI

Circle area: 78.53981633974483
Rectangle area: 50.0
Drawing shape at position (3, 4)
Drawing shape with color red

 */
