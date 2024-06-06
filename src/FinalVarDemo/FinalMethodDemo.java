package FinalVarDemo;

public class FinalMethodDemo extends ParentClass{

   /* public final void name()
    {
        System.out.println("My name is Jazlyn");
    }*/
    public void Address()
    {
        System.out.println("My add is Vita");
    }

    public final void phone()
    {
        System.out.println("My phone is 9860601837");
    }



    public static void main(String[] args)
    {
       FinalMethodDemo obj=new FinalMethodDemo();
       obj.name();
       obj.Address();
       obj.phone();
    }
}
