package jp.ac.hal;

public class Main {
	//	定数・・・決まっている値→変更できない値
	//	変数・・・変更できる値

	//	javaでの定数宣言
	public static final int MAX_COUNT = 10;
	//	定数名は、大文字＄アンダーバーで有ることが慣例

	public static void main(String[] args) {
		int i = 0;

		if( i < MAX_COUNT ) {

		}

		while( i < MAX_COUNT ) {

		}

		//		定数の利点
		//		①修正箇所が１箇所になる
		//		②定数名で用途が分かり、保守性が上がる

		//		if( i < 10 )
		//		　　　　　↑
		//		処理中に出現する数値はマジックナンバーと呼ばれ禁止されることが多い。。。
		//		→定数を利用すること
		//		※マジックナンバー
		//		　マジックみたいにぱっと見でよくわからない数値

		//		おまけ　PHP ver
		//		define( "MAX_CONST", 10 );
		//		classを使うとconst MAX_CONST = 10;
		//		でいける



	}

}