class Employee{
    int id;
    String name;
    int salary;
    public void show(int i, String n, int s)
    {
        id=i;
        name=n;
        salary=s;

    }
    public void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }

}
public class Classobjdemo
{
    public static void main(String[] args)
    {
        Employee emp1= new Employee();
        Employee emp2= new Employee();
        Employee emp3 = new Employee();
        emp1.show(234,"Hari",20000);
        emp2.show(345,"Haran",15000);
        emp3.show(567,"MSD",30000);
        emp1.display();
        emp2.display();
        emp3.display();
    }

}
