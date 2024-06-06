package JavaInterviewQuestionPractice3;

public class noofoccuranceofgivenchar {

    //Write program to find count of total no of occurance of given char

    public static void main(String[] args) {

        char c='i';
        String str="Nilofari";

        int count=0;
        count=str.length()-str.replace("i","").length();
        System.out.println("occurance of i is:"+count);
    }
}
