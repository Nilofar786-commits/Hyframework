package ThisKeyDemo;

public class Myvariables {
    int x,y;

    public Myvariables(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void sum()
    {
        int sum=x+y;
        System.out.println("Addition is:"+sum);
    }
    public static void main(String [] args)
    {
        Myvariables obj=new Myvariables(10,20);
        obj.sum();
    }

}
