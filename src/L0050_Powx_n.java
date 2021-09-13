public class L0050_Powx_n {
    public double myPow(double x, int n) {
        boolean isNegative = false;
        if(n < 0){
            x = 1/ x;
            isNegative = true;
            // prevent overflow
            n = -(n + 1);
        }

        double res = 1;
        double temp = x;

        while(n != 0){
            if(n % 2 == 1) {
                res *= temp;
            }
            temp *= temp;
            n /= 2;
        }
        if(isNegative){
            res *= x;
        }
        return res;
    }
}
