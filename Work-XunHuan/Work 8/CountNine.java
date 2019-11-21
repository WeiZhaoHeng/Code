import java.util.Scanner;
//求解1~100中9出现的次数
/*
	a = num%10;
	if(a==9){
		count++;
	}
	num = num/10;//判断完后进入下一位
*/
class CountNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字作为起始段：");
		int num1 = sc.nextInt();
		System.out.println("请输入一个数字作为终止段：");
		int num2 = sc.nextInt();
	
		int sum=0;
		int a=0;
		for(int i=num1;i<=num2;++i){//从起始位置开始遍历	
			int count=0;
			int tmp=i;
			while(tmp !=0){
				a = tmp %10;
				if(a==9){
					count++;
				}
				tmp =tmp /10;
			}
			sum=sum+count;
		}
		System.out.println("该区间内共有"+sum+"个9");
		sc.close();
	}
}



//一下程序是计算输入一个数字计算里面9的个数
/*
class CountNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = sc.nextInt();
		int a=0;//定义一个a，用来接收num每一位的数字
		int count=0;//定义一个count，来计数
		while(num!=0){//判断条件，把每一位拿出来看是不是9，若是则+1；
			a = num%10;
			if(a==9){
				count++;
			}
			num = num/10;//判断完后进入下一位
		}
		System.out.println("num中有"+count+"个9");
		sc.close();
}
}
*/