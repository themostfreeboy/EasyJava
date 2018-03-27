import javax.swing.JOptionPane;
public class Time
{
	public static void main(String[] args)
	{
		long totalMilliseconds=System.currentTimeMillis();
		long totalSeconds=totalMilliseconds/1000;
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
		JOptionPane.showMessageDialog(null,"Current time is "+time);
	}
}