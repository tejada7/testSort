import model.Foo;
import test.OrderingEqualsObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // Setting data
        OrderingEqualsObjects orderingEqualsObjects = new OrderingEqualsObjects();
        Foo f1 = new Foo(1, "name1");
        Foo f2 = new Foo(2, "name1");

        Foo f3 = new Foo(0, "name0");
        Foo f4 = new Foo(-5, "name-5");
        Foo f5 = new Foo(6, "name-6");
        Foo f6 = new Foo(-100, "name-100");
        Foo f7 = new Foo(100, "name100");
        orderingEqualsObjects.addData(f1, f2, f3, f4, f5, f6, f7);

        System.out.println("Before sorting...");
        orderingEqualsObjects.printOrdering();

        List<Foo> list = new ArrayList<>(orderingEqualsObjects.getDataSet());
        Collections.sort(list);

        System.out.println("After sorting...");

        orderingEqualsObjects.sort();

        orderingEqualsObjects.printOrdering();
    }
}
