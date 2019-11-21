import java.util.Scanner;
//判断一个数字是否是水仙花(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本
//身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)

//输出0~999间的水仙花   
class NarNumber{
	public  static void main(String[] args){
		int finish = 1000;
		int a=0;
		int tmp=0;
		for(int i=1	;i<finish;++i){
			if(i<99){
				continue;
			}else{
			tmp= i;
			int sum=0;
			int pro=0;
			while(tmp!=0){
				a = tmp%10;
				pro = a*a*a;
				sum=sum+pro;
				tmp = tmp/10;
			}
			if(i==sum){
				System.out.println(i);
			}
			}
		}
	}
}
/*
class NarNumber{
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int num = sc.nextInt();
		int tmp=num;
		int a=0;
		int sum=0;
		int pro=0;
		while(num!=0){
			a = num %10;
			pro = a*a*a;
			sum=sum+pro;
			num=num/10;
		}
		if(tmp==sum){
			System.out.println("该数字是水仙花");
		}else{
			System.out.println("该数字不是水仙花");
		}
		sc.close();
	}
}
*/