public class Overloadingdemo
{
    public void sum(int a, int b)
    {
        System.out.println("sum is= "+(a+b));
    }
    public void sum(double a,double b)
    {
        System.out.println("sum is= "+(a+b));
    }
    public void sum(float a,float b)
    {
        System.out.println("sum is= "+(a+b));
    }
    public void sub(int a, int b, int c)
    {
        System.out.println("sub is= "+(a-b-c));
    }
    public static void main(String[] args)
    {
        Overloadingdemo cal= new Overloadingdemo();
        cal.sum(30,60);
        cal.sum(37.6,20.9);
        cal.sum(35.6f,23.4f);
        cal.sub(23,45,67);
    }
}
