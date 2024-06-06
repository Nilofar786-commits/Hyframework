package SampleProgram;

public class fibonicesSeries {

    public static void main(String[] args)
    {
        //0,1,1,2,3,5
        int num=10;
        int a,b,c;
        a=0;
        b=1;
        c=1;
        //System.out.println(a);
        //System.out.println(b);
        for(int i=0;i<=num;i++)
        {
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }


    }
}
