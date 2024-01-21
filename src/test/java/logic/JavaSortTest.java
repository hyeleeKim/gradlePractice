package logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void test() {
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> actual = javaSort.sort(List.of(3,1,4,5,2));


        //Then
        assertEquals(List.of(1,2,3,4,5),actual);
    }
}