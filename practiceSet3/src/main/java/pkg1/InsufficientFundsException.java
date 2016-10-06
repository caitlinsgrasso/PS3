package pkg1;

public class InsufficientFundsException extends Exception {
	
	private double withdrawAmount;
	
	public InsufficientFundsException(double withdrawAmount){
	      this.withdrawAmount = withdrawAmount;
	   } 
	
	   public double getwithdrawAmount(){
	      return withdrawAmount;
	   }
}