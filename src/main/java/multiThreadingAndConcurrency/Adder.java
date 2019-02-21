package multiThreadingAndConcurrency;

import java.io.*;

public class Adder {

    public static void doAdd(String inFile , String outFile) throws IOException {
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
}
