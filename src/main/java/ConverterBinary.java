import java.util.Scanner;

public class ConverterBinary {
    public static String toBinary(int x){
int b;
String binary = "";
while (x>0){
    b=x%2;
    binary=b+binary;
   x/=2;
}
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number for convert to binary");
        int x = sc.nextInt();
        System.out.println(ConverterBinary.toBinary(x));

    }
}
