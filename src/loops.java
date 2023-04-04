import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("ENter the last number : ");
        num = input.nextInt();

        for (int i = 1, j = 1; i <= num && j <= num; i *= 4, j *= 5) {
            System.out.println(i + "  " + j);
        }
    }
}
