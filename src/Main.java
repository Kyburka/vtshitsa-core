import java.util.Random;

class Main {
    static final int W_LENGTH = 7;
    static final int X_LENGTH = 10;
    static final int MAX_RANDOM = 8;
    static final int MIN_RANDOM = -2;
    static final int B_ROWS = 7;
    static final int B_COLS = 10;
    public static void main(String[] args) {
        long w[] = new long[W_LENGTH];
        int counter = 0;
        for (int i = 16; i >= 4; i -= 2) {
            w[counter] = i;
            counter++;
        }
        double x[] = new double[X_LENGTH];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = MAX_RANDOM * random.nextDouble() + MIN_RANDOM; // random.nextDouble() - от 0.0 до 1.0. Умножая на 8, становится от 0.0 до 8.0. Отнимая два, становится от -2.0 до 6.0.
        }
        double[][] b = new double[B_ROWS][B_COLS];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = calculateMatrix(w[i], x[j]);
            }
        }
        printMatrix(b);
    }

    private static double calculateMatrix(long wi, double xj) {
        if (wi == 14) {
            return (Math.cbrt(Math.atan((xj + 2) / 8)) - (1.0 / 3.0)) / (Math.pow(Math.E, Math.tan(xj)));
        }
        else if (wi == 6 || wi == 12 || wi == 16) {
            return Math.pow(((1.0 / 3.0) / Math.tan(Math.pow(2 * xj, xj))), 2.0);
        }
        else {
            return Math.atan(1 / Math.pow(Math.E, Math.abs(Math.tan(Math.pow(Math.sin(xj), (4 * Math.cos(xj)))))));
        }
    }

    private static void printMatrix(double[][] mtx) {
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.printf("%10.4f", mtx[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
