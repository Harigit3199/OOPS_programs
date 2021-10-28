abstract class Camera
{
    public abstract void lens();// abstract method
}
class Canon extends Camera
{
    public void lens()
    {
        System.out.println("Canon lens");
    }
}
class Sony extends Camera
{
    public void lens()
    {
        System.out.println("Sony lens");
    }
}
public class Abstractdemo
{
    public static void main(String[] args)
    {
        Camera S1= new Sony();
        Camera C1 = new Canon();

        S1.lens();
        C1.lens();

    }
}
