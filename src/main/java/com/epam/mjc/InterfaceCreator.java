package com.epam.mjc;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {
    @FunctionalInterface
    public interface Operation<T> {
        List<T> apply(List<T> arg);
    }

    public Operation<Integer> divideBy(Integer divider) {
        return list ->
                list.stream().map(element ->
                        Integer.divideUnsigned(element, divider)).collect(Collectors.toList());
    }


}
