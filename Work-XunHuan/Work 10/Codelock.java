import java.util.Scanner;

public class Codelock{
	public static int code(int num,int count){//判断密码是否正确的方法
			if(num==1234){//正确密码位1234
				System.out.println("密码正确");
				count=3;//密码正确直接让count=3，跳出主方法的循环
			}else
				 count++;//count计数，计算你输密码的次数
			 return count;
		}
	public static void main(String[] args){
		int count=0;
		while(count!=3){//当输入3次错误密码或者输入正确，count=3，跳出循环
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你的密码：");
			int num = sc.nextInt();
			count=code(num,count);
		}
		System.out.println("退出程序");
	}
}
	