// Creating the GUI Application

// Importing the necessary libraries
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class gui {
	
	private static void GUIComponents()
	{
		
		// Initializing the variables for user input
		int age = 0;
		Scanner scan = new Scanner(System.in);
		
		// Gathering the user input
		System.out.print("Enter the current year: ");
		int currentYear = scan.nextInt();
		System.out.print("Enter your birth year: ");
		int birthYear = scan.nextInt();
		
		// Calculating the Age
		age = (currentYear - birthYear);
		System.out.print("Your age is: " + age);
		
		// Creating the JFrame
		JFrame myFrame = new JFrame("Calculate Age");
		
		// Setting the size of the frame
		final int F_WIDTH = 500;
		final int F_HEIGHT = 500;
		myFrame.setSize(F_WIDTH, F_HEIGHT);
		
		// Initializing the name of the frame and establishing visibility
		myFrame.setTitle("Calculate Your Age");	
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		JButton myButton = new JButton("Click here to Calculate!");
		myButton.setBounds(50, 100, 95, 30);
		myFrame.add(myButton);
		
		// Creating the Panel
		/*
		JPanel mypanel = new JPanel();
		mypanel.add(mybutton);
		mypanel.add(mylabel);
		add(mypanel);
		*/
	}
		 
	
	public static void main(String[] args)
	{
		GUIComponents();
	}

}
