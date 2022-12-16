package uc.inheritance;

public class Main {
    public static void main(String[] args) {

       /* Employee employee = new Employee("Bilal Aymak", "Bilisim", 20000);
        employee.showInfos();


        */
        Manager manager = new Manager("Bilal Aymak", "Bilisim", 20000, 10);
        manager.showInfos();
        manager.raiseSalary(100);
        System.out.println(manager);

        System.out.println("***********************");
        //polimorphism
        /*
        Java'da, polymorphism iki şekilde gerçekleştirilebilir:
        Overriding (üstün yazma): Bir sınıftaki bir metodun, miras alınan bir alt sınıfta aynı isim
        ve parametrelerle yeniden tanımlanmasıdır. Bu sayede, alt sınıfın özel bir davranışı oluşturulmuş olur.
        Overloading (aşırı yükleme): Aynı isimde, fakat farklı parametrelerle tanımlanmış metodların bulunmasıdır.
        Bu sayede, aynı metod adı ile farklı işlemler yapılabilir.
         */
        Employee employee = new Manager("Bilal Aymak", "Bilisim", 18000, 10);
        employee.showInfos();
    }
}
