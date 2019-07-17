package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		char c1 = '\uAE40';
		char c2 = '\uBBFC';
		char c3 = '\uCCA0';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		//char literal의 아스키코드 표현 => 65
		
		char c4 = 65;
		System.out.println(c4);

		//char literal의 문자표현 => ''
		
		char c5 = 'q';
char c6 = '"'; //escape character(문자 인식 x)

String path = "C:\\\"dev\"\\eclipse";
String path1 = "aa\ncc";

//특수문자
//\n => 개행
//\t => tab
//\\ => back slash
//\' => single quotation
//\" => double quotation

System.out.println(path);

}


double d1 = 123.12f;}
//앞에 형변환 타이틀을 달아주면 됨
