package ExtendsRelation;
//����̳и���(oop��̵ĵڶ�������)
public class Dog extends Animal{
	@Override
	public void Jump(String color,String brand){
		System.out.println(brand+"Ʒ�ֵ�"+color+"�Ĺ��ڷ�����!!!");
	}
	public static void main(String[] args) {
		String color = "��ɫ";
		String brand = "����˹��";
		Dog dog = new Dog();
		dog.Jump(color, brand);
	}
}
