package player;
import  java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the numbers:");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
for(int i=0;i<=n;i++){
	if(i%2!=0){
		sum=sum+i;
		System.out.println(i);
	}
}
System.out.println(sum);
if(sum%2!=0){
	System.out.println("1");
}
else{
	System.out.println("-1");
}
	}

}
