import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;
//判断年龄
public class HomeWork {
    public static void printAge(int age){
        if(age<=18){
            System.out.println("少年");
        }else if(age>=19&&age<=28){
            System.out.println("青年 ");
        }else if(age>=29&&age<=55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }

    //判断是否是素数
    //1.n： 只能被1和本身整除（1和n）-->不能被2~n-1之间的任何数整除
    public static boolean isPrime1(int n){
        for (int i=2;i<n;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //2.n=a*b,如果n不是素数那么他除1之外的因数中必有一个小于n/2；
    public static boolean isPrime2(int n){
        for (int i=2;i<=n/2;++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //3.n=a*b,如果n不是素数那么他除1之外的因数中必有一个小于  根号n；
    public static boolean isPrime3(int n){
        for (int i=2;i<Math.sqrt(n);++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //判断是否是闰年
    public static boolean isLeapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            return true;
        }
        return false;
    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static double sumN(int n){
        double sum=0.0;
        int flg = 1;
        for (int i=1;i<=n;i++){
            sum+=1.0/i*flg;
            flg=-flg;
        }
        return sum;
    }

    //求0~999999之间的所有水仙花并输出
    public static void waterFlower(int n){
        for(int i=0;i<=n;i++){//求输入的数字的位数
            int count = 0;//给位数计数
            int tmp = i;
            while(tmp!=0){
                count++;
                tmp/=10;
            }//count里面保存的就是当前数字i的位数
            tmp =i;
            //求tmp每一位上的数字
            //123    123%10=3   123/10%10=2
            //12/10%10=1    1/10=0
            int sum=0;//次方的和
            while(tmp!=0){
                sum+=Math.pow(tmp%10,count);//Math.pow()-->计算数字的立方
                tmp = tmp/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }

    }

    //编写程序数一下 1到 100 的所有整数中出现多少个数字9。
    public static int countNine(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        return count;
    }

    //输入3次密码
    public static void codeLock(){
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count!=0){
            System.out.println("请输入 你的密码");
            String password = sc.nextLine();
            if("abcde".equals(password)){//判断两个字符串是否相等 --->第一个字符串.equals（第二个字符串）
                System.out.println("密码正确！");
                break;
            }else{
                System.out.println("密码错误");
                count--;
            }
        }
    }

    public static void main1(String[] args) {
        codeLock();
    }

    //计算一个数字化为二进制中 1 的个数
    public static int numberOfOne(int num){
        int count = 0;
        while(num!=0){
            count++;
            num = num &(num-1);
        }
        return count;
    }

    public static int numberOfOne1(int num){
        int count = 0;
        while(num!=0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }
        return count;
    }

    //使用位运算求两个数的平均值
    public static int avg(int a,int b){
        return ((a&b)) + ((a^b)>>1);
    }
    //分别输出一个数二进制数中奇数位的数字，与偶数位的数字
    public static void printNum(int n){
        for(int i=31;i>=1;i-=2){
            System.out.print(((n>>i)&1) + " ");
        }
        System.out.println();
        System.out.println("===============================");
        for(int i=30;i>=0;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
    }

    public static void main(String[] args){
        printNum(6);
        //System.out.println(avg(7,7));
    }

    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num =  sc.nextInt();
        int a = numberOfOne1(num);
        System.out.println(a);
    }
}


