 class Phone
{
    public void play()
    {
        System.out.println("Playing Games");
    }

}
class iPhone extends Phone
{
    @Override
    public void play()
    {
        System.out.println("GTA games");
    }

    public static void main(String[] args)
    {
        iPhone ios = new iPhone();
        Phone p = new Phone();
        ios.play();
        p.play();
    }
}