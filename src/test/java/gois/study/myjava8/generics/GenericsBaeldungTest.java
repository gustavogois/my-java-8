package gois.study.myjava8.generics;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericsBaeldungTest {

    @Test
    public void fromArrayToList() {
        Integer[] a = {1, 2, 3, 4, 5};

        List<String> result = GenericsBaeldung.fromArrayToList(a, Object::toString);

        assertThat(result).contains("1", "2", "3", "4", "5");
    }


}