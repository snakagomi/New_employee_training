package question;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("何月ですか？");
		int month = scan.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
			System.out.println("31日です");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30日です");
			break;
		case 2:
			System.out.println("28日です");
			break;
		default:
			System.out.println("入力が間違っています");
			break;
		}
		
		
		

	}

}
