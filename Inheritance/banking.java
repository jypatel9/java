class account
{
    private String account_Number;
    private String Account_HolderName;
    private String Account_HolderAddress;
    private String Account_HolderMobileNo;
    private String Account_HolderDOB;
    private double Account_Balance;

    //constructor
    public account(String ac_num,String ac_name,String ac_dob)
    {
        this.account_Number=ac_num;
        this.Account_HolderName=ac_name;
        this.Account_HolderDOB=ac_dob;
    }

    //get data property method
    public String getAccount_Number()
    {
        return account_Number;
    }
    public String getAccount_HolderName()
    {
        return Account_HolderName;
    }
    public String getAccount_HolderAddress()
    {
        return Account_HolderAddress;
    }
    public String getAccount_HolderMobileNo()
    {
        return Account_HolderMobileNo;
    }
    public String getAccount_HolderDOB()
    {
        return Account_HolderDOB;
    }
    public double getAccount_Balance()
    {
        return Account_Balance;
    }

    //set data property method
    public void setAccount_HolderAddress(String add)
    {
        Account_HolderAddress=add;
    }
    public void setAccount_HolderMobile(String mob)
    {
        Account_HolderMobileNo=mob;
    }
    public void setAccount_Balance(Double balance)
    {
        this.Account_Balance=balance;
    }

    //Method---

    public void closeAccount()
    {
        System.out.println("Your Account Peremnantly Closed.");
    }

    public String toString()
    {
        return "\n Account Number : "+account_Number+"\n Account Holder Name : "+Account_HolderName+"\n Account Holder Address : "+Account_HolderAddress+"\n Account Holder Mobile Number : "+Account_HolderMobileNo+"\n Account Holder DOB : "+Account_HolderDOB+"\n Account Balance :"+Account_Balance;
    }
}

class savingaccount extends account
{
    public savingaccount(String ac_num, String ac_name, String ac_dob) {
        super(ac_num, ac_name, ac_dob);
        //TODO Auto-generated constructor stub
    }

    public double deposite(double depo_amt)
    {
        double dep=getAccount_Balance()+depo_amt;
        setAccount_Balance(dep);
        return dep;
    }
    public double withdrawl(double with_amt)
    {
        double withamt=getAccount_Balance()-with_amt;
        setAccount_Balance(withamt);
        return with_amt;
    }

}

class loanaccount extends account
{
    public loanaccount(String ac_num, String ac_name, String ac_dob) {
        super(ac_num, ac_name, ac_dob);
        //TODO Auto-generated constructor stub
    }
 
    public double payEmi(double EMI_amt)
    {
        double afterEmi_bal=getAccount_Balance()-EMI_amt;
        setAccount_Balance(afterEmi_bal);
        System.out.println("Your EMI rs. "+EMI_amt+" successfully deducted on your account.");
        return afterEmi_bal;
    }

}
public class banking {
    
    public static void main(String args[])
    {
        savingaccount s1=new savingaccount("UB8565215436", "MR.Jay Desai", "01/02/2000");
        s1.setAccount_HolderAddress("Abc Complex,Ahmedabad");
        s1.setAccount_HolderMobile("+91 9876541238");
        s1.setAccount_Balance(50000.00);
    }

}
