//super class of so we can manipulae Accounts
public class Account{
  String fname="";
  String lname="";
  String empilid="";

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
