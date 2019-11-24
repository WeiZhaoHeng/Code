import java.util.Scanner;

class FindPrime{
	public static void main(String[] args){
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数作为起始位置：");
		int num1 = sc.nextInt();
		System.out.println("请输入一个正整数作为结束位置：");
		int num2 = sc.nextInt();
		for(int i=num1;i<=num2;++i){   //从num1开始遍历直到num2结束
			a=0;
			for(int j=2;j<i;++j){//判断是否为 素数
				if(i%j==0){
					a++;
				}				
			}
			if(a==0){
				System.out.printf("%d\t",i);
			}
		}
		System.out.printf("\n");
		sc.close();
	}
}