package app;

import java.util.Date;

public class FixedDateProvider implements DateProvider {
    
    @Override
    public Date getDate() {
        return new Date(2014, 04, 01);
    }
}
