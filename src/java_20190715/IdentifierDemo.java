/*
 * //특수문자중에 $,_는 사용할 수 있음. package java_20190715; //클래스명의 첫글자는 대문자 //두단어가 합친경우에는
 * 두번째 단어의 첫글자는 대문자로 사용 //(camel case) public class IdentifierDemo { public
 * static void main(String[] args) { int age = 10; String name = "hello"; //첫글자로
 * 숫자를 사용할 수 없음 //string 1fatherName = "John"; //공백을 사용할 수 없음 //String mother
 * Name = "Michell"; //예약어는 변수(식별자)로 사용할 수 없음 //String void = "empty"; //자바는
 * 유니코드를 지원하기 때문에 한글도 식별자로 사용 //가능하지만 안쓰는게 좋음. String 이름="성영한";
 * System.out.println(이름);
 * 
 * //String father_name = "michael" = 하수 //String fatherName = "michael" = 권장
 * 
 * public class LiteralDemo { public static void main(String[] args) { //byte
 * 범위를 넘어가면 컴파일 에러발생 byte a1 = (byte)128; System.out.printin(a1); //byte a1 =
 * 128; int a1 = 128; System.out.printin(a1)
 * 
 * 
 * int a1 = 128;//10진수 표기법 int a2 = 076;//8진수 표기법 int a3 = 0x123;//16진수 표기법
 * 
 * System.out.printin(a1); System.out.printin(a2); System.out.printin(a3);
 * 
 * int a4 = 22000000000 long a4 = 22000000000l; //long 리터럴은 숫자뒤에 l, L로 표기함.
 * 
 * 
 * } }
 * 
 * } float f1 = 1234.43f; //float 리터럴은 소수점 뒤에 f,F로 표기함 double d1 = 123455.56d;
 * //double 리터럴은 소수점 뒤에 d,D로 표기, 생략가능 //d안넣으면 자동 double 인식
 * 
 * //boolean 리터럴은 true, false
 * 
 * boolean isExisted = false;
 * 
 * 
 * 
 * a1 = 10; d1 = 10.0d // primitive data type의 == 연산자는 값만 비교함.
 * system.out.println(a1==d1); int b1 = 10; int b2 = b1; b2 = 20;
 * System.out.println(b1); System.out.println(b2);
 * 
 */