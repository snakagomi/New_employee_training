package question4_16;
import java.util.Scanner;
public class Question4_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数字を入力してください");
		int value = scan.nextInt();
		
		int i =2;
		while(value >1) {
			if(value % i == 0) {
			value = value / i;
			System.out.print(i + " ");
			}
			else {
			i++;
			}
		}
		

	}

}
