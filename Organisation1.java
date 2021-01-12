class Organisation
{
 String id;
 String name;
 String address;
 public void organize()
 {
 System.out.println("hiring the people");
 }
 public static void main(String a[])
 {
 Organisation rs=new Organisation();
 rs.id="yu6 7";
 rs.name="tech mahendra";
 rs.address="banglore";
 System.out.println(rs.id+""+rs.name+""+rs.address);
 
 Organisation organsize=new Organisation();
 organsize.id="yu6 7";
 organsize.name="tech mahendra";
 organsize.address="banglore";
 System.out.println(organsize.id+""+organsize.name+""+organsize.address);
 rs.organize();
 }
 }