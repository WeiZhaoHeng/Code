import java.util.Scanner;

class age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();
		if(age<=18){
			System.out.println("你是少年 ");	
		}else if(age>18&&age<=28){
			System.out.println("你是青年");
		}else if(age>28&&age<=55){
			System.out.println("你是中年");
		}else if(age>55){
			System.out.println("你是老年");
		}
		sc.close();
	}
}