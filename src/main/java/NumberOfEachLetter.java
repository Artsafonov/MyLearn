import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfEachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter some text without upper case :-) ");
        String userString = input.nextLine();

        Map<Character, Integer> charMap = new HashMap<>();

        for (Character c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
            charMap.put(c, 0);
        }
        for (Character c : userString.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("YOU WIN! Congratulations!!!!");
    }
}