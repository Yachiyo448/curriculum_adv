package util;

import java.util.Scanner;

/**
 * 名前を入力したら主人公のステータスが表示され、メッセージが出力されるクラスです。
 */
public class HeroGenerator {

	// メインメソッドの定義
	public static void main(String[] args) {

		// Scannerクラスを宣言
		Scanner scanner;

		// 入力内容の変数を宣言
		String input;

		// やり直しフラグの宣言
		boolean redo = true;

		// 名前が正しく入力されるまで繰り返す
		do {

			// コンソール入力用のインスタンスを生成
			scanner = new Scanner(System.in);

			// 入力を促すメッセージを出力
			System.out.print("名前を入力してください > ");

			// 名前にコンソールに入力した値を代入
			input = scanner.nextLine();

			// 名前がnullか0文字以下の場合、「ERROR: 1文字以上の名前を入力してください」を出力
			if (input == null || input.length() <= 0) {
				System.out.println("ERROR: 1文字以上の名前を入力してください\n");

				// 名前が10文字以上の場合、「ERROR: 10文字以内で入力してください」を出力
			} else if (input.length() >= 10) {
				System.out.println("ERROR: 10文字以内で入力してください\n");

				// 上記以外の場合、やり直しフラグをfalseにしてループを抜ける
			} else {
				redo = false;
			}
		} while (redo);

		// 入力された名前を引数に主人公のインスタンスを生成
		Hero hero = new Hero(input);

		// 主人公の名前とステータスをコンソール出力
		System.out.println("\nこんにちは 「 " + hero.getName() + " 」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + hero.getHp());
		System.out.println("MP：" + hero.getMp());
		System.out.println("攻撃力：" + hero.getAttack());
		System.out.println("素早さ：" + hero.getSpeed());
		System.out.println("防御力：" + hero.getDefence());

		System.out.println("\nさあ冒険にでかけよう！");

		// メソッド終了時にScannerを閉じる
		scanner.close();
	}

}
