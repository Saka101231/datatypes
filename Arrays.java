// package datatypes;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        double[] monies = new double[5];
        String[] names = new String[]{"Shola","saka","Jide","Boyo","Jimoh"};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * (i + 1);
        }

        // A simple Betting platform with 10m Jackpot
        // low risk gets < 1000, high risk < 10m
        for (int x = 0; x < monies.length; x++) {
            // random, pow
            monies[x] = Math.random() * Math.pow(10, (x + 3));
        }
        print(numbers);
        System.out.println("\nJackpot winners by Level:");
        print(monies);
        print(names);
    }

    private static void print(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println("]");
    }

    private static void print(String[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println("]");
    }

    private static void print(double[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + Math.floor(numbers[i]));
        }
        System.out.println("]");
    }
}
