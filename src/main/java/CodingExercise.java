public class CodingExercise {

    public static void main(final String[] args) {

        Integer[] numbers = new Integer[]{1, 2, 5, -1, 6, -1, 2, -1, 5, -1, -10};
        int count = 0;

        for (int x : numbers) {
            if (x == 2) {
                count++;
            } else if (x == -1) {
                count++;
            }

        }
        System.out.println(count);
    }
}