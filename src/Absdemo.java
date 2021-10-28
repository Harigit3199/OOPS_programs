abstract class Bike
{
    abstract void run();
}
class BMW extends Bike{
    void run() // overriding abstract method
    {
        System.out.println("BMW 1250GS");
    }

}
class Triumph extends Bike
{
    void run()
    {
        System.out.println("Power of Triumph ");
    }
}
class Absdemo
{
    public static void main(String[] args)
    {
        Bike B1= new BMW();
        Bike B2= new Triumph();
        B1.run();
        B2.run();
    }
}