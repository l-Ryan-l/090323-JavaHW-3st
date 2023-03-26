import java.util.ArrayList;

// Task 3:
// Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
public class Task3_FillMixedAndDelInts {
    public static void main(String[] args) {
        ArrayList<String> mixedList = new ArrayList<>();
        mixedList.add("5");
        mixedList.add("task");
        mixedList.add("task1");
        mixedList.add("4");
        mixedList.add("6");
        mixedList.add("10");
        mixedList.add("watermelon");
        mixedList.add("1");
        mixedList.add("java");
        mixedList.add("jdk");
        mixedList.add("110");
        mixedList.add("ghj10");

        System.out.println("The origin array is: " + mixedList);

        for (int i = 0; i < mixedList.size(); i++) {
            try {
                int res = Integer.parseInt(mixedList.get(i));
                mixedList.remove(i);
                i = 0;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println("The final array is: " + mixedList);
    }
}
