import java.util.Comparator;

public class AccountBalanceDecComparator implements Comparator<Account>{

	@Override
	public int compare(Account acc1, Account acc2) {
		return acc2.getBalance()-acc1.getBalance();
		
	}
	
	
	
}
