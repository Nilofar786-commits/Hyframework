package ListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2
{
    public static void main(String[] args)
    {
        ArrayList obj=new ArrayList();
        List<Integer> obj2 =new ArrayList<Integer>();
        obj.add("Nilofar");
        obj.add(123);
        obj.add(45.50);

        obj2.add(1);
        obj2.add(2);
        obj2.add(12);
        int size=obj.size();
        for(int i=0;i<size;i++)
        {
            if(i==2)
              System.out.println("ArrayList elements are:"+obj.get(i));
        }

        for(Object abc:obj2)
        {
            System.out.println("ArrayList Integer elements are:"+abc);
        }
      Iterator it=obj.iterator();
        while(it.hasNext()){

            System.out.println("*******************ArrayList  elements are :"+it.next());
        }
    }

}



