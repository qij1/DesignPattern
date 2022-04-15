package com.qj.study.strategy;

// 指定是函数式接口
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}
