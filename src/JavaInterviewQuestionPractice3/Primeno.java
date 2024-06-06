package JavaInterviewQuestionPractice3;

public class Primeno {

    public static void main(String[] args) {

        int n=13;
        int i;
        if(n==1)
        {
            System.out.println("no is not prime");

        }
        for(i=2;i<n;i++)
        {
            if (n % i == 0)
        {
                System.out.println("no is not prime");
                break;

        }
        }
        if(n==i)
        {
            System.out.println("no is prime");
        }
    }
}
