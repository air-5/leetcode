package questions_one_to_one_hundred._7;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        int ans = new ReverseInteger().reverse(x);
        System.out.println(ans);
    }

    private int reverse(int x) {
        if (x == 0) {
            return x;
        }
        boolean neg = x < 0;

        String s = String.valueOf(x);
        s = neg ? s.substring(1) : s;
        s = new StringBuilder(s).reverse().toString();
        int res = 0;

        try {
            res = Integer.parseInt(s);
        } catch (Exception e) {
            return res;
        }
        return neg ? -res : res;

    }
}
