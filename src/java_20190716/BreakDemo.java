package java_20190716;

public class BreakDemo {
	//Ctrl C + V �� �����Ŀ� �̸��� �ٲٸ� �ڵ����� class �̸��� �ٲ�(f2�� ����)
	
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i==6) break;
			sum = sum + i;
		}
		//break lable
		System.out.printf("1���� 5���� ���� %d �Դϴ�.%n",sum);
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

