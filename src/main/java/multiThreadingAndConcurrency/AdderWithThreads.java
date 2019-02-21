package multiThreadingAndConcurrency;

import java.io.*;
import java.util.Date;

public class AdderWithThreads implements Runnable {

    private static String inFile , outFile;

    public AdderWithThreads(String inFile, String outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public static void doAdd() throws IOException {
        String line = null;
        StringBuilder total = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(outFile))) {
            while((line = reader.readLine())!=null){
                total.append(line);
                total.append("\n");
            }
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(inFile))) {
            while((line = reader.readLine())!=null){
                total.append(line);
                total.append("\n");
                System.out.println(line);
            }
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))){
            writer.write(total.toString());
            System.out.println(inFile + ":Copied");
        }
    }

    @Override
    public void run() {
        try {
            doAdd();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
