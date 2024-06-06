package InheritanceDemo;

public class ChildClass extends BaseClass
{

    public void mul()
    {
        System.out.println("I ma in child class multiplication");
    }

    public void div()
    {
        System.out.println("I ma in child class division");
    }
    public static void main(String[] args)
    {
        //Child class object with the ref of chaild class ..access all base as ewll as child
        System.out.println("child class ref and child class obj\n");
        ChildClass ch=new ChildClass();
        ch.add();
        ch.sub();
        ch.div();
        ch.mul();

        System.out.println("\n base class ref and base class obj\n");
        BaseClass bs=new BaseClass();
        bs.add();
        bs.sub();

        System.out.println("\n base class ref and child class obj\n");
        BaseClass bs1=new ChildClass();
        bs1.sub();
        bs1.add();

        System.out.println("\n child class ref and base class obj 'ChildClass cl=new BaseClass()' is invalid\n");
        //ChildClass cl=new BaseClass();




    }
}
