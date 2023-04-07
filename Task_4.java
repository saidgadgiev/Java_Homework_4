import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


public class Task_4 {
    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        Deque result = new Task_4().sum(d1, d2);
        System.out.println(result);


        // result [6,6,0,1]

    }
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0; // переменная для хранения "единицы переноса"

        while (!d1.isEmpty() || !d2.isEmpty() || carry != 0) { // пока есть цифры или "единица переноса"
            int digit1 = d1.isEmpty() ? 0 : d1.removeFirst(); // если закончилось число, считаем нулем
            int digit2 = d2.isEmpty() ? 0 : d2.removeFirst(); // если закончилось число, считаем нулем

            int sum = digit1 + digit2 + carry;
            carry = sum / 10; // если сумма >= 10, берем единицу переноса
            result.addLast(sum % 10); // добавляем в результат только один знак
        }

        return result;
    }
}
