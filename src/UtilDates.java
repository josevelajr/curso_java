import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class UtilDates {

    public void dates() throws ParseException {

        //Data ISO 8601 - UTC
        Date y3 = Date.from(Instant.parse("2018-06-25T15:43:07Z"));
        System.out.println(y3);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("ddMMyyyyHHmmss");
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf4.setTimeZone(TimeZone.getTimeZone("GMT"));


        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf4.format(y3));


        //Data atual
        Date x1 = new Date();
        System.out.println(x1);
        System.out.println("x1: " + sdf1.format(x1));
        System.out.println("x1 para testes: " + sdf3.format(x1));

        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x2 para testes: " + sdf3.format(x2));


        //Uso do Calendar
        System.out.println("-----------------CALENDAR----------------");
        Calendar cal = Calendar.getInstance();
        cal.setTime(x1);
        cal.add(Calendar.HOUR_OF_DAY,4);
        x1 = cal.getTime();
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);


        System.out.println(sdf4.format(x1));
        System.out.println(minutos);
        System.out.println(mes);

    }

}
