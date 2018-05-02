import java.util.Arrays;

public class ArrayLIst implements Collection {

    Object[] objects = new Object[10];

    int index=0;

    public void add(Object o) {
        if (index == objects.length) {
            Object[] newObjects=new Object[objects.length*2];
            System.arraycopy(objects, 0,newObjects ,0, objects.length);
            objects=newObjects;
        }
        objects[index]=o;
        index++;
    }

    @Override
    public String toString() {
        return "ArrayLIst{" +
                "objects=" + Arrays.toString(objects) +
                ", index=" + index +
                '}';
    }

    public int size() {
        return index;
    }
}
