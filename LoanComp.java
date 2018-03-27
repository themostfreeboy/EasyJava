import java.io.*;
public class LoanComp
{
	public static void main(String[] args)
	{
		double loan=0.0,ratio=0.0,monthlyPay=0.0,totalPay=0.0;
		int year=0;
		System.out.println("Enter loan:");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in),1);
		try
		{
			loan=Double.parseDouble(br.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		if(loan<=0)
		{
			System.exit(0);
		}
		System.out.println("Enter year(7,15,30):");
		try
		{
			year=Integer.parseInt(br.readLine());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		if(year==7)
		{
			ratio=0.0725/12;
		}
		else if(year==15)
		{
			ratio=0.085/12;
		}
		else if(year==30)
		{
			ratio=0.09/12;
		}
		else
		{
			System.exit(0);
		}
		monthlyPay=loan*ratio/(1-(Math.pow(1/(1+ratio),year*12)));
		totalPay=monthlyPay*year*12;
		System.out.println("Monthly pay is:"+monthlyPay);
		System.out.println("Total pay is:"+totalPay);
	}
}
