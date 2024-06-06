package StringDemo;

public class stringDemo1 {

    public static void main(String[] args)
    {
        String name="Selenium Webdriver";
        String name1="Welcome to Selenium Word";
        boolean status1,status2,status3,status4;
        status1=name.startsWith("Selenium");
        //status2=name1.equalsIgnoreCase("welcome To selenium Word");
        status2=name1.equalsIgnoreCase(name);
        status3=name1.contains("to");
        status4=name1.endsWith("Word");
        System.out.println(" 1st status:"+status1);
        System.out.println(" 2nd status:"+status2);
        System.out.println(" 3rd status:"+status3);
        System.out.println(" 3rd status:"+status4);

    }
}
