package ec_passengers_demo_xom;

import java.util.Date;
import java.util.Calendar;

public class Utils {
    public static Date getDateMinutesAfter(Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);
        return calendar.getTime();
    }
    public static Date getDateMinutesBefore(Date date, int minutes) {
    	return getDateMinutesAfter(date, -minutes);
    }
}
