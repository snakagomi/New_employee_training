package question7_1;

public class Question7_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Dog myDog = new Dog();
		myDog.SetName("jewel");
		myDog.ShowProfile();

	}

}

class Dog
{
    private String Name;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + this.Name + "です。" );
    }
}