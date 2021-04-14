package org.ptkl.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        // flatMap 取出所有字符
        /*String[][] words = {{"Hello", "World"},{"Java"}};
        List<Character> collect1 = Arrays.stream(words)
                .flatMap(Arrays::stream)
                .flatMap(word->word.chars().mapToObj(x->(char)x))
                .distinct()
                .collect(Collectors.toList());
        collect1.forEach(System.out::print);    //HeloWrdJav*/

        // flatMap 两个数组合并成二维数组 [1,2],[3,4] --> [[1,3],[1,4],[2,3],[2,4]]
        int[] arr1 = {0, 1, 2};
        int[] arr2 = {3, 4};
        List<Integer[]> collect = Arrays.stream(arr1)
                .boxed()
                .flatMap(x -> Arrays.stream(arr2)
                        .boxed()
                        .map(y -> new Integer[]{x, y}))
                .collect(Collectors.toList());
        int[][] arr = Arrays.stream(arr1)
                .mapToObj(x -> Arrays.stream(arr2)
                        .mapToObj(y -> new int[]{x, y})
                        .toArray(int[][]::new)
                ).flatMap(Arrays::stream)
                .toArray(int[][]::new);
    }
}
