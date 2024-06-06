package methodOverridingDemo;

public class ChildClass extends Parent
{
    public void display()
    {
        System.out.println("I am in Child class method");

    }
    public void display(String name)
    {
        System.out.println("I am in Child class method");
    }

    public static void main(String[] args)
    {
        ChildClass obj=new ChildClass();
        obj.display();

        Parent obj2=new Parent();
        obj2.display();

        Parent obj3=new ChildClass();
        obj3.display();

        //ChildClass obj4=new Parent();
    }
}
