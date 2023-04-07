import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_3 {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,3,2,1));
        System.out.println(deque);
        String pol = "Полидром";
        for (int i = 0; i < deque.size(); i++){
            int fist = deque.pollFirst();
            int last = deque.pollLast();
            if (fist != last){
                pol = "Не полидром";
                break;
            }
        }
        System.out.println(pol);
    }
    public boolean checkOn(Deque<Integer> deque){
        return false;
    }
}
