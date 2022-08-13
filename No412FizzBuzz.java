import java.util.ArrayList;
import java.util.List;

public class No412FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz(3).toString());
        System.out.println(FizzBuzz(5).toString());
        System.out.println(FizzBuzz(15).toString());
        
    }

    public static List<String> FizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                answer.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                answer.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                answer.add("Buzz");;
            } else {
                answer.add(String.valueOf(i+1));
            }
        }
        return answer;
    }
}