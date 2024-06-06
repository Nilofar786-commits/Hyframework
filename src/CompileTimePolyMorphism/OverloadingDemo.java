package CompileTimePolyMorphism;

public class OverloadingDemo
{
    public void add(int a,int b)
    {
        System.out.println("1st add:"+(a+b));
    }
    public void add(int a,int b,int c)
    {
        System.out.println("2nd add:"+(a+b+c));
    }
    public void add(double a,double b)
    {
        System.out.println("3rd add:"+(a+b));
    }
    public void add(int a,double b)
    {
        System.out.println("4th add:"+(a+b));
    }

    public void add(double b,int a)
    {
        System.out.println("5th add:"+(a+b));

    }


    public static void main(String[] args)
    {
        OverloadingDemo od=new OverloadingDemo();
        od.add(10,20);
        od.add(10,20,30);
        od.add(20.05,10.02);
        od.add(30,20.15);
        od.add(20.15,1);
    }

}
