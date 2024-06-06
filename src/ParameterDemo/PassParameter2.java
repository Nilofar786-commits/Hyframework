package ParameterDemo;

public class PassParameter2 {

    public int add(int a,int b)
    {
        int c=a+b;
        return c;
    }

    public double sub(double a,double b)
    {
        double c=a-b;
        return c;
    }
    public static String getMyFullName(String fn,String ln)
    {
        String c=fn+" "+ln;
        return c;
    }

   /* public static void main(String[] args)
    {
         PassParameter2 pa=new PassParameter2();

        System.out.println("Result add is:"+pa.add(20,30));

        System.out.println("Result sub is:"+pa.sub(45.50,30.00));
    }*/

}
