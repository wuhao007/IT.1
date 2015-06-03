public class PreyPredLV {
    public static double[] preyPredLV(double[] preyPred, double[] a, double[] b, int n) {
        double[] r = preyPred.clone();//clone from original data
        for (int i = 0; i < n; i++) {
            double h = r[0];
            double l = r[1];
            r[0] = h * (1 + a[0] - a[1] * l); //calculate
            r[1] = l * (1 - b[0] + b[1] * h);
        }
        return r;
    }
    public static void main(String[] args) {
        double[] preyPred = new double[]{300, 20};
        double[] a = new double[]{0.1, 0.01};
        double[] b = new double[]{0.01, 0.00002};
        double[] r = preyPredLV(preyPred, a, b, 20);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}
