import java.util.Arrays;
import java.util.Scanner;
public class sortchr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string " );
        String inputString = sc.next();
        char[] chars = inputString.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        System.out.println("Original string: " + inputString);
        System.out.println("Sorted string: " + sortedString);
    }
}
