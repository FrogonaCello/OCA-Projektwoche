package aprojektwoche.model;

import java.time.format.DateTimeFormatter;

public abstract class FormatDateTime {
	
	
	/*
	 * DateTime Pattern change here for all, if necessary
	 */

	// Date only
	static String format = "' 'yyyy', 'MMMM' 'dd'.'";
	final static DateTimeFormatter date_tf = DateTimeFormatter.ofPattern(format);
	
	
	// Date and Time
	static String formatWithTime = "' 'yyyy', 'MMMM' 'dd'. at 'hh':'mm' '";
	final static DateTimeFormatter date_time_f = DateTimeFormatter.ofPattern(formatWithTime);
	

}
