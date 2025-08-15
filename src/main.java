import java.util.Random;
class Main {
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
                if (w[i]==14)
                {
                    b[i][j] = (Math.cbrt(Math.atan((x[j] + 2) / 8)) - (1.0 / 3.0)) / (Math.pow(Math.E, Math.tan(x[j])));
                }
                else if (w[i]==6 || w[i]==12 || w[i]==16)
                {
                    b[i][j]=Math.pow(((1.0/3.0)/Math.tan(Math.pow(2*x[j],x[j]))), 2.0);
                }
                else
                {
                    b[i][j]=Math.atan(1/Math.pow(Math.E, Math.abs(Math.tan(Math.pow(Math.sin(x[j]), (4*Math.cos(x[j])))))));
                }
                System.out.printf("%.4f\t", b[i][j]);
            }
            System.out.println("\n");
        }
    }
}