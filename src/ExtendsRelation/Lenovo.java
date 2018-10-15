package ExtendsRelation;
//java oop(面向对象只支持单根继承)
public class Lenovo extends Usb{
 //重写父类方法
	@Override
	public void Push(String name){
		 System.out.println(name+"正在充电");
	 }
	public static void main(String[] args) {
		String name = "华为手机";
		//向上造型 把子类对象强制指向一个父类引用
		Usb usb = new Lenovo();
		usb.Push(name);
	}
}
