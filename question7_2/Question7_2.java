package question7_2;

public class Question7_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog myDog = new Dog();
		myDog.SetName("jewel");
		myDog.SetAge(11);
		myDog.ShowProfile();

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
