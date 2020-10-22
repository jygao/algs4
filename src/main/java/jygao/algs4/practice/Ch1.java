package jygao.algs4.practice;


import com.sun.scenario.effect.impl.prism.PrFilterContext;
import edu.princeton.cs.algs4.StdOut;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Ch1 {
    private Ch1() {

    }

    public static void main(String[] args) {
//        int[] resultIndexs = {};
//        ArrayList hisF = new ArrayList(Arrays.asList(resultIndexs));
//        for (int i = 0; i < 100; i++) {
//            if (i == 0 || i == 1) {
//                hisF.add(i, F(i));
//                System.out.println(F(i));
//            } else {
//                long next = (long) hisF.get(i - 2) + (long) hisF.get(i - 1);
//                hisF.add(i, next);
//                System.out.println(next);
//            }
//        }
//        Date startTime = new Date();
//        System.out.println(F(50));
//        long needTime = new Date().getTime() - startTime.getTime();
//        System.out.println(needTime + "ms");
//
//        startTime = new Date();
//        System.out.println(fastF(50));
//        needTime = new Date().getTime() - startTime.getTime();
//        System.out.println(needTime + "ms");

//        System.out.println(mystery2(3, 4));

//        System.out.println(exR1(6));

//        int[] a = {1, 4, 3, 4, 3, 2, 9, 2};
//        printArray(histogram(a, 12));

//        for (int i = 0; i < Integer.MAX_VALUE/10000; i++) {
//            if (lg2(i) != getLog(i)) {
//            System.out.println("num=" + i + ":lg2(num)=" + lg2(i) + " getLog(num)=" + getLog(i));
//            }
//        }

//        int row = 4;
//        int col = 2;
//        int[][] matrix = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                matrix[i][j] = 2 * i + 1;
//            }
//        }
//        printMatrixTranspose(row, col, matrix);

//        arrayTest();

//        simpleTest();

//        for (int i = 1; i < 256423585; i++) {
//            String str0 = toBinaryStringSimple(i);
//            String str1 = toBinaryString(i);
//            if (!str0.equals(str1)) {
//                System.out.println(str0 + " " + str1);
//            }
//        }

//        IntegerAndInt();

//        System.out.println(ln(10));
//        double reslutLn = 0;
//        for (int i = 1; i <= 10; i++) {
//            reslutLn += Math.log(i);
//        }
//        System.out.println(reslutLn);
//
//        char ch = '1';
//        String sch = "11";
//        System.out.println(ch + " " + sch.length());

    }

    private static Boolean isCircular(String s,String t){
        int slen = s.length();
        int tlen = t.length();
        if(slen!=tlen){
            return false;
        }else{
            for (int i = 0; i < slen; i++) {
                char firstChar = s.charAt(i);
                int sameCharBeginIndex = t.indexOf(firstChar);
//                if(sameCharBeginIndex==)
            }
        }
    }

    /**
     * 递归实现ln(N!)
     *
     * @param N
     */
    private static double ln(int N) {
        if (N == 1) {
            return 0;
        } else {
            return ln(N - 1) + Math.log(N);
        }
    }

    private static void IntegerAndInt() {
        Integer a = 1;
        Integer b = 128;
        Integer c = 128;
        int i = 1;
        int j = 128;
        System.out.println(a == i);//true
        System.out.println(b == j);//true
        System.out.println(b == c);//false
        System.out.println(b.equals(c));//true
    }

    private static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    private static long fastF(int N) {
        long[] results = new long[N + 1];
        results[0] = 0;
        results[1] = 1;
        for (int i = 2; i <= N; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[N];
    }

    private static int mystery(int a, int b) { //乘法
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }

    private static int mystery2(int a, int b) { //a^b
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery(a * a, b / 2);
        }
        return mystery(a * a, b / 2) * a;
    }

    private static String exR1(int n) {
        if (n <= 0) {
            return "";
        } else {
            return exR1(n - 3) + exR1(n - 2) + n;
        }
    }

    private static int[] histogram(int[] a, int M) {
        int[] resultArr = new int[M];
        for (int i = 0; i < M; i++) {
            resultArr[i] = 0;
        }
        for (int j = 0; j < a.length; j++) {
            resultArr[a[j]]++;
        }
        return resultArr;
    }

    /**
     * 求2位底数的num的对数
     *
     * @param num
     * @return
     */
    private static int lg2(int num) {
        if (num == 0) {
            return Integer.MIN_VALUE;
        } else {
            int result = 0;
            for (int i = num; i != 0; i = i / 2) {
                result++;
            }
            return result - 1;
        }
    }

    private static void printMatrixTranspose(int row, int col, int[][] matrix) {
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void arrayTest() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void simpleTest() {
        int num = (0 + 15) / 2;
        System.out.println(num);

        double fnum = 2.0e-6 * 100000000.1;
        System.out.println(fnum); //200.0000002  why

        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);

        System.out.println(1 + 2 + "3");

        //sqr
        double a = 2.0;
        double t = 9.0;
        while (Math.abs(t - a / t) > .001) {
            t = (a / t + t) / 2;
        }
        //切线模拟曲线:f(Xn+1) = f(Xn) + f'(Xn)(X-Xn) = 0
        //=> Xn+1 = Xn - f(Xn)/f'(Xn)
        //=> 对于X^2 - a = 0,初始X0,f(X0)=X0^2 -a ,f'(X0) = 2X0
        //=> X1 = X0 - (X0^2 -a)/(2X0) = (X0+a/X0)/2
        StdOut.printf("%.5f\n", t);


        System.out.println((char) ('a' + 4));

    }

    private static String toBinaryString(int num) {
        int logNumInt = getLog(num);
        int[] resultIndexs = {};
        ArrayList arrayList = new ArrayList(Arrays.asList(resultIndexs));
        setBinaryOneIndexs(num, arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i = logNumInt; i >= 0; i--) {
            if (arrayList.indexOf(i) != -1) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    private static String toBinaryStringSimple(int num) {
        String s = "";
        for (int n = num; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    private static int getLog(int num) {
        double logNum = Math.log10(num) / Math.log10(2 * 1.0);
        return (int) logNum;
    }

    private static void setBinaryOneIndexs(int num, ArrayList resultIndexs) {
        if (num == 0) {
            return;
        }
        int logNumInt = getLog(num);
        int restNum = num - (int) Math.pow(2, logNumInt);
        resultIndexs.add(logNumInt);
        setBinaryOneIndexs(restNum, resultIndexs);
    }


}
