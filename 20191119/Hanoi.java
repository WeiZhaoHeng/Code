//汉诺塔 ----->太难了
import java.util.Scanner;
public class Hanoi{
	public static void move(char pos1,char pos2){
		System.out.println(pos1+"->"+pos2);
	}
	public static void hanota(int n,char pos1,char pos2,char pos3){
		if(n==1){
			move(pos1,pos3);
		}else{
			hanota(n-1,pos1,pos3,pos2);
			move(pos1,pos3);
			hanota(n-1,pos2,pos1,pos3);
		}
	}
	
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int n = sc.nextInt();
		hanota(n,'A','B','C');
	}
}