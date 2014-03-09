package app;

import java.io.IOException;

public class App {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Registry reg = new Registry();
        System.out.println("Czas: " + Registry.getDateProvider().getDate());
    }
}
