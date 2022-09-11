package question4_12;
import java.util.Scanner;
public class Question4_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		
		while(sum < 100) {
			Scanner scan = new Scanner(System.in);
			System.out.print("数字を入力してください");
			int x = scan.nextInt();
			
			sum = sum +x;
		}
		System.out.println(sum);
	}

}
