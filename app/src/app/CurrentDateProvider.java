package app;

import java.util.Date;

public class CurrentDateProvider implements DateProvider {
    
    @Override
    public Date getDate() {
        return new Date();
    }
}
