package ConstructorDemo;

public class Student
{
   public void display()
   {
       System.out.println("This is in display method");
   }
    public Student()
    {
        System.out.println("This is in default constructor");
    }

    public Student(int marks)
    {
        System.out.println("This is in parameter constructor marks is "+marks);
    }
    public Student(String name)
    {
        System.out.println("This is in parameter constructor name is "+name);
    }
    public static void main(String[] args)
    {
        Student std=new Student("Nilofar");
        std.display();
    }

}
