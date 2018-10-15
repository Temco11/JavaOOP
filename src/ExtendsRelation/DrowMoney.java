package ExtendsRelation;

public class DrowMoney extends DrowMachine{
	public DrowMoney(String idCard, double money) {
		super(idCard, money);
	}
   @Override
 //取钱
 	public double Drow(String IdCard,double Money,int amount,int Account){
 		double count =Money-amount; //余额
 		if(IdCard.endsWith("中国建设银行")||IdCard.equals("中国农业银行")){
 			System.out.println("请取款!!");
 			System.out.println("取"+amount+"元！！");
 			System.out.println("当前卡余额:"+count);
 		}
 		else{
 			System.out.println("请插入银联卡wo!!!");
 		}
 		if(count<1){
 			System.out.println("当前您的卡余额:"+count);
 			System.out.println("余额不足!!请存款!!");
 			SaveMon(Account, count);
 		}
 		return count;
 	}

   public static void main(String[] args) {
	   DrowMoney drow = new DrowMoney("中国建设银行",10000.09);
		drow.Drow(IdCard, Money, 10000,90000);
}
}
