import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num = sc.nextInt();
		for(int i=2;i<num;++i){
			if(num%i==0){
				a++;
			}
		}
		if(a==0){
			System.out.println(num+"是素数");
		}else{
			System.out.println(num+"不是素数");
		}
		sc.close();
	}
}