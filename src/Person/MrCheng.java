package Person;
//java���������
//���������������:��װ,�̳�,��̬
public class MrCheng {
	//��װ��̬����()
	private static String name="";
	private String age;
	private static String[] str =new String[]{"����","www"};
	//������
	//����(�����ȸ�)
	int flag = 0;
	//��װ������Ϊ(�ɶ���)[����]
	//���������ɲ���(�������η�+����ֵ����+������+�����б�[����Ϊ��]+������)
	public int Eat(String name){
		int Count = 2;
		return Count;
	}
	//����ֵΪ��(void)�ĺ���
	public void Sleep(String name){
		System.out.println(name+"����˯��");
	}
	public void PublicCode(String username,String pass){
		for (int i = 0; i < str.length; i++) {
			flag++;
			System.out.println("������((("+flag);
			//�ڶ���for
			if(flag>1){
				String passwrd = str[flag];
				if(!passwrd.equals(pass)){
					System.out.println("�������");
				}
				else{
					System.out.println("������ȷ!!!");
				}
			}
			//��һ��forѭ��
			else{
				//�û�������
				if(!username.equals(str[i])){
					System.out.println("�û�������");
				}
				else{
					System.out.println("�û�����ȷ");
				}
			}
		}
	}
	//�����ַ������� ��֤��¼��Ϣ�ĺϷ���
	public String[] LoginMeg(String[] str){
		String username = "����";
		String pass = "www";
		PublicCode(username,pass);
		return str;
		
	} 
	//���Է���(����)
	public static void main(String[] args) {
		//��������(1.�������� 2.�������õ��ö��󷽷�)
		MrCheng cheng = new MrCheng();
		int amount = cheng.Eat("����");
		System.out.println(amount);
		name ="����";
		cheng.Sleep(name);
		cheng.LoginMeg(str);
	}
}
