import java.util.ArrayList;
import java.util.Random;

// Task 1:
// Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого).
public class Task1_FillRandomAndDelEven {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            someList.add(random.nextInt(100));
        }

        System.out.println("The origin list is: " + someList);

        someList.removeIf(integer -> (integer % 2 == 0));
        System.out.println("The final list is: " + someList);

    }
}
