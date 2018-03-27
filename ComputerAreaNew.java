import javax.swing.JOptionPane;
public class ComputerAreaNew 
{
	  public static void main(String[] args)
	  {
		  final double PI=3.14159265;
		  double radius=0,area;
		  radius=Double.parseDouble(JOptionPane.showInputDialog("Please input the radius"));
		  area=PI*radius*radius;
		  JOptionPane.showMessageDialog(null, "The area is "+area);
	  }
}
