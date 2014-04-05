package pl.piecioshka.poj_lab_1;

import java.util.Date;

public class FixedDateProvider implements DateProvider {
    @Override
    public Date getDate() {
        return new Date(2014, 4, 1);
    }
}
