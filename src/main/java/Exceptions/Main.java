package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NumberException {

        BufferedReader reader = null;
        int total = 0 ;

        /**
         * Handling exceptions with try catch
         */
        try {
            reader = new BufferedReader(new FileReader("D://11.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line);
            }
            System.out.println(total);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Handling Exception with throws Exception
         */
        reader = new BufferedReader(new FileReader("D://11.txt"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            total += Integer.valueOf(line);
        }
        System.out.println(total);

        /**
         *
         * handling exception with special class
         */
        System.out.println(Helper.Calculator(4, 0));

    }
}
