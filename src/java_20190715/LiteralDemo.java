package java_20190715;
public class LiteralDemo {
	public static void main(String[] args) {
		//byte ������ �Ѿ�� ������ �����߻�
		byte c2 = (byte)128;
		System.out.println(c2);
		//byte a1 = 128;
		int c1 = 128;
		System.out.println(c1);
		
		
int a1 = 128;//10���� ǥ���
int a2 = 076;//8���� ǥ���
int a3 = 0x123;//16���� ǥ���

System.out.println(a1);
System.out.println(a2);
System.out.println(a3);

//int a4 = 22000000000;
long a4 = 22000000000l;
//long ���ͷ��� ���ڵڿ� l, L�� ǥ����.
		
		
float f1 = 1234.43f;
//float ���ͷ��� �Ҽ��� �ڿ� f,F�� ǥ����
double d1 = 123455.56d;
//double ���ͷ��� �Ҽ��� �ڿ� d,D�� ǥ��, ��������  
//d�ȳ����� �ڵ� double �ν�

//boolean ���ͷ���  true, false

boolean isExisted = false;



a1 = 10;
d1 = 10.0d;
	// primitive data type�� == �����ڴ� ���� ����.
	System.out.println(a1==d1);
int b1 = 10;
int b2 = b1;
b2 = 20;
System.out.println(b1);
System.out.println(b2);
}
}