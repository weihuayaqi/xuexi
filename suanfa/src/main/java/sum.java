import java.util.*;

/**
 * Created by weihua on 2017/12/8.
 */

/**
 * 1、给一个整数数组，找到两个数使得他们的和等于一个给定的数target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是1到n，不是以0开头。
 */
public class sum {
    static List<String> sum2(int[] arr, int length, int targer) {
        java.util.List<String> brr = new ArrayList<String>();
        int i, j;
        for (i = 0, j = length - 1; i < j; ) {
            if (arr[i] + arr[j] == targer) {
                brr.add(arr[i] + "," + arr[j]);
                i++;
                j--;
            } else if (arr[i] + arr[j] < targer) {
                i++;
            } else {
                j--;
            }
        }

        return brr;
    }


    /**
     * 给出一个有n个整数的数组S，在S中找到三个整数a, b, c，找到所有使得a + b + c = 0的三元组。*
     */

    static int zheBan(int[] crr, int left, int right, int tager) {
        while (left <= right) {
            int k = (left + right) / 2;
            if (crr[k] == tager) {
                return k;
            } else if (crr[k] < tager) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return -1;
    }

    static ArrayList<String> sum3(int[] crr, int tager) {
        int length = crr.length;
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < length-2; i++) {
            for (int j = i + 1; j < length-1; j++) {
                int tem = tager - crr[i] - crr[j];
                int r = zheBan(crr, j + 1, length - 1, tem);
                if (r != -1) {
                    result.add(crr[i] + "," + crr[j] + "," + tem);
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int targer = 10;
        int sum = 0;
        int[] arr = new int[]{1, 2, 4, 6, 7, 8, 9, 11, 12};
        int[] crr = new int[]{-1, 0, 1, 2, -1, -4, 3};
//        List<String> reslutlist=sum2(arr,arr.length,targer);
//        for(String a:reslutlist){
//            System.out.println(a);
//        }
        List<String> reslut = sum3(crr, sum);
        for (String p : reslut) {
            System.out.println(p);
        }
    }
}
