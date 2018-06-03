
import java.util.*;

public class FreeSunday {

    public static void main(String[] args) {

        // get the supported ids for GMT-08:00 (Pacific Standard Time)
        String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
        // if no ids were returned, something is wrong. get out.
        if (ids.length == 0)
            System.exit(0);

        // begin output
        System.out.println("Current Time");

        // create a Pacific Standard Time time zone
        SimpleTimeZone pdt = new SimpleTimeZone(-8 * 60 * 60 * 1000, ids[0]);

        // set up rules for Daylight Saving Time
        pdt.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
        pdt.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);

        // create a GregorianCalendar with the Pacific Daylight time zone
        // and the current date and time
        Calendar calendar = new GregorianCalendar(pdt);
        Date trialTime = new Date();
        calendar.setTime(trialTime);

        // print out a bunch of interesting things
        System.out.println("ERA: " + calendar.get(Calendar.ERA));
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));

       /* Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, 6);
        System.out.println("Number of days: " + weeksInTheMonth((GregorianCalendar) calendar));

        List<String>daysOfTheWeek = new LinkedList<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        Calendar calendar1 = new GregorianCalendar(2018, Calendar.MAY, 1);
        System.out.println("Pierwszy marca to: "
                + daysOfTheWeek.get(calendar.getFirstDayOfWeek()));
        System.out.println(calendar.get(calendar1.get(Calendar.MAY)));
        System.out.println(daysOfTheWeek);
    }
    public static int weeksInTheMonth(GregorianCalendar c) {
        List<Integer>weeksInMonth = new LinkedList<>();
        weeksInMonth.add(31);
        weeksInMonth.add(28);
        weeksInMonth.add(31);
        weeksInMonth.add(30);
        weeksInMonth.add(31);
        weeksInMonth.add(30);
        weeksInMonth.add(31);
        weeksInMonth.add(31);
        weeksInMonth.add(30);
        weeksInMonth.add(31);
        weeksInMonth.add(30);
        weeksInMonth.add(31);
        System.out.println("Numbers of days in Months" );
        for(Integer num: weeksInMonth){
            System.out.println(num);
        }
       // weeksInMonth.set(1, c.isLeapYear(c.get(GregorianCalendar.YEAR)) ? 1 : 0);
        return weeksInMonth.get(c.get(GregorianCalendar.MONTH)); */
    }
}
