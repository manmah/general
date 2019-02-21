package generics;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GenericsMain {

    private final RandomAccessFile file = null;
    String className = file.readUTF();
    final Class<?> personClass = Class.forName(className);

    public GenericsMain() throws IOException, ClassNotFoundException {
    }

    public static void main(String[] args) throws ClassNotFoundException {



    }
}
