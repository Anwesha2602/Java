class A
{
    static void show()
    {
        System.out.println("In A");
    }
}
class B extends A
{
    static void show()
    {
        System.out.println("In B");
    }
}
public class Hiding
{
    public static void main(String[] args) 
    {
        A ob=new B();
        ob.show();
    }
}