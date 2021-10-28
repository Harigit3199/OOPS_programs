public class Classdemo
{
    String color,brand;
    int camera,price;

    public Classdemo(String brand, String color,int camera,int price)
    {
        this.brand=brand;
        this.color=color;
        this.camera=camera;
        this.price=price;
    }
    public static void main(String[] args)
    {
        Classdemo obj1= new Classdemo("iPhone 13","Pacific blue",12,80000);
        Classdemo obj2= new Classdemo("Xiaomi","Black",108,50000);
        Classdemo obj3= new Classdemo("Samsung S21","Red",108,90000);


        System.out.println(obj1.brand+" color: "+obj1.color+" Megapixel: "+obj1.camera+" Cost: "+obj1.price);
        System.out.println(obj2.brand+" Color:  "+obj2.color+" Megapixel: "+obj2.camera+" Cost:  "+obj2.price);
        System.out.println(obj3.brand+" Color: "+obj3.color+" Megapixel: "+obj3.camera+" Cost: "+obj3.price);

    }

}
