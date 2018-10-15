package ExtendsRelation;
//子类继承父类(oop编程的第二大特征)
public class Dog extends Animal{
	@Override
	public void Jump(String color,String brand){
		System.out.println(brand+"品种的"+color+"的狗在疯狂的跳!!!");
	}
	public static void main(String[] args) {
		String color = "黑色";
		String brand = "阿拉斯加";
		Dog dog = new Dog();
		dog.Jump(color, brand);
	}
}
