package ConstructorDemo;

public class Student2
{
    int marks;
   public void display()
   {
       System.out.println("This is display method to show marks:"+marks);
   }
    public Student2(int num)
    {
        marks=num;
    }

    public Student2(String name)
    {
        System.out.println("This is in parameter constructor name is "+name);
    }
    public static void main(String[] args)
    {
        Student2 std=new Student2(85);
        Student2 std2=new Student2("Nilofar");
        std.display();
    }

}
