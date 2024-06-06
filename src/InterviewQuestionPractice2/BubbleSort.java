package InterviewQuestionPractice2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] a={1,3,2,7,6};

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println("sorted array:"+ Arrays.toString(a));

    }
}
