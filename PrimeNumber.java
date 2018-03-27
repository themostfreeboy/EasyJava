import javax.swing.JOptionPane;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		int number,i,j,k,tag=0,primetop=0;
		int[] prime;
		String result;
		prime =new int[10000];
		number=Integer.parseInt(JOptionPane.showInputDialog("请输入要因式分解的数字"));
		result=number+"=";
		if(number==1||number==2||number==3)         result=result+number;
		for(i=2;i<=number;i++)
		{
			tag=0;
			for(j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					tag=1;
					break;
				}
			}
			if(tag==0)
			{
				prime[primetop++]=i;
			}
		}	
		for(i=2;i<=Math.sqrt(number);i++)
		{
			for(j=2;j<=Math.sqrt(number);j++)
			{
				for(k=0;k<primetop;k++)
				{
					if(number%prime[k]==0)
					{
						result=result+prime[k];
						number=number/prime[k];
						if(number!=1)
						{
							result=result+"*";
						}
						k--;
					}
					
				}
			}
		}
		result=result+"\nJXL制";
		JOptionPane.showMessageDialog(null,result,"JXL制",JOptionPane.PLAIN_MESSAGE);
	}
}
