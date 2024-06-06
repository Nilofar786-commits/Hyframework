package SuperKeyWardDemo;

public class SubClass extends ParentClass {

    public SubClass(){
        System.out.println("I am in child class const");
    }

    public SubClass(String name){
        super("Mulla");
        System.out.println("I am in child class const "+ name);
    }
    public static void main(String [] args)
    {

        SubClass sb=new SubClass("Nilofar");


    }

}
