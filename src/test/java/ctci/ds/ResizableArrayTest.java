package ctci.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ResizableArrayTest {

    @Test
    public void checkAdding() {
        ResizableArray<Integer> ra = new ResizableArray<>(2);
        ra.add(1);
        ra.add(2);
        assertEquals(2, ra.size());
    }

    @Test
    public void checkRemoving() {
        ResizableArray<Integer> ra = new ResizableArray<>(2);
        ra.add(1);
        ra.add(2);
        ra.remove(2);
        assertEquals(1, ra.size());
        ra.add(2);
        ra.add(3);
        ra.remove(2);
        assertEquals(3L, (long) ra.get(1));
        ra.add(4);
        assertEquals(4L, (long) ra.get(2));
    }

    @Test
    public void checkSetting() {
        ResizableArray<Integer> ra = new ResizableArray<>(2);
        ra.add(1);
        ra.add(2);
        ra.set(1, 3);
        assertEquals(3, (long) ra.get(1));
    }
}