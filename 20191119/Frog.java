import java.util.Scanner;
//青蛙跳台阶-->类似于斐波那契 
//递归法
public class Frog{
	public static int frog1(int num){
		if(num==1||num==2){
			return num;
		}
		return frog1(num-1)+frog1(num-2);	
	}
//迭代
	public static int frog2(int num){
		int f1=1;
		int f2=2;
		int f3=0;
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
		int result = frog2(num);
		System.out.println(result);
	}
}