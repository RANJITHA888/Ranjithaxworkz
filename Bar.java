class Bar
{
 String id;
 String name;
 String address;
 public void destroying()
 {
 System.out.println("destroying the people");
 }
 public static void main(String a[])
 {
 Bar rs=new Bar();
 rs.id="ggh78";
 rs.name="manjunath";
 rs.address="mysore";
 System.out.println(rs.id+""+rs.name+""+rs.address);
 
 Bar one=new Bar();
 one.id="jh78";
 one.name="thippesh";
 one.address="chennai";
 System.out.println(one.id+""+one.name+""+one.address);
 rs.destroying();
 
 }
}