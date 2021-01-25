package clase3.tt;

import clase2.tm.ejercicio1.CuentaCorriente;
import common.CollectionTestUtil;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class SorterImplementationsTest {
    @Test
    void testSortIntegers() {
        // setup
        Integer[] sample = {5, 98, 23, 7, 233, 32, 3, 90, 14, 76};
        Comparator<Integer> ascendingComparator = (i1, i2) -> i1 - i2;
        Comparator<Integer> descendingComparator = (i1, i2) -> i2 - i1;
        Integer[] expectedAscendingResult = {3, 5, 7, 14, 23, 32, 76, 90, 98, 233};
        Integer[] expectedDescendingResult = {233, 98, 90, 76, 32, 23, 14, 7, 5, 3};
        CollectionTestUtil.Equable<Integer> equable = (t1, t2) -> t1.intValue() == t2.intValue();

        // QuickSorter
        QuickSortSorterImple<Integer> quickSortSorter = new QuickSortSorterImple<>();
        Integer[] arr1 = sample.clone();
        quickSortSorter.sort(arr1, ascendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedAscendingResult, arr1, equable);
        Integer[] arr2 = sample.clone();
        quickSortSorter.sort(arr2, descendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedDescendingResult, arr2, equable);

        // HeapSorter
        HeapSortSorterImple<Integer> heapSortSorter = new HeapSortSorterImple<>();
        Integer[] arr1_2 = sample.clone();
        heapSortSorter.sort(arr1_2, ascendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedAscendingResult, arr1_2, equable);
        Integer[] arr2_2 = sample.clone();
        heapSortSorter.sort(arr2_2, descendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedDescendingResult, arr2_2, equable);
    }

    @Test
    void testSortStrings() {
        // setup
        String[] sample = {"Pedro", "Eugenia", "Acasio", "Ana", "Francisco", "Luis"};
        Comparator<String> ascendingComparator = (i1, i2) -> i1.length() - i2.length();
        Comparator<String> descendingComparator = (i1, i2) -> i2.length() - i1.length();
        String[] expectedAscendingResult = {"Ana", "Luis", "Pedro", "Acasio", "Eugenia", "Francisco"};
        String[] expectedDescendingResult = {"Francisco", "Eugenia", "Acasio", "Pedro", "Luis", "Ana"};

        // QuickSorter
        QuickSortSorterImple<String> quickSortSorter = new QuickSortSorterImple<>();
        String[] arr1 = sample.clone();
        quickSortSorter.sort(arr1, ascendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedAscendingResult, arr1);
        String[] arr2 = sample.clone();
        quickSortSorter.sort(arr2, descendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedDescendingResult, arr2);

        // HeapSorter
        HeapSortSorterImple<String> heapSortSorter = new HeapSortSorterImple<>();
        String[] arr1_2 = sample.clone();
        heapSortSorter.sort(arr1_2, ascendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedAscendingResult, arr1_2);
        String[] arr2_2 = sample.clone();
        heapSortSorter.sort(arr2_2, descendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedDescendingResult, arr2_2);
    }

    @Test
    void testSortCuentasCorrientes() {
        // setup
        CuentaCorriente[] sample = {
                new CuentaCorriente(500),
                new CuentaCorriente(350),
                new CuentaCorriente(90),
                new CuentaCorriente(1000),
                new CuentaCorriente(800),
                new CuentaCorriente()
        };
        Comparator<CuentaCorriente> ascendingComparator = (c1, c2) -> (int) (c1.getSaldo() - c2.getSaldo());
        Comparator<CuentaCorriente> descendingComparator = (c1, c2) -> (int) (c2.getSaldo() - c1.getSaldo());
        CuentaCorriente[] expectedAscendingResult = {
                new CuentaCorriente(),
                new CuentaCorriente(90),
                new CuentaCorriente(350),
                new CuentaCorriente(500),
                new CuentaCorriente(800),
                new CuentaCorriente(1000)
        };
        CuentaCorriente[] expectedDescendingResult = {
                new CuentaCorriente(1000),
                new CuentaCorriente(800),
                new CuentaCorriente(500),
                new CuentaCorriente(350),
                new CuentaCorriente(90),
                new CuentaCorriente()
        };
        CollectionTestUtil.Equable<CuentaCorriente> equable = (t1, t2) -> t1.getSaldo() == t2.getSaldo();

        // QuickSorter
        QuickSortSorterImple<CuentaCorriente> quickSortSorter = new QuickSortSorterImple<>();
        CuentaCorriente[] arr1 = sample.clone();
        quickSortSorter.sort(arr1, ascendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedAscendingResult, arr1, equable);
        CuentaCorriente[] arr2 = sample.clone();
        quickSortSorter.sort(arr2, descendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedDescendingResult, arr2, equable);

        // HeapSorter
        HeapSortSorterImple<CuentaCorriente> heapSortSorter = new HeapSortSorterImple<>();
        CuentaCorriente[] arr1_2 = sample.clone();
        heapSortSorter.sort(arr1_2, ascendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedAscendingResult, arr1_2, equable);
        CuentaCorriente[] arr2_2 = sample.clone();
        heapSortSorter.sort(arr2_2, descendingComparator);
        CollectionTestUtil.assertArraysContainSameElements(expectedDescendingResult, arr2_2, equable);
    }
}