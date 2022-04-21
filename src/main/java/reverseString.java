import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text ");
       String text = sc.nextLine();
       char[] arr = text.toCharArray();

       String result = "";
       for(char i:arr){ //forEach loop
           result = i + result;
       }
        System.out.println(result + " " + result.length() + " letter(s)");
    }
}
