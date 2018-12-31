//super class of so we can manipulae Accounts
public class Account{
  private String firstName;
  private String lastName;
  private String emplID;
  private Strig phoneNumber;
  private String email;
  private Address address;

  public Account(){

  }
  public Account(String empilid){
    this.empilid=empilid;
  }
  public Account(String fname, String lname){
    this.fname=fname;
    this.lname=lname;
  }
}
