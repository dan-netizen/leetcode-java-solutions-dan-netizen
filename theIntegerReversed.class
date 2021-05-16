/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

class theIntegerReversed {
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        if ((x == Integer.MAX_VALUE) || (x == Integer.MIN_VALUE)) {
            return 0;
        }
        int r = 0;
        boolean isNeg = (x < 0);
        if (isNeg) {
            x = Math.abs(x);
        }
        int i = 0; int j = 0;
        boolean isBig = (x > 999999999);
        while (x > 0) {
            if (isBig) {
                j = ((Integer.MAX_VALUE / (int)(Math.pow(10, (9-i)))) % 10);
                if ((x % 10) > j) {
                    return 0;
                }
                if ((x % 10) < j) {
                    isBig = false;
                }
            }
            r = r*10 + x % 10;
            x = x / 10;
            i++;
        }
        if (isNeg) {
            r = r * (-1);
        }
        return r;
    }
}