package SampleProgram;

public class LocalGlobalVar
{

    //global var--which is always static
    static int b;
    public static void main(String[] args)
    {
        //local var
        int a=10;
        System.out.println("local value is:"+a);
        System.out.println("global value is:"+b);
    }
}
