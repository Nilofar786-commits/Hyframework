package InterviewQuestionPractice2;

public class Occuranceofgivenchar {
    public static void main(String[] args) {

        String str="abccc";
        char gc='c';

        int c;
        c=str.length()-str.replace("c","").length();
        System.out.println("Occurance of c is:"+c);
    }
}
