public class NumberFun {
    public static long findNextSquare(long sq) {
        long lsqrt = Double.valueOf(Math.sqrt(sq)).longValue();
        if (Double.valueOf(Math.pow(lsqrt, 2)).longValue() == sq){
            return Double.valueOf(Math.pow(lsqrt + 1, 2)).longValue();
        }
        return -1;
    }
}
