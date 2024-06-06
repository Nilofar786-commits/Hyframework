package InterfaceDemo;

public class AdvanceCal implements Calc
{
    //overriding
    public void add()
    {
        System.out.println("This is add implements from interface");
    }
    public void sub()
    {
        System.out.println("This is sub implements from interface");
    }
    public static void main(String[] args)
    {

        //Child class ref and child obj
        AdvanceCal cal=new AdvanceCal();
        cal.add();
        cal.sub();

        System.out.println("Interface variable:"+cal.x);
        //base class ref and base class obj
      //  Calc c1=new Calc() ; //is invalid as in java we can not create object of interface

        //baseclass ref nad child class obj
        Calc c=new AdvanceCal(); //this is allow as we are creating object of child class
        c.add();
        c.sub();
        System.out.println("Interface variable:"+c.x);
        //child class ref n Base class obi not allow

        //AdvanceCal cal1=new Calc(); //this is not allow as java wont allow to create object of interface.

        }
    }

