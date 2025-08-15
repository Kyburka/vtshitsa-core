import java.util.*;


class Main {
    public static void main(String[] args) {
        long[] w = {4, 6, 8, 10, 12, 14, 16};

        // System.out.println("even: " + Arrays.toString(w));


        double[] x = new double[10];

        int min = -2;
        int max = 6;

        for (int i = 0; i < x.length; i++)
            x[i] = Math.random() * (max - min) + min;

        // System.out.println("random: " + Arrays.toString(x));


        double[][] b = new double[7][10];

        // тут иногда возникают корни из отрицательных чисел, тогда java возвращает NaN
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                if (w[i] == 14) {
                    b[i][j] = (Math.pow(Math.atan(((double)x[i] + 2) / 8), 1./3) - 1./3) / Math.exp(Math.tan(x[i]));
                } else if (w[i] == 6 || w[i] == 12 || w[i] == 16) {
                    b[i][j] = Math.pow(1/3/Math.tan(Math.pow(2 * x[i], x[i])), 2);
                } else {
                    b[i][j] = Math.atan(1 / Math.exp(Math.abs(Math.tan(Math.pow(Math.sin(x[i]), 4 * Math.cos(x[i]))))));
                }
            }
        }


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%.4f ", b[i][j]);
            }

            System.out.print("\n");
        }
    }
}
