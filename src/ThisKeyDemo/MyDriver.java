package ThisKeyDemo;

public class MyDriver {

    public MyDriver()
    {
        System.out.println("This is default");

    }
    public MyDriver(int num)
    { this();
        System.out.println("This is int Parameter "+num);
    }
    public MyDriver(String name)
    {
        this(10);
        System.out.println("This is int Parameter "+name);
    }
    public void disply(){
        System.out.println("This is just method");
    }
    public static void main()
    {
        MyDriver obj1=new MyDriver("Nilo");
        obj1.disply();
        
    }

}
