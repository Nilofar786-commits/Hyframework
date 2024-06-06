package FinalVarDemo;

public class FinalVar {


    public void show()
    {
        final int marks=95;
        //marks=85;
        System.out.println("Marks:"+marks);
    }



    public static void main(String[] args)
    {
        FinalVar obj=new FinalVar();
        obj.show();
    }

}
