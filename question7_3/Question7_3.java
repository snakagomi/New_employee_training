package question7_3;

public class Question7_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog myDog = new Dog();
		myDog.SetName("ジュエル");
		myDog.SetAge(11);
		myDog.ShowProfile();
		
		Dog myPero = new Dog();
		myPero.SetName("ラムネ");
		myPero.SetAge(3);
		myPero.ShowProfile();
	}
}

class Dog
{
    private String Name;
    private int Age;

    public void SetName( String nm )
    {
        Name = nm;
    }
    
    public void SetAge(int ag) {
    	this.Age = ag;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + this.Name + "です。" );
        System.out.println("年齢は、" + this.Age + "歳です。");
    }
}

