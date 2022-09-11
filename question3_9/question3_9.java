package question3_9;
import java.util.Scanner;

public class question3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int x = scan.nextInt();
		System.out.print("0=午前、1=午後、2=夜間");
		int y = scan.nextInt();

		boolean open;

		if (x == 0) {
			open = false;
		}else if((x == 2 || x == 5) && y == 0){
			open = false;
		}else if (x == 6 && y == 1) {
			open = false;
		}else if ((x == 3 || x == 6) && y == 2) {
			open = false;
		}else {
			open = true;
		}

		if (open) {
			System.out.println("開いています");
		}else {
			System.out.println("休診です");
		}

	}

}
