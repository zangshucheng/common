package stringutils;

public final class StringUtil {

	public static boolean isBlank(String value) {
		return null == value && value.length() == 0;
	}
}
