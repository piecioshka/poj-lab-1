package pl.piecioshka.poj_lab_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Registry {
    public static DateProvider getDateProvider() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./src/pl/piecioshka/poj_lab_1/prod.properties"));
        return (DateProvider) Class.forName(prop.getProperty("date_provider")).newInstance();
    }
}
