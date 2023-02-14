package Task5;

/*
Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) который "перемешивает" элементы из
стримов first и second, останавливается тогда, когда у одного из стримов закончатся элементы.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> result = new ArrayList<>();
        List<T> listOne = first.collect(Collectors.toList());
        List<T> listTwo = second.collect(Collectors.toList());

        long minSize = Math.min(listOne.size(), listTwo.size());

        for (int i = 0; i < minSize; i++){
            result.add(listOne.get(i));
            result.add(listTwo.get(i));
        }

        return result.stream();
    }
}
