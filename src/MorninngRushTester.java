import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MorninngRushTester 
{	
	JFrame frame = new JFrame();
	JButton button = new JButton("Add Coffee");
	
	private static final int DELAY = 1000;

	final static int initalGulps = 5;
	
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
				}
				else if(gulps == 0)
				{
					System.out.println("Go to school");
					JOptionPane.showMessageDialog(null, "Make another");
					gulps = initalGulps;
					System.exit(0);
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
