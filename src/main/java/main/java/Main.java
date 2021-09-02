package main.java;

public class Main {
    public static void main(String[] args) {
        GetURLContent urlContent = new GetURLContent();
        String result = urlContent.getOutput();
//        JSONParsing parsing = new JSONParsing();
        System.out.println(urlContent.getOutput());
    }
}
