package InterviewQuestionPractice2;

public class CountNoofWord {

    public static void main(String[] args) {

        String st="Nilofar is";
        int count=1;
        for(int i=0;i<st.length();i++)
        {
            if((st.charAt(i)==' ')&&(st.charAt(i+1)!=' '))
            {
                count++;
            }

        }
        System.out.println("Count of words in :"+count);


    }
}

