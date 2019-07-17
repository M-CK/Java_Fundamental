package java_20190716;

public class BreakDemo {
	//Ctrl C + V 로 복사후에 이름을 바꾸면 자동으로 class 이름이 바뀜(f2도 같음)
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;
			sum = sum + i;
		}
		//break lable
		System.out.printf("1부터 5까지 합은 %d 입니다.%n",sum);
		outter:for (int first = 2; first<=9; first++) {
			for (int second = 1; second<=9; second++) {
			if(first==4 && second==8) break ;
				System.out.printf("%d&%d = %d%n", first, second, first*second);
			}
			System.out.println();
		}

		for (int first = 2; first <= 9; first++)
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d\n", first, second, first * second);
			}
	}

}

