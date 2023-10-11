package hw1;
/*
Задача №1
Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.

 */
    public class ImperativeParadigm {

    public void sortNumbers(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key > numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }
    public void printSortedNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
