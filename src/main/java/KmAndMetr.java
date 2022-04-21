import java.util.Scanner;

public class KmAndMetr {
    public static void main(String[] args) {
        System.out.println("введите пройденный путь");
        Scanner read = new Scanner(System.in);
        int distance = read.nextInt();
        int result = distance/1000;
        int result1 = distance%1000;

        System.out.println( result + " - км," + "  " + result1 + " - метров");
    }
}
