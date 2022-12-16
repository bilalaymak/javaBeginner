package uc.interfaces.ornek;

public interface Shape {
    double getArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

/*
 Java dilinde nesneler arasındaki ilişkileri tanımlayan yapılardır. Ancak, inheritance ve interface arasında
 bazı temel farklılıklar vardır:

Inheritance, bir sınıfın diğer bir sınıftan kalıtım alması ile oluşur.
Bu sayede, kalıtım alan sınıf, kalıtım verilen sınıftaki özellikleri ve
yöntemleri kendi içine alır ve bu yöntemleri override edebilir. Inheritance, "is-a" ilişkisi oluşturur,
yani bir sınıf bir başka sınıftan kalıtım alırsa, o sınıf o başka sınıfın bir örneğidir.
Interface ise, bir sınıfın uygulaması gereken özellikleri ve yöntemleri tanımlayan bir yapıdır.
Interface, bir sınıf tarafından uygulandığında, o sınıf bu interface'in tanımladığı tüm yöntemleri içerir.
Interface, bir sınıfın bir başka sınıfın özelliklerini kalıtım alması gibi değildir,
ancak bir sınıf bir interface'i uygularsa, o sınıf o interface'in tanımladığı tüm yöntemleri içerir
ve bu yöntemleri kendine özgü bir şekilde implemente etmek zorundadır. Interface, "has-a" ilişkisi oluşturur,
yani bir sınıf bir interface'i uygularsa, o sınıf o interface'in özelliklerine sahiptir.
 */

