package uc.inheritance;

public class Manager extends Employee {//Employee Class'indan Manager alt Classí turettik
    // iki clas arasinda ortak olan method ==> showInfos method'u
    //showInfos methodunu Employee classinda tanimladik sonra Manager classinda override ettik

    private int numOfEmployees;
    public Manager(String name, String department, int salary,int numOfEmployees) {
        super (name, department, salary);
        this.numOfEmployees = numOfEmployees;
    }

    @Override
    public String toString() { //Maindeki sout(manager)'i override ettik
        return "Manager Object";

    }

    @Override //override edecegim yani kendime gore yazacagim
    public void showInfos() {
        System.out.println("Sorumlu kisi Sayisi : " + this.numOfEmployees);
        super.showInfos();
    }

    public void raiseSalary(int amount){
        System.out.println("Calisanlara " + amount +" TL zam yapildi");
    }
}
