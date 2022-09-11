package determineMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DetermineMenu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<String> days = new ArrayList<String>(Arrays.asList("月","火","水","木","金","土","日"));
		List<String> menu = new ArrayList<String>(Arrays.asList(
				"	 カレー",
				"	 シチュー",
				"	 豚の生姜焼き",
				"	 鶏肉のソテー",
				"	 さばの味噌煮",
				"	 麻婆豆腐",
				"	 麻婆茄子",
				"	 焼き鳥丼",
				"	 ポキ丼",
				"	 親子丼",
				"	 唐揚げ",   
				"	 ビビンバ",
				"	 青椒肉絲",
				"	 肉じゃが",
				"	 鍋",
				"	 魚のムニエル",
				"	 野菜炒め",
				"	 そぼろ丼",
				"	 カツ丼",
				"	 チャーハン",
				"	 ハンバーグ",
				"	 ピーマンの肉詰め",
				"	 豚キムチ",
				"	 肉うどん",
				"	 明太子うどん",
				"	 カルボ飯",
				"	 ロールキャベツ",
				"	 和風明太子パスタ",
				"	 ペペロンチーノ",
				"	 カルボナーラ",
				"	 明太クリームパスタ",
				"	 ロースの味噌漬け焼き",
				"	 ほうれん草のクリームパスタ",
				"	 鶏肉のガーリックチーズ焼き",
				"	 豚の角煮"
				));

		Collections.shuffle(menu);

		for (int i = 0 ; i < days.size() ; i++) {
			System.out.println(days.get(i) + "曜日は");
			System.out.println(menu.get(i) + "にしましょう");
		}

	}
}
