package SuperKeyWardDemo;

public class ChildClass extends BaseClass{

    int intrate=15;

    public static void main(String[] args)
    {
        ChildClass ch=new ChildClass();
        ch.showIntRatech();

    }


    public void showIntRate()
    {
        System.out.println("Child class Current rate from private bank:"+super.intrate);
    }
    public void showIntRatech()
    {
        super.showIntRate();
        System.out.println("Child class Current rate from private bank:"+super.intrate);
    }
}
