package ro.scoalainformala;

import java.io.*;

public class Main {
    private static final String TEXT_FILE_PATH = "C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\io-german-text\\germanText.java";
    private static final String OUT_TEXT_FILE_PATH = "C:\\Users\\acron\\Documents\\cursJAVA\\TEME\\io-german-text\\germanTextMODIFIED.java";

    public static void main(String[] args) {

        try (
            Reader r = new FileReader(TEXT_FILE_PATH);
            Writer w = new FileWriter(OUT_TEXT_FILE_PATH)) {
            int c;
            while ((c= r.read()) != -1) {
                if (c == 'ß') {
                    c = 's';
                }
                if (c == 'ä') {
                    c = 'a'+'e';
                }
                if (c == 'ö') {
                    c = 'o';
                }
                if (c == 'ü') {
                    c = 'u';
                }
                w.write(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

    }
}