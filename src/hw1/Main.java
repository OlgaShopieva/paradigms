package hw1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задача1
        ImperativeParadigm imperativeParadigm = new ImperativeParadigm();
        int[] numbers = {5, 2, 8, 1, 9};
        imperativeParadigm.sortNumbers(numbers);
        imperativeParadigm.printSortedNumbers(numbers);

        //Задача2
//        DeclarativeParadigm declarativeParadigm = new DeclarativeParadigm();
//        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
//        declarativeParadigm.sortNumbers(numbers);
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
    }
}
