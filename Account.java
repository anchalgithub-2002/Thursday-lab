class Account{
	private long acc_no;
	private String name,email;
	private float amount;
	
	public long getAcc_no();{
		return acc_no;
	}
	public void setAcc_no(long acc_no){
		this.acc_no=acc_no;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public string getemail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public float getAmount(){
		return Amount;
	}
	public void etAmount(float amount){
		this.amount=amount;
	}
	public static void main(String args[])
	{
		Account myAc=new Account;
		myAc.setAcc_no(234522674);
		myAc.setName("reena");
		myAc.setemail("rena123@gamil.com");
		myAc.setAmount(23000);
		System.out.println("Account no:"+myAcc.getAcc_no()+" "+"Account name:"
		      +myAcc.getName()+"Account holder email:"+myAcc.getemail()+"Amount in account"
			  +myAcc.getAmount());
	}
}