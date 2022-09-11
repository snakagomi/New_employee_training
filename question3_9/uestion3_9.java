package question3_9;
import java.util.Scanner;
public class uestion3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x = scan.nextInt();
		System.out.print("0=午前、1=午後、2=夜間");
		int y = scan.nextInt();
		
		if (y == 0 &&( x == 0 || x == 2 || x == 5)){
			System.out.println("休診です");
		}else if (y == 1 &&( x == 0 || x == 6)) {
			System.out.println("休診です");
		}else if (y == 2 && (x == 0 || x == 3 || x == 6)) {
			System.out.println("休診です");
		}else {
			System.out.println("開いています");
		}

	}

}
