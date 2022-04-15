package com.qj.study.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] a = {9, 4, 3, 5, 8, 1, 4};
        Cat[] a = {new Cat(3, 3), new Cat(1, 1), new Cat(5, 5)};
        Dog[] b = {new Dog(2), new Dog(3), new Dog(1)};

        // Comparable
//        Sorter sorter = new Sorter();
//        sorter.sort(a);
//        sorter.sort(b);

        // Comparator
        Sorter<Dog> sorter = new Sorter();
        sorter.sort(b, new DogComparator());
        Sorter<Cat> catSorter = new Sorter<>();
//        catSorter.sort(a, new CatWeightComparator());
        // 也可以使用函数式接口（只有一个方法的接口）
        catSorter.sort(a, (o1, o2) -> {
          if(o1.weight < o2.weight) return -1;
          else if(o1.weight > o2.weight) return 1;
          return  0;
        });

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
