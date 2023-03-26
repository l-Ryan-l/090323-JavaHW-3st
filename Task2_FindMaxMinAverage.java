import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Task 2:
// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2_FindMaxMinAverage {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            listOfNumbers.add(random.nextInt(100));
        }

        System.out.println("Origin list is: " + listOfNumbers);
        System.out.println("The Max is: " + Collections.max(listOfNumbers));
        System.out.println("The Min is: " + Collections.min(listOfNumbers));

        int sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            sum += listOfNumbers.get(i);
        }
        int avg = sum/listOfNumbers.size();

        System.out.println("The Arithmetical mean is: " + avg);

    }
}
