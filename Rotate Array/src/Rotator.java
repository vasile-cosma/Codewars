public class Rotator {

	public Object[] rotate(Object[] data, int n) {

		if (n > 0)
			return rotatePositivo(data, n);
		if (n < 0)
			return rotateNegativo(data, n);
		return data;
	}

	public static Object[] rotatePositivo(Object[] data, int n) {
		if (n > data.length) {
			n = n % data.length;
		}
		Object[] arr = new Object[data.length];

		for (int i = 0; i < data.length; ++i) {

			int pos = i + n;
			if (pos >= data.length)
				pos = i + n - data.length;

			arr[pos] = data[i];
		}

		return arr;
	}

	public static Object[] rotateNegativo(Object[] data, int n) {
		if (n * (-1) > data.length) {
			n = n % data.length;
		}

		Object[] arr = new Object[data.length];

		for (int i = 0; i < data.length; ++i) {
			int pos = i + n;

			if (pos < 0)
				pos = data.length + pos;

			arr[pos] = data[i];
		}
		return arr;
	}

}