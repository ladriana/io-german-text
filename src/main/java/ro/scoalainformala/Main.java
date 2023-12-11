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
            while ((c = r.read()) != -1) {
                if (c == 'ß') {
                    c = 's';
                    w.write('s');
                }
                if (c == 'ä') {
                    c = 'e';
                    w.write('a');

                }
                if (c == 'ö') {
                    c = 'e';
                    w.write('o');

                }
                if (c == 'ü') {
                    c = 'e';
                    w.write('u');

                }
                w.write(c);
            }

        } catch (IOException e) {
            System.err.println("Something went wrong!");
        }

    }
}