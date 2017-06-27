package ru.safontev.test;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by safon on 27.06.2017.
 */
public class Sorter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        String line;

        List<String> lines = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null)


            bufferedReader.close();
    }
}
