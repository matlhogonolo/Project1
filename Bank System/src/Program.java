
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Account savingacc = new SavingsAcc();
		Account currentacc = new CurrentAcc();
		
		savingacc.setAccount_holder("Matlhogoolo");
		savingacc.setAccount_number(45324);
		
		savingacc.deposite(3400);
		savingacc.withdraw(800);
		System.out.println(savingacc.toString());

		
		currentacc.deposite(3400);
		currentacc.withdraw(800);
		//System.out.println(currentacc.toString());
	}

}
