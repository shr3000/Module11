import Task1.StringConcat;
import Task2.Task2;
import Task3.Task3;
import Task4.Task4;
import Task5.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
     public static void main(String[] args) {
         //Task1
         StringConcat stringConcat = new StringConcat();
         List<String> list = new ArrayList<>();
         list.add("String0");
         list.add("String1");
         list.add("String2");
         list.add("String3");
         System.out.println(stringConcat.concat(list));

         //Task2
         Task2 task2 = new Task2();
         list = task2.reversToUpper(list);
         for (String s : list) {
             System.out.println(s);
         }

         //Task3
         Task3 task3 = new Task3();
         System.out.println(task3.cleaningSorting(new String[]{"1, 2, 0", "4, 5"}));

         //Task 4
         //Для теста используйте данные a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
         Task4 task4 = new Task4();
         long a = 25214903917L;
         long c = 11L;
         long m = (long) Math.pow(2, 48);
         long seed = System.currentTimeMillis();
         task4.generateRND(seed, a, c, m)
                 .limit(4)
                 .mapToLong(x -> x)
                 .forEach(System.out::println);

         Task5 task5 = new Task5();
         Stream<Integer> str1 = Stream.of(0, 2, 4, 6, 8, 10);
         Stream<Integer> str2 = Stream.of(1, 3, 5, 7, 9);
         System.out.println(task5.zip(str1, str2).collect(Collectors.toList()));

     }
}

