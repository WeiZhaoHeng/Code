//闰年的判断条件((year%4==0 && year%100!=0) || (year%400==0))

import java.util.Scanner;

class Year{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数作为起始位置：");
		int num1 = sc.nextInt();
		System.out.println("请输入一个正整数作为结束位置：");
		int num2 = sc.nextInt();
		for(int year=num1;year<=num2;++year){
			if((year%4==0 && year%100!=0) || (year%400==0)){
				System.out.printf("%d\t",year);
			}

		}
		System.out.printf("\n");
		sc.close();
	}
}
