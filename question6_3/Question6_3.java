package question6_3;
import java.util.Scanner;
public class Question6_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数字を入力してください");
		int x = scan.nextInt();
		System.out.print("数字を入力してください");
		int y = scan.nextInt();		
		
		int z = Math.max(x, y);
		printData(z);

	}
	
	public static void printData(int c){
		System.out.println("大きいのは" + c);
	}
	public static int max(int a, int b) {
		return Math.max(a, b);
	
}
}
