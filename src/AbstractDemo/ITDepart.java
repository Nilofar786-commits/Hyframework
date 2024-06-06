package AbstractDemo;

public abstract class ITDepart implements Emp{

    @Override
    public abstract void salary();

    @Override
    public void goodies() {

        System.out.println("Laptop");

    }

    @Override
    public void work() {
        System.out.println("Automation");

    }
}
