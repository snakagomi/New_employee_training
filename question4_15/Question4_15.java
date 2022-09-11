package question4_15;
import java.util.Scanner;
public class Question4_15{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数字を入力してください");
		int x = scan.nextInt();
		int y = 0;
		
		for (int i = 2; i <x; i++ ) {
			if (x % i == 0) {
				y = 1;
				break;

			}	
		
		}
		if (y == 1) {
			System.out.println(x + "は素数ではありません");
		}else {
			System.out.println(x + "は素数です");
}
}
}
