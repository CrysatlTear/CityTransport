package com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileManager {
    public static String[] readFile(String[] content, String path){
        try{
            String str = Files.readString(Path.of(path));
                content = str.split(",");
        }
        catch (IOException ex){
            ex.getStackTrace();
        }
        return content;
    }

    public static List<String> read(String path) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        try(Stream<String> lineStream = Files.lines(Path.of(path))){
            lines = lineStream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static int getFileStringsCount(String path) {
        BufferedReader bufferedReader = null;
        int fileStrings =0;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(path).getAbsoluteFile()));
            while (true){
                String line = bufferedReader.readLine();
                if(line != null){
                    fileStrings++;
                }
                else break;
            }
        }

        catch (IOException ioe){
            ioe.toString();
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileStrings;
    }

    public static String getRandomName(String[] arr){
        Random random = new Random();
        String randomName = arr[(random.nextInt(arr.length))];
        return randomName;
    }

    public static String getSpecificName(String[] arr, int switcher){
        String specName ="";
        switch (switcher){
            case 1:
                specName = arr[0];
            case 2:
                specName = arr[1];
            case 3:
                specName = arr[2];
            case 4:
                specName = arr[3];
        }
        return specName;
    }

    public static String getSpecificNameStream(List<String> arr, int switcher){
        Map<Integer,String> names = Map.of(
                0,"Heavy IC Engine 200 H/W",
                1,"Heavy IC Engine 500 H/W",
                2,"Heavy IC Engine 700 H/W",
                3,"Heavy IC Engine 900 H/W"
        );

        return names.get(switcher);
    }
}
