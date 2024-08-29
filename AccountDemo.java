

public class AccountDemo {

	public static void main(String[] args) {
		Account acc=new Account();
		
		acc.accNumber=101;
		acc.name="Ruksana";
		acc.balance=10000;
		
		System.out.println("Name:"+acc.name+"Accountno:"+acc.accNumber+"Balance:"+acc.balance);
		
		Account acc1=new Account();
		System.out.println("Name:"+acc1.name+"Accountno:"+acc1.accNumber+"Balance:"+acc1.balance);
		
		Account acc2=new Account(202,"sana",12000);
		System.out.println("Name:"+acc2.name+"Accountno:"+acc2.accNumber+"Balance:"+acc2.balance);

	}

}
