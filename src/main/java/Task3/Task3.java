package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Дан массив:

["1, 2, 0", "4, 5"]

Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть

"0, 1, 2, 4, 5"
 */
public class Task3 {
    public String cleaningSorting(String[] strings) {
        List<String> list = new ArrayList<>();
        for (String string : strings) {
            String[] str = string.split(" ");
            list.addAll(Arrays.asList(cleaner(str)));
        }
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : list) {
            stringBuilder.append(s + ", ");
        }

        return stringBuilder.toString().substring(0, stringBuilder.length() - 2);
    }

    private String[] cleaner(String[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("/D", "");
            str[i] = str[i].replaceAll(",", "");
        }
        return str;
    }

}
