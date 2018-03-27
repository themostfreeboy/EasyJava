public class PrintMult
{
	public static void main(String[] args)
	{
		int i=0,j=0;
		System.out.println("                   Multiple table");
		System.out.println("--------------------------------------------------------");
		System.out.print("  | ");
		for(i=1;i<=9;i++)
		{
			System.out.print("   "+i+"  ");
		}
		System.out.println("");
		for(i=1;i<=9;i++)
		{
			System.out.print(i+" | ");
			for(j=1;j<=9;j++)
			{
				System.out.printf("  %2d  ",i*j);
			}
			System.out.println("");
		}
	}
}
