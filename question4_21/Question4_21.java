package question4_21;
import java.util.Scanner;
public class Question4_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数字を入力してください");
		int size = scan.nextInt();
		int d1 = 1;
		int d2 = size;
		
		
		for (int i = 1 ; i <= size ; i++ ) {
			for (int x = 1; x <= size; x++) {
			if (x == d1|| x == d2) {
				System.out.print("X");
			}else {
				System.out.print(" ");
			}
			}
			d1 ++;
			d2 --;
			System.out.println();
		}
		
	}

}
