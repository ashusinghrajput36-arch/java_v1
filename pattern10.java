public class pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            // Print leading spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            // First and last row: solid stars
            if (row == 1 || row == n) {
                for (int col = 1; col <= 2 * row - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                // Print first star
                System.out.print("* ");
                // Print spaces in between
                for (int col = 1; col <= 2 * row - 3; col++) {
                    System.out.print("  ");
                }
                // Print last star
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
