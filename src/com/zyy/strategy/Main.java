package com.zyy.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] a = {9, 2, 5, 7, 1, 4};
        Cat[] a = {new Cat(1,1),new Cat(5,5),new Cat(3,3)};
        Sorter<Cat> sorter = new Sorter();
        sorter.sort(a,new CatWeigthComparator());
        System.out.println(Arrays.toString(a));
    }
}
