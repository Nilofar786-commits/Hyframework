package JavaInterviewQuestionPractice3;

public class ArrayMax {

    public static void main(String[] args) {

        int[] a={12,45,89,0,10};
        int max=a[0];
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }

        System.out.println("Max no is:"+max);
    }

}
