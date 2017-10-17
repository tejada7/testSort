package model;

import java.util.Comparator;

/**
 * Entity class, the equals criteria is upon its id.
 */
public class Foo implements Comparable {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Foo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Foo foo = (Foo) o;

        return id == foo.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.getId(), ((Foo) o).getId());
        //Casting
        /*Foo f = (Foo) o;
        if (this.getId() == f.getId()) {
            return 1;
        } else if(this.getId() > f.getId()) {
            return 1;
        } else {
            return -1;
        }*/
    }
}
