package ParameterDemo;

public class DynamicCalculator {

    public static void main(String[] args)
    {
        PassParameter2 pa=new PassParameter2();

        System.out.println("In Dynamic Cal Result add is:"+pa.add(20,30));

        System.out.println("In Dynamic Cal Result sub is:"+pa.sub(45.50,30.00));

        System.out.println("My Name is:"+PassParameter2.getMyFullName("Nilofar","Mulla"));
    }
}
