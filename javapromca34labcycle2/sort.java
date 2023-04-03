import java.util.Arrays;
import java.util.Scanner;

public class sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of members:");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            names[i] = sc.next();
        }

        System.out.println("Names before sorting: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("Names after sorting: " + Arrays.toString(names));
    }
}

