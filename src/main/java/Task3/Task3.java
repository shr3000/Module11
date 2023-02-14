package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Дан массив:

["1, 2, 0", "4, 5"]

Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть

"0, 1, 2, 4, 5"
 */
public class Task3 {
    public String cleaningSorting(String[] strings) {
        List<String> list = new ArrayList<>();
        return Arrays.stream(strings)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

}
