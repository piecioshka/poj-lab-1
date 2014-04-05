package pl.piecioshka.poj_lab_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Registry {
    /**
     * Ścieżka do pliku konfiguracyjnego.
     */
    public static String pathname = "src/pl/piecioshka/poj_lab_1/prod.properties";

    /**
     * Blokujemy możliwość stworzenia instancji tej klasy.
     */
    private Registry() {}

    /**
     * Wczytujemy konfigurację z pliku: prod.properties oraz tworzymy instancję klasy z nazwy zapisanej w odpowiedniej
     * właściwości.
     *
     * @return Instancja klasy implementującej interfejs DataProvider.
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static DateProvider getDateProvider() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(Registry.pathname));
        return (DateProvider) Class.forName(prop.getProperty("date_provider")).newInstance();
    }
}
