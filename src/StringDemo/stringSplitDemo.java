package StringDemo;

public class stringSplitDemo {

    public static void main(String[] args)
    {
      // String name="Selenium-Webdriver-Java-QTP";
       String name="Axxapf0090A";
        String [] tollname=name.split("-");
        for (int i=0;i<name.length();i++)
        {
            for (int j=1;j<name.length();j++)
            {
                if(name.charAt(i)==name.charAt(j))
                {
                    System.out.println(name.charAt(i));
                    System.out.println("true");
                }
            }

        }



    }
}
