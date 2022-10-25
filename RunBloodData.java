import java.util.Scanner;
public class RunBloodData{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String bt,rh;
		BloodData bd = new BloodData();
		System.out.print("Enter blood type of patient:");
		String input1 =scan.nextLine();
		System.out.print("Enter the Rhesus factor (+ or -):");
		String input2 =scan.nextLine();
		
		if(input1.isEmpty()){
			if(input2.isEmpty()){
				bd.display();
			}
			else{
				System.out.print("Sorry Invalid");
			}
		}
		else if (input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
				bd.setBloodType(input1);
				bd.setRhFactor(input2);
				bd.display();
			}
			else{
				System.out.print("Sorry Invalid");
			}
		}
		else if (input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
				bd.setBloodType(input1);
				bd.setRhFactor(input2);
				bd.display();
			}
			else{
				System.out.print("Sorry Invalid");
			}
			
		}else{
			System.out.print("Sorry Invalid");
		}
	}
}

