package ch.amaba.model.bo.constants.utils;

public class EnumUtils {
	public static <E extends Enum<?>> E getEnumFromString(final String str, final Class<E> enumClass) {
		E result = null;
		if ((enumClass != null) && enumClass.isEnum()) {
			final E[] values = enumClass.getEnumConstants();
			for (final E value : values) {
				if (value.toString().equals(str)) {
					result = value;
					break;
				}
			}
		}
		return result;
	}

	public static <E extends Enum<?>> E getEnumFromId(final Integer id, final Class<E> enumClass) {
		E result = null;
		if ((enumClass != null) && enumClass.isEnum()) {
			final E[] values = enumClass.getEnumConstants();
			for (final E value : values) {
				if (value.toString().equals(id)) {
					result = value;
					break;
				}
			}
		}
		return result;
	}
}