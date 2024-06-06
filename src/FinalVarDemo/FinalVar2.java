package FinalVarDemo;

public class FinalVar2 {
 final int marks;

 public FinalVar2(int marks)
 {
     this.marks=marks;
 }

    public void show()
    {
        //marks=95;
        //marks=85;
        System.out.println("Marks:"+marks);
    }
    public static void main(String[] args)
    {
        FinalVar2 obj=new FinalVar2(98);
        obj.show();
    }

}
