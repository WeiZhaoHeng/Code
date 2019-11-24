import java.util.Scanner;

class Lcm{
	public static void main(String[] args){
		int temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = sc.nextInt();
		if(num1<num2){//比较两个数的大小，把大的给num1，小的给num2
			temp=num2;
			num2=num1;
			num1=temp;
		}
		for(int i=num1;i>0;++i){//从大数开始寻找满足条件的自然数
			if(i%num1==0&&i%num2==0){
				System.out.printf("%d和%d的最小公倍数为%d\n",num1,num2,i);
				break;
			}
			
		}
		sc.close();
	}
}