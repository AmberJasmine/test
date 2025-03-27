package org.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();

//        double[] a = {1.356, 2.15, 36, 49, 5};
//        double[] b = {5, 445.3214, 398, 2, 1};
//
//        double variance = variance(a);
//        System.out.println("variance = " + variance);
//        double standardDeviation = standardDeviation(a);
//        System.out.println("standardDeviation = " + standardDeviation);
//
//        double yb = ybStandardDeviation(a);
//        System.out.println("yb = " + yb);
//        double zt = ztStandardDeviation(a);
//        System.out.println("zt = " + zt);

    }

    // 计算方差
    public static double variance(double[] array) {
        double mean = 0.0;
        for (double num : array) {
            mean += num;
        }
        mean /= array.length;

        double variance = 0.0;
        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }
        variance /= array.length;
        return variance;
    }

    // 计算标准差
    public static double standardDeviation(double[] array) {
        return Math.sqrt(variance(array));
    }

    /**
     * 【计算样本标准偏差】
     *
     * @param array 入参
     * @return double
     */
    public static double ybStandardDeviation(double[] array) {
        double rval = 0;
        double avg = avg(array);//平均数
        for (double v : array) {
            rval += Math.pow((v - avg), 2);
        }
        rval /= array.length - 1;
        rval = Math.sqrt(rval);
        return rval;
    }

    /**
     * 计算平均数
     *
     * @param array 入参
     * @return double
     */
    public static double avg(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum / array.length;
    }

    /**
     * 【计算总体标准偏差】
     *
     * @param data data
     * @return double
     */
    public static double ztStandardDeviation(double[] data) {
        double sum = 0.0;
        double mean;
        double sumOfSquares = 0.0;
        for (double num : data) {
            sum += num;
        }
        mean = sum / data.length;
        for (double num : data) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquares / data.length);
    }

}