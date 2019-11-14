package gois.study.myjava8.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class GenericsBaeldung {

    public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
        return Arrays.stream(a)
                    .map(mapperFunction)
                    .collect(toList());
    }
}
