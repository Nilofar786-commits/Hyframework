package methodOverridingDemo;

public class SBI extends RBI implements Loan {

    public void homeloanIntRate()
    {
        System.out.println("Home Loan Int rate is 10%");
    }

    public static void main(String[] args)
    {
        SBI obj=new SBI();
        obj.homeloanIntRate();
        obj.homeloan();
        obj.carloan();
        RBI obj1=new RBI();
        obj1.homeloanIntRate();
    }

    @Override
    public void homeloan() {

            System.out.println("SBI providing home loan");
    }


    @Override
    public void carloan() {
        System.out.println("SBI providing car loan");
    }
}
