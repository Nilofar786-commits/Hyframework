package WrapperClassDemo;

public class SecondDemoWrapper
{
    public static void main(String[] args)
    {
      String price="120";
      String price1="350.15";
      double finalPrice;
              int p1=Integer.parseInt(price);
              double p2=Double.parseDouble(price1);
              finalPrice=p1+p2;

              System.out.println("Sum is "+finalPrice);
    }


}
