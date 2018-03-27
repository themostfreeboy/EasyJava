import javax.swing.JOptionPane;
public class TimeShowPane 
{
	public static void main(String[] args)
	{
		long oldtime=System.currentTimeMillis()/1000;
		long newtime=System.currentTimeMillis()/1000;
		while(true)
		{
		       newtime=System.currentTimeMillis()/1000;
		       long totalSeconds=newtime;
		       long currentSecond=totalSeconds%60;
		       long totalMinutes=totalSeconds/60;
		       long currentMinute=totalMinutes%60;
		       long totalHours=totalMinutes/60;
		       long currentHour=(totalHours+8)%24;
		       String time;
		       if(currentHour<10)       time="0"+currentHour+":";
		               else             time=currentHour+":";
		       if(currentMinute<10)     time=time+"0"+currentMinute+":";
                       else             time=time+currentMinute+":";
		       if(currentSecond<10)     time=time+"0"+currentSecond+"\n";
                       else             time=time+currentSecond+"\n";
		       if(newtime!=oldtime)
		       {
                                time="Current time is "+time;
		                JOptionPane.showMessageDialog(null,time);
		                oldtime=newtime;
		       }
		}
	}
}

