package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '\uAE40';
		char c2 = '\uBBFC';
		char c3 = '\uCCA0';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//char literal�� �ƽ�Ű�ڵ� ǥ�� => 65
		
		char c4 = 65;
		System.out.println(c4);

		//char literal�� ����ǥ�� => ''
		
		char c5 = 'q';
char c6 = '"'; //escape character(���� �ν� x)

String path = "C:\\\"dev\"\\eclipse";
String path1 = "aa\ncc";

//Ư������
//\n => ����
//\t => tab
//\\ => back slash
//\' => single quotation
//\" => double quotation

System.out.println(path);

}


double d1 = 123.12f;}
//�տ� ����ȯ Ÿ��Ʋ�� �޾��ָ� ��
