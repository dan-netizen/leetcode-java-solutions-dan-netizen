/*
Given an array of integers target. From a starting array, A consisting of all 1's, you may perform the following procedure :

let x be the sum of all elements currently in your array.
choose index i, such that 0 <= i < target.size and set the value of A at index i to x.
You may repeat this procedure as many times as needed.
Return True if it is possible to construct the target array from A otherwise return False.
*/

class theTargetArrayWithMultipleSums {
    public boolean isPossible(int[] target) {
        if (target.length == 1) {
            if (target[0] == 1) {
                return true;
            } else { return false;}
        }
        boolean ok = true;
        int sum,max,i;
        do {
            sum = 0;
            max = 0;
            i = 0;
            for (int k = 0; k < target.length; k++) {
                if (target[k] > max) {
                    sum += max;
                    max = target[k];
                    i = k;
                } else {
                    sum += target[k];
                }   
            }
            if (max - sum < 1) {
                return false;
            } else {
                if ((max - sum) > sum) {
                    if (max % sum == 0) {
                        target[i] = max - (sum * ((max/sum)-1));
                    } else {
                        target[i] = max - (sum * (max / sum));
                    }
                } else {
                    target[i] = max - sum;
                }
            }
            if (sum + target[i] == target.length) {
                ok = false;
            }
        } while (ok);
        return true;
    }
}