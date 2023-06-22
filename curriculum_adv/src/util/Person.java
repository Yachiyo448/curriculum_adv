package util;

/**
 * 特定のステータスを持つ人物のクラスです。
 */

public class Person {

	// フィールドで各ステータスを宣言
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;

	// コンストラクタの設定
	public Person() {

		// setterを利用し、乱数生成クラスからランダムな数値をステータスに設定
		this.setHp(Random.generateBetween(1, 999));
		this.setMp(Random.generateBetween(1, 999));
		this.setAttack(Random.generateBetween(1, 999));
		this.setSpeed(Random.generateBetween(1, 999));
		this.setDefence(Random.generateBetween(1, 999));
	}

	// getterとsetterのメソッドを設定

	/**
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return mp
	 */
	public int getMp() {
		return mp;
	}

	/**
	 * @param mp セットする mp
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}

	/**
	 * @return attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack セットする attack
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed セットする speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return defence
	 */
	public int getDefence() {
		return defence;
	}

	/**
	 * @param defence セットする defence
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}

}
