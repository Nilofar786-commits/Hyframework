package AbstractDemo;

public class HRTeam extends ITDepart {

    public void bonus()
    {
        System.out.println("Bonus is 5%'");
    }

    public static void main(String[] args) {
        HRTeam hr = new HRTeam();
        hr.goodies();
        hr.work();
        hr.salary();
        hr.bonus();

        ITDepart it = new HRTeam();
        it.salary();
        it.work();
        it.goodies();


        //ITDepart it1=new ITDepart() ;

    }

    @Override
    public void salary() {

        System.out.println("Salary is 6.8 lakha");
    }
}
