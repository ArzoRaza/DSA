class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
public class Utility {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
    }
}
class NumericBox<T extends Number> {
    private T num;

    public NumericBox(T num) {
        this.num = num;
    }

    public double getDoubleValue() {
        return num.doubleValue();
    }
}
public class WildcardExample {

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void addNumber(List<? super Integer> list) {
        list.add(42); // Can add Integer or subclass
    }
}
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public <V extends Comparable<V>> V compare(V a, V b) {
        return a.compareTo(b) > 0 ? a : b;
    }
}
