import javax.swing.JOptionPane;

/*
 * Create a program with 2 arrays:
Holds the names of the months
Holds the number of days of rainfall each month

Our program should calculate and print:
Total days of rainfall
Average days of rainfall each month
The highest number of days of rainfall in a month

 */
public class Rainfall {

	public static void main(String[] args) {
		//declare an array to hold all the months
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "Jul",
				"Aug", "Sept", "Oct", "Nov", "Dec"};
		
		//declare an array for days of rainfall each month
		int [] rainDays = new int [12];
		
		//get input
		String input;
		for (int index = 0; index < months.length; index++){
			input = JOptionPane.showInputDialog(null, 
				"How many days in " + months[index] + " did it rain?");
			rainDays[index] = Integer.parseInt(input);
		}
		
		//print each month's rainy days
		/*
		for (int index = 0; index < months.length; index++){
			JOptionPane.showMessageDialog(null, "In " + months[index]
					+ " there were " + rainDays[index] + " days of rain.");
		}
		*/
		
		//calculate average
		int sum = 0;
		for (int index = 0; index < rainDays.length; index++){
			sum += rainDays[index];
		}
		double average = sum/rainDays.length;
		JOptionPane.showMessageDialog(null, "Average is: " + average);
		
		//find the highest
		int highest = rainDays[0];
		for (int i = 0; i < rainDays.length; i++){
			if (rainDays[i] > highest){
				highest = rainDays[i];
			}
		}
		JOptionPane.showMessageDialog(null, "Highest is: " + highest);

	}

}
