package test;

import model.Foo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class OrderingEqualsObjects {
    public List<Foo> dataSet;

    public OrderingEqualsObjects() throws InstantiationException, IllegalAccessException {
        initDataSet();
    }

    /**
     * Initializes a collection with 10 instances
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    void initDataSet() throws IllegalAccessException, InstantiationException {
        dataSet = IntStream.range(1, 10)
                .mapToObj(id -> new Foo(id, id + "name"))
                .collect(Collectors.toList());
    }

    public void printOrdering() {
        dataSet.forEach(foo -> System.out.println(foo.toString()));
    }

    public Collection<Foo> getDataSet() {
        return dataSet;
    }

    public void addData(Foo...array) {
        Arrays.asList(array).forEach(dataSet::add);
    }

    public void sort() {
        Collections.sort(dataSet);
    }
}
