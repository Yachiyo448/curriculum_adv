package util;

/**
 * 引数をもとにランダムな数値を出力するクラスです。
 */
public class Random {

	/**
	 * 2つの整数を受け取り、それぞれを最小値・最大値としてランダムな整数を返します。
	 * @param min 最小値
	 * @param max 最大値
	 * @return 最小値と最大値の間で生成された乱数
	 */
	public static int generateBetween(int min, int max) {

		// 最大値より最小値の方が大きい場合は数値を逆転させる
		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}

		// 最大値と最小値の差で乱数を生成し、最小値を和算する
		int range = max - min + 1;
		int generateNum = (int) (Math.random() * range) + min;
		return generateNum;
	}

}
