package ExtendsRelation;
//提款机(抽象类是一种特殊的接口)
public abstract class DrowMachine {
	public static String IdCard;//卡类型
	public static double Money;//卡余额
	//带参数的构造方法
	public DrowMachine(String idCard, double money) {
		super();
		//参数初始化
		IdCard = idCard;
		Money = money;
	}
	//取钱
	public abstract double Drow(String IdCard,double Money,int amount,int Account);
	//存钱
	public  static double SaveMon(int Account,double count) {
		double FinMoney = Account+count;//存钱
 		System.out.println("当前余额:"+FinMoney+"元");
 		return FinMoney;
	}
}
