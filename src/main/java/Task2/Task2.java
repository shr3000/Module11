package Task2;

import java.util.*;
import java.util.stream.Collectors;

/*
Задание 2
Метод принимает на вход список из строк (можно список из Задания 1). Возвращает список этих строк в верхнем регистре и
отсортированные по убыванию (от Z до А).
 */
public class Task2 {
    public List<String> reversToUpper(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
