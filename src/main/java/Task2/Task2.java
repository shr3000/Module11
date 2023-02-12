package Task2;

import java.util.*;

/*
Задание 2
Метод принимает на вход список из строк (можно список из Задания 1). Возвращает список этих строк в верхнем регистре и
отсортированные по убыванию (от Z до А).
 */
public class Task2 {
    public List<String> reversToUpper(List<String> list) {
        list.sort(Collections.reverseOrder());
        List<String> temt = new ArrayList<>();
        for (String s: list) {
            temt.add(s.toUpperCase());
        }
        return temt;
    }
}
