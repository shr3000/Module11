package Task1;

/*
Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...", с именами из списка, стоящими под
нечетным индексом (1, 3 и т.д.).
 */


import java.util.List;

public class StringConcat {
    public String concat(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < strings.size(); i =i+2 ) {
            stringBuilder.append("" + i + ". ");
            stringBuilder.append(strings.get(i) + ", ");
        }
        return stringBuilder.toString().substring(0, stringBuilder.length()-2);
    }

}
