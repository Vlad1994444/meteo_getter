package main.java;

import main.java.model.Root;

public class Main {
    public static void main(String[] args) {

        JSONParsing parser = new JSONParsing();

        Root root = parser.parse();

        System.out.println(root);
//        System.out.println(urlContent.getOutput());
    }
}
