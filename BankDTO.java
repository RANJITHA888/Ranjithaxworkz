 public class BankDTO
 {
 private String name;
 private String address;
 private long accountNo;
 private int number;
 public BankDTO(String nm,String add,long ac,int num)
 {
 name=nm;
 address=add;
 accountNo=ac;
 number=num;
 }
 public String getName()
 {
 return name;
 }
public String getAddress()
 {
return address;
 } 
public long getAccountNo()
 {
return accountNo;
 } 
public int getNumber()
 {
return number;
 }
 } 