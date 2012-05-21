package kerroinkone;

import java.text.DecimalFormat;

public class Pyoristys {

    private double luku;

    public Pyoristys() {
    }

    public static double pyoristaDesimaaleiksi(double d, int c) {
        int temp = (int) ((d * Math.pow(10, c)));
        return (((double) temp) / Math.pow(10, c));
    }

}
