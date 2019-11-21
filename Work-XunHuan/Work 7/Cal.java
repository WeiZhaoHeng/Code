
class Cal{
	public static void main(String[] args){
		double num1=0.0,num2=0.0;
		double temp1=0.0,temp2=0.0;
		double x=-1.0;
		double y=1.0;
		for(int  i=1;i<=100;++i){//遍历分母
			if(i%2==0){//如果分母是偶数，给该分数取个负数
				y=i*x;
				temp1=1/y;
				num1=num1+temp1;
			}else{//如果分母是奇数，正常输出
				y=i;
			temp2=1/y;
			num2=num2+temp2;
			}
		}
		System.out.println(num1+num2);//将负数部分和正数部分相加  
	}
}