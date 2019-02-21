package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Buffer<T> {

    private List<T> buffer;
    private int cursor = 0;

    public Buffer() {
        buffer = new ArrayList<>();
    }

    public boolean addToBuffer(T value){
        buffer.set(cursor, value);
        cursor++;
        return true;
    }

    public  <T> T min(Comparator<T> comparator){
        final T element = (T) buffer.get(0);
        for(int i=1 ; i<buffer.size();i++){

        }
        return element;
    }


}
