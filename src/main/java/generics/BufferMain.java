package generics;

public class BufferMain {

    public static void main(String[] args) {
        Buffer<String> buffer = new Buffer<>();
        buffer.addToBuffer("dd");
        Buffer<Integer> intBuffer = new Buffer<>();
        intBuffer.addToBuffer(5);



    }
}
