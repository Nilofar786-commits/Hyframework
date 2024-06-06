package ParameterDemo;

public class PassParameter {

    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Result add is:"+c);
    }

    public void sub(double a,double b)
    {
        double c=a-b;
        System.out.println("Result sub is:"+c);

    }

    public static void main(String[] args)
    {
         PassParameter pa=new PassParameter();
         pa.add(20,30);
         pa.sub(45.50,30.00);
    }
}
