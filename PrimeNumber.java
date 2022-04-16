package week1.day1.assignments;

public class PrimeNumber {
public static void main(String[] args) {
	int input=13;
	boolean flag=false;
	for (int i=2; i<=input/2;i++)
	{
		int remainder= input% i;
		if (remainder==0)
			flag= false;
		else
			flag=true;
	}
	if (flag==false)
		System.out.println("not a prime number");
	else
		System.out.println("prime number");
	
}
}