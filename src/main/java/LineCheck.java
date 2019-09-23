package main.java;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LineCheck {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> targetList = new ArrayList<String>();
        ArrayList<String> filterList = new ArrayList<String>();

        String text;
        while ((text = br.readLine()) != null) {
            filterList.add(text);
        }
        br.close();

        targetList.add("aaaa");
        targetList.add("test");
        targetList.add("あいう");
        targetList.add("testtest");
        targetList.add("たちつてと");
        targetList.add("さしすせそ");
        targetList.add("mogemoge");
        targetList.add("さしすせそたちつ");

        for (String target : targetList) {
            if (!filterList.contains(target)) {
                System.out.println(target);
            }
        }
    }

}
