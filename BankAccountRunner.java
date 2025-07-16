class BankAccountRunner{
public static void main(String[]accounts){
System.out.println("main started");
//methodname();
BankAccount.credit(90000.00);
System.out.println("the current balance is"+BankAccount.balance);
BankAccount.debit(500.00);

System.out.println("the Current Balance is"+BankAccount.balance);
System.out.println("main ended");


}



}