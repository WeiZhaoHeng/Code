#include <stdio.h>
#include <stdbool.h>

int main()
{
	int ar[] = { 3, 7, 9, 2, 6, 8, 1, 5, 35, 21, 34, 17 };
	int i = 0, n;
	n = sizeof(ar) / sizeof(int);
	do
	{
		printf("%d\n", ar[i]);
		++i;
	} while (i < n);
	return 0;
}


/*
{
	int ar[] = { 3, 7, 9, 2, 6, 8, 1, 5, 35, 21, 34, 17 };
	int i=0, n;
	n = sizeof(ar) / sizeof(int);
	while (i < n)
	{
		printf("%d\n", ar[i]);
		i++;
	}
	return 0;

}




#include <stdio.h>
#include <stdbool.h>

int main()
{
	int ar[] = { 3, 7, 9, 2, 6, 8, 1, 5, 35, 21, 34, 17 };
	int i,n;
	n = sizeof(ar) / sizeof(int);
	for (i = 0; i < n; ++i)
		printf("%d\n", ar[i]);
	return 0;
}
*/


/*
{
	int year, month;
	printf("��������ݺ��·�-->");
	scanf("%d %d", &year, &month);
	if ((year % 4 == 0 && year % 100!=0) || year % 400 == 0)
	{
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			printf("������31��\n");
		case 4:
		case 6:
		case 9:
		case 11:
			printf("������30��\n");
		case 2:
			printf("������29��");
		}
	}
	else
	{
		switch (month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			printf("������31��\n");
		case 4:
		case 6:
		case 9:
		case 11:
			printf("������30��\n");
		case 2:
			printf("������28��");
		}
	}
	return 0;

}

{
	float a;
	printf("������һ���ٷ��Ƶ���-->");
	scanf("%f", &a);
	while(a > 100 || a < 0)
	{
		printf(" �����������������-->");
		scanf("%f", &a);
	}
    if (a >= 90)
		printf("�������ȼ�ΪA\n");
	else if (a<90&&a>=80)
		printf("�������ȼ�ΪB\n");
	else if (a<80&&a>=70)
		printf("�������ȼ�ΪC\n");
	else if (a<70&&a>=60)
		printf("�������ȼ�ΪD\n");
	else
		printf("�������ȼ�ΪE\n");
	return 0;


}


{
    #if 0
	printf("%d\n", sizeof(bool));
	printf("%d\n", sizeof(char));
	printf("%d\n", sizeof(short));
	printf("%d\n", sizeof(int));
	printf("%d\n", sizeof(long));
	printf("%d\n", sizeof(float));
	printf("%d\n", sizeof(long long));
	printf("%d\n", sizeof(double));
	return 0 ;
	#endif
	printf("hah");
}



{
	printf("Hello C\n");
	printf("Hello Bit\n");
	printf("Hello World\n");
	return 0;
}

{
	int a;
	printf("������һ����-->");
	scanf("%d", &a);
	if (a)
	{
		printf("haha");
	}
	else
	{
		printf("zeinima");
	}
	return 0;
}







{
	//printf("C:\\code\\test.c\n");
	int i,sum=0;
	for (i = 0; i < 100; i++)
	{ 
		sum = sum + i;
		printf("\a" );
	}
	return 0;
}



{
	char ch1[] = "bit";
	char ch2[] = { 'b', 'i', 't','\0' };
	char ch3[] = { 'b', 'i', 't', '\0','b','i','t' };
	printf("%s\n%s\n%s\n", ch1, ch2, ch3);
	return 0; 
}

/*

{
	int a = 12;
	int b = 12;
	int sum;
	sum = a + b;
	printf("sum=%d\n", sum);
	return 0;
}
/*
{
	printf("%d\n",sizeof(char));
	printf("%d\n", sizeof(short));
	printf("%d\n", sizeof(int));
	printf("%d\n", sizeof(long));
	printf("%d\n", sizeof(float));
	printf("%d\n", sizeof(long long)); 
	printf("%d\n", sizeof(double));
	printf("%d\n", sizeof(long double));
	
	return 0;
}
*/