package pl.piecioshka.poj_lab_1;

public class Main {
    public static void main(String[] args) throws UnknownDateProvider, FailedCreateDateProvider, ConfigurationNotFound {
        System.out.println("Czas: " + Registry.getDateProvider().getDate());
    }
}
