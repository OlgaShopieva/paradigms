package hw2;
/*
Условие
На вход подается число n.
● Задача
Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
Обоснуйте выбор парадигм.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.multiplicateNumbers(9);

    }

    public void multiplicateNumbers(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("1 " + "* " + i + " = " + i);
        }
    }
}
/*
Выбор парадигмы для данной задачи на языке Java может быть обоснован
использованием объектно-ориентированной парадигмы.
Объектно-ориентированная парадигма позволяет структурировать код с использованием классов и объектов.
В данной задаче можно представить таблицу умножения как отдельный класс, который будет иметь методы
для получения и вывода таблицы.
 */
