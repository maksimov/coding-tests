package ctci.ds;

/**
 * @author Stas Maksimov (stas@maksimov.net)
 * @since 09/02/2017
 */
public class ResizableArray<T> {
    static final int INITIAL_CAPACITY = 10000;

    private Object[] data;
    private int size;

    public ResizableArray() {
        this(INITIAL_CAPACITY);
    }

    public ResizableArray(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public void add(T value) {
        ensureExtraCapacity();
        data[size] = value;
        size++;
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        data[index] = value;
    }

    private void ensureExtraCapacity() {
        if (size < data.length) {
            return;
        }
        Object copy[] = new Object[size * 2];
        System.arraycopy(data, 0, copy, 0, size);
        data = copy;
    }

    public void remove(T value) {
        int i;
        boolean found = false;
        for (i = 0; i<size; i++) {
            if (data[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            System.arraycopy(data, i+1, data, i, size-i-1);
            size--;
        }
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) data[index];
    }
}
