package InterviewQuestionPractice2;

public class ReverveString {
    public static void main(String[] args) {

        String str="nilofar java";
        String rev="";

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse String:"+rev);
    }
}
