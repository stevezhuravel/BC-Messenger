import java.util.Scanner;
public class Address{

  private int number;
  private String street;
  private String apt = "";
  private String city;
  private String state;
  private int zip;

  public Address(){
    this.number = setNumber();
    this.street = setStreet();
    this.apt = setApt();
    this.city = setCity();
    this.state = setState();
    this.zip = setZip();
  }

  private int setNumber(){
    System.out.println("Please enter the street number: ");
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();
    return num;
  }

  private String setStreet(){
    System.out.println("Please Enter your Street Name/Number: ");
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine();
    return s;
  }

  private String setApt(){
    System.out.println("Please Enter your Appartment: ");
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine();
    return s;
  }

  private String setCity(){
    System.out.println("Please Enter your City: ");
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine();
    return s;
  }

  private String setState(){
    System.out.println("Please Enter your State: ");
    Scanner kb = new Scanner(System.in);
    String s = kb.nextLine();
    return s;
  }

  private int setZip(){
    System.out.println("Please Enter your Zip Code: ");
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    return n;
  }

  public String toString(){
    return number + " " + street + ", " + apt + ", " + city +
           ", " + state + " " + zip + " ";
  }



}
