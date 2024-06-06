package Test;

public class Stringpro
{

    // Your name is Nilofar Mulla Write code to make it Mulla Nilofar .  write down. Program ?

    public static void main(String[] args)
    {

     java.lang.String str="Nilofar Mulla";
        java.lang.String[] s=str.split("");
        java.lang.String rev=" ";

        for(int i=s.length-1;i<=0;i++)
        {
            rev=rev+s[i];
        }
        System.out.println("reverse String is:"+rev);
    }
}
