public class AmericanFlag {
    public static void main(String[] args) {
        int rows = 13;
        int columns = 48;

        // Print top part of the flag
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print bottom part of the flag
        for (int i = 0; i < rows / 2; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
