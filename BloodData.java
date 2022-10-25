public class BloodData{
	public static void main(String [] args){
	}
	private String bloodType;
	private String rhFactor;
	public BloodData()
	{
		this.bloodType= "O";
		this.rhFactor =	"+";
	}
	public void setBloodType(String bloodType){
		this.bloodType = bloodType;		
	}
	public String getBloodType(){
		return bloodType;
	}
	public void setRhFactor(String rhFactor){
		this.rhFactor = rhFactor;
	}
	public String getRhFactor(){
		return rhFactor;
		
	}
	public void display(){
		System.out.print(bloodType+rhFactor+" is added to the blood bank.");
	}
}