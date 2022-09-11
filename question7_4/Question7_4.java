package question7_4;

public class Question7_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog myDog = new Dog("ヨークシャーテリア");
		myDog.SetName("ジュエル");
		myDog.SetAge(11);
		myDog.ShowProfile();
		
		Dog myPero = new Dog("ヨークシャーテリア");
		myPero.SetName("ラムネ");
		myPero.SetAge(3);
		myPero.ShowProfile();
		
		Dog myChien = new Dog ("柴犬");
		myChien.SetName("りゅう");
		myChien.SetAge(14);
		myChien.ShowProfile();
	}
}

class Dog
{
    private String Name;
    private int Age;
    private String DogKind;
    
    public Dog(String dk){
    	this.DogKind = dk;
    }
    
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
        System.out.println("犬種は、" +this.DogKind + "です。");
    }
}
