package JavaInterviewQuestionPractice3;

public class noOfwords {

    //count no of words in a sting
    //Nilofar is Nilo
    public static void main(String[] args) {

        String str="Nilofar is Nilo marva";
        int len=str.length();
        System.out.println("Lengh of string is :"+len);

        int count=1;
        for(int i=0;i<len-1;i++)
        {
            if((str.charAt(i)==' ' && str.charAt(i+1)!=' '))
            {
                count=count+1;
            }
        }
        System.out.println("Count of worsd is :"+count);
    }


}
