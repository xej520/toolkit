package com.xingej.toolkit.array;

import java.util.concurrent.atomic.AtomicInteger;

//从数组里依次取出每一个元素，形成一个环形数组
public class SelectElem {
    private final AtomicInteger idx = new AtomicInteger(0);
    private final String[] elems;

    SelectElem(String[] elems) {
        this.elems = elems;
    }

    // 均衡的从数组里取出每一个元素
    // 方式一
    public String nextA(){
        return elems[Math.abs(idx.getAndIncrement() % elems.length)];
    }

    // 方式二 位运算
    public String nextB() {
        return elems[idx.getAndIncrement() & elems.length - 1];
    }

    //测试
    public static void main(String[] args) {
        String[] elems = {"spark", "hive", "hadoop","lgy"};
        SelectElem selectElem = new SelectElem(elems);
        for (int i = 0; i < 10; i++){
            System.out.println("---->:\t" + selectElem.nextB());
        }
    }
}
