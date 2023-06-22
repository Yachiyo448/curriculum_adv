package util;

/**
 * Personを継承した主人公のクラス
 */

public class Hero extends Person {

	// 新しく名前のフィールドを宣言
	private String name;

	/**
	 * 指定した名前の主人公を生成
	 * @param name 名前
	 */
	public Hero(String name) {
		this.setName(name);
	}

	// デフォルトコンストラクタの設定
	/**
	 * 名前が空の主人公を生成
	 * @param name 名前
	 */
	public Hero() {
		this("");
	}

	// getterとsetterのメソッドを設定
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
