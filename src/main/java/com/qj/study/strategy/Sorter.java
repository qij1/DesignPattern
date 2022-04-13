package com.qj.study.strategy;

public class Sorter<T> {

//    public void sort(Comparable[] a) {
//        for(int i = 0; i < a.length - 1; i++) {
//            int minPos = i;
//            for(int j = i + 1; j < a.length; j++) {
//                minPos = a[j].compareTo(a[minPos]) == -1 ? j : minPos;
//            }
//            swap(a, i, minPos);
//        }
//    }

//    static void swap(Comparable[] arr, int i, int j) {
//        Comparable temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }


    public void sort(T[] arr, Comparator<T> comparator) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }
    void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
