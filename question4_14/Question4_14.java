package question4_14;
import java.util.Scanner;
public class Question4_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int strike = 0;
		int ball = 0;
		int faul = 0;
		
		while (strike < 3 && ball < 4) {
			System.out.print("ストライク=1 or ボール=2 or ファール=3 ");
			int x = scan.nextInt();
			
			
			if (x == 1) {
				strike ++;
			}
			else if (x == 2) {
				ball ++;
			}else if (x == 3) {
				if (strike < 2) {
					strike ++;
				}else if (strike == 2) {
					strike = strike;
				}
			}
		}
		System.out.println(strike + "ストライク、" + ball + "ボール");
	}

}
