package hw1;

public class ImperativeParadigm {
    public static void sortNumbers(int[] numbers) {
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

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        sortNumbers(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
