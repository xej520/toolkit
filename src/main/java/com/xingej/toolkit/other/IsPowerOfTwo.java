package com.xingej.toolkit.other;

/**
 * 判断一个整数是2的幂次方
 * 如8是
 */
//来源是
//netty 源码中，
// 需要选择从线程池中，选择线程时，借鉴的
//DefaultEventExecutorChooserFactory.java
public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int val) {
        return (val & (-val)) == val;
    }

    public static void main(String[] args) {
        System.out.println("-----是否是2的幂次方：\t" + IsPowerOfTwo.isPowerOfTwo(8)); //true
        System.out.println("-----是否是2的幂次方：\t" + IsPowerOfTwo.isPowerOfTwo(7)); //false
    }
}
