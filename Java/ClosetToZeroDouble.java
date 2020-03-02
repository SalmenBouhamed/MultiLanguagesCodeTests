import java.math.*;

class Solution {

    static double closestToZero(double[] ts) {
        if (ts.length == 0)
            return 0;

        double closestToZero = ts[0];
        double absClosest = Math.abs(closestToZero);

        for (int i = 0; i < ts.length; i++) {
            double absValue = Math.abs(ts[i]);

            if (absValue < absClosest || absValue == absClosest && ts[i] > 0) {
                closestToZero = ts[i];
                absClosest = absValue;
            }
        }

        return closestToZero;
    }
}