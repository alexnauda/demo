import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class Timezone {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int offset = c.get(Calendar.DST_OFFSET);
        System.out.println("offset: " + offset);

        TimeZone tz = TimeZone.getDefault();
        System.out.println("tz: " + tz);
    }
}
