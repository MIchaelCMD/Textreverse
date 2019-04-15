//textReversing.java
/*This uses a user-defined method called reverse() to reverse the order of a string that the user types in
 *This program outputs to a text area so you can copy the output*/

import javax.swing.*;

public class textReversing
{
	public static void main(String[] args)
	{
		String text;
		
		text = JOptionPane.showInputDialog("Enter a piece of text");
		
		JTextArea jt = new JTextArea();
		
		jt.append(reverse(text));
		
		JOptionPane.showMessageDialog(null,jt,"Reversed Text",JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0);
	}	
		
	public static String reverse(String txt)
	{
		String reversed="";
		
		for(int i=txt.length()-1;i >= 0; i--)
		{
		   reversed+=txt.charAt(i);
		}
		
		return reversed;
		
	}
}