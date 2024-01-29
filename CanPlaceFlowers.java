package pro;

public class CanPlaceFlowers {

	public static void main(String[] args) {

		int[] bed = { 0 ,1,1,0,0,1,0,0,0,1};
		int n = 2;

		System.out.println(canPlaceFlowers(bed, n));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		Boolean b = false;

		if (flowerbed.length == 1 && flowerbed[0] == 0 && n > 0) {
			return true;
		} else if (flowerbed.length == 1 && flowerbed[0] == 1 && n > 0) {
			return false;
		}

		if (flowerbed.length > 1 && flowerbed[0] != 1 && flowerbed[1] == 0) {
			flowerbed[0] = 1;
			n--;
		}

		for (int i = 0; i < flowerbed.length; i++) {

			if (i > 0 && i < flowerbed.length - 1 && flowerbed[i - 1] != 1 && flowerbed[i] == 0
					&& flowerbed[i + 1] != 1) {
				flowerbed[i] = 1;
				n--;
			}

		}

		if (flowerbed.length > 1 && flowerbed[flowerbed.length - 2] != 1 && flowerbed[flowerbed.length - 1] == 0) {
			flowerbed[flowerbed.length - 1] = 1;
			n--;
		}

		if (n <= 0) {
			b = true;
		} else {
			b = false;
		}

		return b;

	}
}
