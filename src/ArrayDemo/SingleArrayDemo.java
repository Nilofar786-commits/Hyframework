package ArrayDemo;

public class SingleArrayDemo
{

    public static void main(String[] args)
    {
        int stud[ ]=new int [5];
        stud[0]=(int)80.55;
        stud[1]=10;
        stud[2]=20;
        stud[3]=30;
        stud[4]=40;
        for (int i=0;i< stud.length;i++)
        {
            System.out.println(i+" Student details is "+stud[i]);
        }
        String stud_name[]=new String[5];
    }
}
