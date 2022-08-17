import java.util.Arrays;

public class LeetTest {
    public static void main(String[] args) {
        int x = 2147395600;
        int n = 46338;
        while (n * n <= x) {
            n++; 
        }
        System.out.println(n);
    }
}
