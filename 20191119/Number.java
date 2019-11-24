import java.util.Scanner;
public class Number{
	public static void number(int num){//打印一个数字的每一位 
		if(num>9){
			number(num /10);
		}
		System.out.print(num%10+" ");
	}
	public static int add(int num){//1+2+3……n
		if(num==1){
			return 1;
		}
		return num+add(num-1);
	}
	public static int func(int num){//把一个数字的每一位相加
		if(num<9){
			return num;
		}
		return num%10+func(num/10);
		
	}
	//递归求斐波那契
	public static int fab1(int num){
		if(num==1||num==2){
			return 1;
		}
		return fab1(num-1)+fab1(num-2);
		
	}
	//迭代求斐波那契（循环）
	public static int fab2(int num){
		int f1=1;
		int f2=1;
		int f3=1;
		for(int i=3;i<=num;++i){
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		return f3;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = sc.nextInt();
		int result = fab2(num);
		System.out.println(result);
		
	}
}