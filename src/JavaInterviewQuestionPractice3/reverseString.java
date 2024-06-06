package JavaInterviewQuestionPractice3;

public class reverseString {

    public static void main(String[] args) {

        String str = "Nilofar Mulla";
        String rev="";
        // Logic 1
     /* StringBuffer bf=new StringBuffer(str);

             rev=rev+ bf.reverse();
             System.out.println("reverseb String is:"+rev);
    */
        //logic 2

        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reverse String is:"+rev);


    }
}
