package JavaInterviewQuestionPractice3;

public class reverseEachWO {
    //Program to reverse each words
    //Nilo far===oliN raf

    public static void main(String[] args) {

        String str="far nilo";
        String rev="";
        String[] astr=str.split(" ");

        for(int i=0;i< astr.length;i++)
        {
            String word=astr[i];
            String temprev="";
            for(int j=word.length()-1;j>=0;j--)
            {
                temprev=temprev+str.charAt(j);
            }
            rev=rev+temprev+" ";
        }
        System.out.println("Reverse of each string is:"+rev);

    }
}
