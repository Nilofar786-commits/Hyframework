package ArrayDemo;

import java.awt.*;

public class MultiDiArrayDemo
{
    public static void main(String[] args)
    {
        String stud[][]=new String[2][2];
        stud[0][0]="Nilo";
        stud[0][1]="Mulla";
        stud[1][0]="Jazz";
        stud[1][1]="Taufiq";

        System.out.println("Name at [0][1] "+stud[0][1]);
    }
}
