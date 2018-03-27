import java.util.Scanner;
public class ComputerArea
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double area;
		final double PI=3.1415926535897932;
		double radius;
		radius=0;
		radius=input.nextDouble();
		area=PI*radius*radius;
		System.out.println("area="+area);
	}
}
