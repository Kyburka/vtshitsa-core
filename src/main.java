import java.util.*;


class Main {
    public static void main(String[] args) {
        long[] w = {4, 6, 8, 10, 12, 14, 16};

        System.out.println("even: " + Arrays.toString(w));


        double[] x = new double[10];

        int min = -2;
        int max = 6;

        for (int i = 0; i < x.length; i++)
            x[i] = Math.random() * (max - min) + min;

        System.out.println("random: " + Arrays.toString(x));
    }
}
