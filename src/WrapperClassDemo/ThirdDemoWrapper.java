package WrapperClassDemo;

public class ThirdDemoWrapper
{
    public static void main(String[] args)
    {
        int a=100;
        //Auto boxing
        Integer b=a;

        // boxing
        Integer c=Integer.valueOf(a);


//automatic converting bet the primitive data types to correspong object caled autoboxing
              System.out.println("Autoboxing  "+b);
        System.out.println(" boxing  "+c);

        //convert object into respective primitive data types called unboxing
//Unboxing
        Integer d=300;
        int f=d.intValue();
        System.out.println(" unboxing  "+f);
        //Autounboxing

        int g=d;
        System.out.println(" auto unboxing  "+g);


    }


}
