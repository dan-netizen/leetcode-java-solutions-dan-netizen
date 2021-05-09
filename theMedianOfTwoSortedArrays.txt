/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
*/

class theMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0) {
            if ((n & 1) == 0) {
                return ((double) nums2[n/2] + nums2[n/2-1]) / 2;
            } else {
                return (double) nums2[n/2];
            }
        }
        if (n == 0) {
            if ((m & 1) == 0) {
                return ((double) nums1[m/2] + nums1[m/2-1]) / 2;
            } else {
                return (double) nums1[m/2];
            }
        }
        if ((nums1[m-1] == 0) && (nums2[n-1] == 0)) {
            return (double) 0;
        }
        int i = -1;
        int j = -1;
        int sum = m + n;
        boolean odd = ((sum & 1) != 0);
        for (int k = 0; k < (sum / 2) + 1; k++) {
            if (i == m-1) {
                j++; continue;
            }
            if (j == n-1) {
                i++; continue;
            }
            if (nums1[i+1] < nums2[j+1]) {
                i++;
            } else {
                j++;
            }
        }
        if (j < 0) {
            if (odd) {
                return (double) nums1[i];
            } else {
                return ((double) nums1[i] + nums1[i-1]) / 2;
            }
        }
        if (i < 0) {
            if (odd) {
                return (double) nums2[j];
            } else {
                return ((double) nums2[j] + nums2[j-1]) / 2;
            }
        }
        if (odd) {
            if (nums1[i] > nums2[j]) {
                return (double) nums1[i];
            } else {
                return (double) nums2[j];
            }
        } else {
            m = nums1[i];
            n = nums2[j];
            if (m == n) {
                return (double) m;
            }
            if (m > n) {
                if (i > 0) {
                    if (n < nums1[i-1]) {
                        return ((double) m + nums1[i-1]) / 2;
                    }
                }
                return ((double) m + n) / 2;
            }
            if (j > 0) {
                if (m < nums2[j-1]) {
                    return ((double) n + nums2[j-1]) / 2;
                }
            }
            return ((double) m + n) / 2;
        }
    }
}