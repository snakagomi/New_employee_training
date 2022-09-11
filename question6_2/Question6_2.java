package question6_2;
import java.util.Scanner;
public class Question6_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください");
		int x = scan.nextInt();
		System.out.print("数字を入力してください");
		int y = scan.nextInt();
		
		int z = avg(x,y);
		printData(z);
		
		

	}
	public static void printData(int c) {
		System.out.println("平均は" + c);
	}
	
	public static int avg(int a, int b) {
		return (a+b)/2;
	}
}
