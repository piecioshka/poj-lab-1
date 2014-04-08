package pl.piecioshka.poj_lab_1;

import java.io.FileInputStream;
import java.util.Properties;

public class Registry {
    /**
     * Ścieżka do pliku konfiguracyjnego.
     */
    public static String pathname = "src/pl/piecioshka/poj_lab_1/prod.properties";

    /**
     * Blokujemy możliwość stworzenia instancji tej klasy.
     */
    private Registry() {
        // Private constructor of Registry
    }

    /**
     * Wczytujemy konfigurację z pliku: prod.properties oraz tworzymy instancję klasy z nazwy zapisanej w odpowiedniej
     * właściwości.
     *
     * @return Instancja klasy implementującej interfejs DataProvider.
     */
    public static DateProvider getDateProvider() throws UnknownDateProvider, ConfigurationNotFound, FailedCreateDateProvider {
        Properties prop = new Properties();
        Class<?> dateProviderClass;
        Object dataProviderInstance;

        try {
            prop.load(new FileInputStream(Registry.pathname));
        } catch (Exception e) {
            throw new ConfigurationNotFound("Configuration " + Registry.pathname + " does not exists");
        }

        String providerName = prop.getProperty("date_provider");

        try {
            dateProviderClass = Class.forName(providerName);
        } catch (Exception e) {
            throw new UnknownDateProvider("Provide " + providerName + " is not defined");
        }

        try {
            dataProviderInstance = dateProviderClass.newInstance();
        } catch (Exception e) {
            throw new FailedCreateDateProvider("Failed to create instance of DateProvider");
        }

        return (DateProvider) dataProviderInstance;
    }
}
