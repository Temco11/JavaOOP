package ExtendsRelation;
//����(��������һ������Ľӿ�)
public abstract class DrowMachine {
	public static String IdCard;//������
	public static double Money;//�����
	//�������Ĺ��췽��
	public DrowMachine(String idCard, double money) {
		super();
		//������ʼ��
		IdCard = idCard;
		Money = money;
	}
	//ȡǮ
	public abstract double Drow(String IdCard,double Money,int amount,int Account);
	//��Ǯ
	public  static double SaveMon(int Account,double count) {
		double FinMoney = Account+count;//��Ǯ
 		System.out.println("��ǰ���:"+FinMoney+"Ԫ");
 		return FinMoney;
	}
}
