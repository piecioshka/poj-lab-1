package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registry {
    public static DateProvider getDateProvider() throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("/Users/piecioshka/Documents/wsisiz/poj/lab-1/app/src/app/prod.properties"));
        DateProvider provider = null;
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
