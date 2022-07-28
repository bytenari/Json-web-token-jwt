import java.util.Arrays;

public class Stack<E> implements StackInterface<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = {};
    private Object[] array;
    private int size;
// 초기 공간 할당이 안 된 경우
    public Stack() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }
// 초기 공간 할당이 된 경우
    public Stack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    private void resize() {

        if(Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        int arrayCapacity = array.length;

        if (size == arrayCapacity) {
            int newSize = arrayCapacity * 2;

            array = Arrays.copyOf(array, newSize);
            return;
        }

        if(size < (arrayCapacity / 2)) {
            int newCapacity = (arrayCapacity / 2);
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));
            return;
        }
    }

    @Override
    public E push(E item) {
        if (size == array.length) {
            resize();
        }
        array[size] = item;
        size++;

        return item;
    }

    @Override
    public E pop() {
        if (size == 0) {
            return null;
        }
        E obj = (E) array[size - 1];

        array[size - 1] = null;
        size--;

        return obj;
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return (E) array[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    public static void main(String[] args) {
        Object[] array = new Object[]{1,2,3,4,5,6,7,8,9};

    }
}


