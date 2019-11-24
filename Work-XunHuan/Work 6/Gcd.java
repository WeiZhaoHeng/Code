import java.util.Scanner;

class Gcd{
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
		for(int i=num2;i>0;--i){//按照从大到小的顺序寻炸 满足条件的数
			if(num1%i==0&&num2%i==0){
				System.out.printf("%d和%d的最大公约数为%d\n",num1,num2,i);
				break;
			}
			
		}
		sc.close();
	}
}