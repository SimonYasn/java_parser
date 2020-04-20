package com.example;

import java.io.*;

public class Catcher {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(",");
        reader.close();

        BufferedWriter outputWriter = new BufferedWriter(new FileWriter("C:\\" + input[input.length - 1]));

        for (int i = 1; i < input.length - 1; i++) {
            BufferedReader br = new BufferedReader(new FileReader(input[i]));
            while (br.ready()) {
                String line = br.readLine();
                if (line.contains(input[0])) {
                    outputWriter.write(line + "\r\n");
                }
            }
            br.close();
        }
        outputWriter.close();
    }
}
