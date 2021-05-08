public class L7_ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            //check whether int is overflow
            int newRes = res * 10 + tail;
            if((newRes - tail) / 10 != res) {
                return 0;
            }
            x /= 10;
            res = newRes;
        }
        return res;
    }
}
