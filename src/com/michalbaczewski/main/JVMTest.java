package com.michalbaczewski.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JVMTest {

    public static String great = "ABCDEFGHIJKLMNOPRSTUVWXYZ";

    private int a = 10;

    public static void main(String[] args) throws InterruptedException, IOException {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Let's roll: ");
            int elo = scanner.nextInt();
            for (int i1 = 0; i1 < elo; i1++) {
                StringBuilder sb = new StringBuilder();
                int len = new Random().nextInt(great.length());
                for (int i = 0; i < len; i++) {
                    sb.append(great.charAt(new Random().nextInt(great.length())));
                }
                strings.add(sb.toString());
            }
            int remove = new Random().nextInt(elo);
            for (int i = 0; i < remove; i++) {
                strings.remove(new Random().nextInt(strings.size()));
            }
        }
    }

}
