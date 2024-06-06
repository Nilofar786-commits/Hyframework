package ConditionalStatementDemo;

public class IfDemo {

    public static void main(String[] args)
    {
        int a=19;
        String browser="Chrome1";
        if(browser.equalsIgnoreCase(("Chrome")))
        {
            System.out.println("Its chrome");
        }
        else {
            if (a < 20)
            {
                System.out.println("Print value of a:" + a);
            } else
            {
                System.out.println("Print a is less than 20");
            }
        }
    }
}
