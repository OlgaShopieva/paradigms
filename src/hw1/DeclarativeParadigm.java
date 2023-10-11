package hw1;
/*
Задача №2
Написать точно такую же процедуру, но в декларативном стиле
 */
import java.util.Collections;
import java.util.List;

public class DeclarativeParadigm {
    public void sortNumbers(List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
    }
}
