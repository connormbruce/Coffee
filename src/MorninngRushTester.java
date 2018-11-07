import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class MorninngRushTester 
{	
	private static final int DELAY = 1000;

	public MorninngRushTester() 
	{
	}
	
	public static void main(String[] args) 
	{
		class DrinkCoffee implements ActionListener
		{
			private int gulps;
			
			public DrinkCoffee(int inGulps)
			{
				gulps = inGulps;
			}
			
			@Override
			public void actionPerformed(ActionEvent evemt) 
			{
				if(gulps > 0)
				{
					System.out.println(gulps);
					--gulps;
				}
				else if(gulps == 0)
				{
					System.out.println("Go to school");
					System.exit(0);
				}
			}		
		}
		
		DrinkCoffee dc = new DrinkCoffee(5);
		Timer t = new Timer(DELAY, dc);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Make another");
		System.exit(0);
	}
}
