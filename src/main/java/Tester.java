import Task1.StringConcat;
import Task2.Task2;
import Task3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Tester {
     public static void main(String[] args) {
         StringConcat stringConcat = new StringConcat();
         List<String> list = new ArrayList<>();
         list.add("String0");
         list.add("String1");
         list.add("String2");
         list.add("String3");
         System.out.println(stringConcat.concat(list));
         Task2 task2 = new Task2();
         list = task2.reversToUpper(list);
         for (String s : list) {
             System.out.println(s);
         }
         Task3 task3 = new Task3();
         System.out.println(task3.cleaningSorting(new String[]{"1, 2, 0", "4, 5"}));

     }
}

