public class ReverString {

    public static void main(String[] args) {

        String str="Rajesh Umang";
        char ch;
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            temp=ch+temp;
        }

        System.out.println("Reverse String is:"+temp);
    }
}
