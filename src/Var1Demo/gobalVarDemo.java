package Var1Demo;

public class gobalVarDemo {
    int rollno;
    int marks;

    public gobalVarDemo (int rollno,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;

    }

    public void getMarks()
    {
        System.out.println("rollno is "+rollno +" and marks are "+marks);
    }
    public static void main(String[] args)
    {

        gobalVarDemo obj1=new gobalVarDemo(5,85);
        gobalVarDemo obj2=new gobalVarDemo(12,92);
        gobalVarDemo obj3=new gobalVarDemo(11,90);
        //how to access non static golbal varibale in static method --uisng object of a class
        System.out.println("rollno is "+obj1.rollno +" and marks are "+obj1.marks);
        obj1.getMarks();
        obj2.getMarks();
        obj3.getMarks();
    }
}
