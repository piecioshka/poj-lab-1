package pl.piecioshka.poj_lab_1;

import java.util.Date;

public class FixedDateProvider implements DateProvider {
    @Override
    public Date getDate() {
        return new Date(100, 4, 1, 12, 34, 56); // Dzień: 01/04/2000 12h 34m 56s
    }
}
