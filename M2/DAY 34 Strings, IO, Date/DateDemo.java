import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class DateDemo {

  public static void main(String[] args) {
    Date d = new Date();
    System.out.println(d); //Fri Sep 30 14:01:42 IST 2022

    // convert date object to String
    //d date => 1
    //dd Date => 01
    //m -> minute
    //M -> 1
    //MM -> 01
    //22,2022
    //yy,yyyy
    //hh => 12 hour
    // HH => 24 hour
    //mm
    //ss
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");
    String strDate = sdf.format(d);
    System.out.println(strDate); //30/09/2022 14:01:42 083

    //convert String to Date
    String dobStr = "2022-01-14"; //14
    String dobStr2 = "2010-01-14"; //14
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Date dob = sdf2.parse(dobStr);
      Date dob2 = sdf2.parse(dobStr2);

      System.out.println(dob);
    } catch (ParseException e) {
      e.printStackTrace();
    }

    Calendar cal = Calendar.getInstance();
    System.out.println(cal);
    System.out.println(cal.get(Calendar.YEAR));
    System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
    System.out.println(cal.get(Calendar.MONTH) + 1);
    //		cal.setDate(d);

  }
}
