package ExtendsRelation;
//java oop(�������ֻ֧�ֵ����̳�)
public class Lenovo extends Usb{
 //��д���෽��
	@Override
	public void Push(String name){
		 System.out.println(name+"���ڳ��");
	 }
	public static void main(String[] args) {
		String name = "��Ϊ�ֻ�";
		//�������� ���������ǿ��ָ��һ����������
		Usb usb = new Lenovo();
		usb.Push(name);
	}
}
