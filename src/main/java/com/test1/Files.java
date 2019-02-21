package com.test1;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class Files   {
    public static void main(String[] args) throws IOException {
        //read from a File
   /*     try(BufferedReader br = new BufferedReader(new FileReader("d:\\11.txt"))) {
            String value;
            while((value = br.readLine()) != null){
                System.out.println(value);
            }
        }*/


        //Create a Zip File
        String[] data = {"Line 1" , "Line 2" , "Line3" , "Line4"};
        FileWriter fw1 = new FileWriter(new File("C:\\Users\\ismaamah\\Downloads\\test2\\22.txt"));
        BufferedWriter writer = new BufferedWriter(fw1);
        for(String d: data){
            writer.write(d);
            writer.newLine();
        }
        writer.close();




    }

    private static FileSystem createZip(Path zipPath) throws IOException, URISyntaxException {
        Map<String, String> providerprops = new HashMap<>();
        providerprops.put("create" , "true");

        URI zipUri = new URI("jar:file" , zipPath.toUri().getPath(),null);
        FileSystem zipFs = FileSystems.newFileSystem(zipUri , providerprops);

        return zipFs;

    }


}
