


class MulTable{
	public static void main(String[] args){
		int result=0;
		for(int i=1;i<=9;++i){
			for(int j=1;j<=i;++j){
			result=i*j;
			System.out.printf("%d*%d=%d ",j,i,result);
         
			}
		System.out.printf("\n");
		}
	}
}