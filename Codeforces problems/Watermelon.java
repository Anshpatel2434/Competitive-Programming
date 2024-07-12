import java.util.*;
public class Watermelon{
public static void main(String []args){
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
sc.close();	
double w=Double.parseDouble(s);
if(w>2)
	{
		for(double i=1.0;i<=w;i++)
			{
				count++;
				if(w/i==2.0)
					{
						System.out.println("YES");
						break;
					}
			}
		if(count==w)
			{
				System.out.println("NO");
			}
	}
}
}