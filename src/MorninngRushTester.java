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
		final int initalGulps = 5;
		
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
				}
				
				else if(gulps == 0)
				{
					System.out.println("Go to school");
					JOptionPane.showMessageDialog(null, "Make another?");
					gulps = initalGulps;
				}
				
				--gulps;
			}		
		}
		
		DrinkCoffee dc = new DrinkCoffee(initalGulps);
		Timer t = new Timer(DELAY, dc);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Just about to go to school");
		System.out.println("Just about to go to school");
		System.exit(0);
	}
}
