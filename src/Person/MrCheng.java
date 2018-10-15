package Person;
//java面向对象编程
//面向对象三大特征:封装,继承,多态
public class MrCheng {
	//封装静态属性()
	private static String name="";
	private String age;
	private static String[] str =new String[]{"王蕊","www"};
	//计数器
	//解耦(颗粒度搞)
	int flag = 0;
	//封装对象行为(可动的)[函数]
	//函数五个组成部分(访问修饰符+返回值类型+函数名+参数列表[可以为空]+函数体)
	public int Eat(String name){
		int Count = 2;
		return Count;
	}
	//返回值为空(void)的函数
	public void Sleep(String name){
		System.out.println(name+"正在睡觉");
	}
	public void PublicCode(String username,String pass){
		for (int i = 0; i < str.length; i++) {
			flag++;
			System.out.println("计数器((("+flag);
			//第二次for
			if(flag>1){
				String passwrd = str[flag];
				if(!passwrd.equals(pass)){
					System.out.println("密码错误");
				}
				else{
					System.out.println("密码正确!!!");
				}
			}
			//第一次for循环
			else{
				//用户名错误
				if(!username.equals(str[i])){
					System.out.println("用户名错误");
				}
				else{
					System.out.println("用户名正确");
				}
			}
		}
	}
	//返回字符串集合 验证登录信息的合法性
	public String[] LoginMeg(String[] str){
		String username = "王蕊";
		String pass = "www";
		PublicCode(username,pass);
		return str;
		
	} 
	//测试方法(函数)
	public static void main(String[] args) {
		//方法调用(1.构建对象 2.对象引用调用对象方法)
		MrCheng cheng = new MrCheng();
		int amount = cheng.Eat("成涛");
		System.out.println(amount);
		name ="王蕊";
		cheng.Sleep(name);
		cheng.LoginMeg(str);
	}
}
