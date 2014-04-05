package pl.piecioshka.poj_lab_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Registry reg = new Registry();
        System.out.println("Czas: " + Registry.getDateProvider().getDate());
    }
}
