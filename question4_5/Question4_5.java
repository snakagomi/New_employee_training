package question4_5;
import java.util.Scanner;

public class Question4_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("数字を入力してください");
			int x = scan.nextInt();
			
			sum = sum + x;
		}
		System.out.println(sum / 10);
	}

}
