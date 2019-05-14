package z.mathew.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

import zenith.util.DateUtil;

public class TestDays {

	public static void main(String[] args) throws ParseException {

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date parsedDate = dateFormat.parse("2019-05-01");
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());

			Date parsedDate2 = dateFormat.parse("2019-05-31");
			Timestamp timestamp2 = new java.sql.Timestamp(parsedDate2.getTime());
			doIt(timestamp, timestamp2);
		} catch (Exception e) { // this generic but you can control another types of exception
			// look the origin of excption
		}
	}

	private static void doIt(Timestamp t1, Timestamp t2) {
		try {

			Date myDate = new Date(t1.getTime());

			Date myDate2 = new Date(t2.getTime());

			Calendar start = Calendar.getInstance();
			start.setTime(myDate);

			Calendar end = Calendar.getInstance();
			end.setTime(myDate2);
			end.add(Calendar.DATE, 1);

			for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
				// date.to
				Timestamp timestamp = new Timestamp(date.getTime());
				System.out.println(timestamp);
				if (start.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
						|| start.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)

					System.out.println("weekend");
				// System.out.println(date);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
