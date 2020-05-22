package common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
	/**
	 * Get root path in directory.
	 */
	public static String getRootPath() {
		return System.getProperty("user.dir");
	}

	/**
	 * Time sleep.
	 */
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isNullOrEmpty(String str) {
		return (str == null || str.isEmpty());
	}

	public static String[] convertListToArray(List<String> values) {
		return values.toArray(new String[values.size()]);
	}

	public static <T> List<T> convertArrayToList(T... array) {
		// as parameter in the constructor 
        List<T> list = new ArrayList<T>(); 
        // Add the array to list 
        Collections.addAll(list, array); 
        return list;
		//return (List<T>) Arrays.stream(array).collect(Collectors.toList());
		// new ArrayList<T>(Arrays.asList(array));

	}
}
