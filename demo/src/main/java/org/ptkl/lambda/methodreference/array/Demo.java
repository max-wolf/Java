package org.ptkl.lambda.methodreference.array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) throws IOException {
        Function<Integer,String[]> fun1 = x -> new String[x];
        Function<Integer,String[]> fun2 = String[]::new;

        /*original*/
//        Path[] paths = Files.list(Paths.get("")).toArray(new IntFunction<Path[]>() {
//            @Override
//            public Path[] apply(int i) {
//                return new Path[i];
//            }
//        });

        /*lambda*/
//        Path[] paths = Files.list(Paths.get("")).toArray(i -> new Path[i]);

        /*method reference*/
        Path[] paths = Files.list(Paths.get("")).toArray(Path[]::new);
//        List<Path> pathList = Arrays.asList(paths);
        List<Path> pathList = Files.list(Paths.get("")).collect(Collectors.toList());
        pathList.forEach(x -> System.out.println(x.toAbsolutePath()));

    }
}
