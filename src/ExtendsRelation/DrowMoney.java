package ExtendsRelation;

public class DrowMoney extends DrowMachine{
	public DrowMoney(String idCard, double money) {
		super(idCard, money);
	}
   @Override
 //ȡǮ
 	public double Drow(String IdCard,double Money,int amount,int Account){
 		double count =Money-amount; //���
 		if(IdCard.endsWith("�й���������")||IdCard.equals("�й�ũҵ����")){
 			System.out.println("��ȡ��!!");
 			System.out.println("ȡ"+amount+"Ԫ����");
 			System.out.println("��ǰ�����:"+count);
 		}
 		else{
 			System.out.println("�����������wo!!!");
 		}
 		if(count<1){
 			System.out.println("��ǰ���Ŀ����:"+count);
 			System.out.println("����!!����!!");
 			SaveMon(Account, count);
 		}
 		return count;
 	}

   public static void main(String[] args) {
	   DrowMoney drow = new DrowMoney("�й���������",10000.09);
		drow.Drow(IdCard, Money, 10000,90000);
}
}
