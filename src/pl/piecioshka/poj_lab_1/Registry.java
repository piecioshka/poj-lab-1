package pl.piecioshka.poj_lab_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registry {
    public static DateProvider getDateProvider() throws IOException {
        DateProvider provider = null;

        Properties prop = new Properties();
        prop.load(new FileInputStream("./src/pl/piecioshka/poj_lab_1/prod.properties"));

        try {
            try {
                provider = (DateProvider) Class.forName(prop.getProperty("date_provider")).newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
        }

        return provider;
    }
}
