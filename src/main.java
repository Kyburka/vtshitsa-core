import java.util.Random;
class Main {
    private static double calcul(long wi, double xj)
    {
        if (wi==14)
        {
            return (Math.cbrt(Math.atan((xj + 2) / 8)) - (1.0 / 3.0)) / (Math.pow(Math.E, Math.tan(xj)));
        }
        else if (wi==6 || wi==12 || wi==16)
        {
            return Math.pow(((1.0/3.0)/Math.tan(Math.pow(2*xj,xj))), 2.0);
        }
        else
        {
            return Math.atan(1/Math.pow(Math.E, Math.abs(Math.tan(Math.pow(Math.sin(xj), (4*Math.cos(xj)))))));
        }
    }
    public static void main(String[] args) {
        long w[];
        w = new long[(16-4)/2+1];
        int c=0;
        for (int i = 16; i >= 4; i-=2)
        {
            w[c]=i;
            c++;
        }
        double x[];
        x = new double[10];
        Random random;
        random = new Random();
        for (int i = 0; i < x.length; i++)
        {
            x[i]= 8*random.nextDouble()-2;
        }
        double[][] b;
        b = new double[7][10];
        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j < b[i].length; j++)
            {
                b[i][j] = calcul(w[i], x[j]);
                System.out.printf("%.4f\t", b[i][j]);
            }
            System.out.println("\n");
        }
    }
}