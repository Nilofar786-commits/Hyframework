package JavaInterviewQuestionPractice3;

public class ArraySort {
    public static void main(String[] args) {
        int[] a={12,1,8,3,75,0};
        int temp;
        System.out.println(a.length);

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Max no is:"+a[a.length-1]);

    }
}
