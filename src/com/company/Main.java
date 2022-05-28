package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("textfile.txt"));
        //ArrayList<String> listOfLines = new ArrayList<>();
        Set<String> listOfLines = new HashSet<>();

        String line = bufReader.readLine();

        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();

        Iterator<String> iter = listOfLines.iterator();
        System.out.println("number of items " + listOfLines.size());
        iter.forEachRemaining(System.out::println);

    }
}

