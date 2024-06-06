package ThisKeyDemo;

public class MyDriver1 {

    public MyDriver1()
    {
        this(10);
        System.out.println("This is default");

    }
    public MyDriver1(int num)
    { this("nilo");
        System.out.println("This is int Parameter "+num);
    }
    public MyDriver1(String name)
    {

        System.out.println("This is int Parameter "+name);
    }
    public void disply(){
        System.out.println("This is just method");
    }
    public static void main(String [] args)
    {
        MyDriver1 obj1=new MyDriver1();
        obj1.disply();


    }

}
