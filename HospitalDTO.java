public class HospitalDTO
{
 private String name;
 private String address;
 private int id;
 public static String type="government";
public void setName(String nm)
{
name=nm;
}
public String getName()
{
return name;
} 
public void setAddress(String add)
{
address=add;
}
public String getAddress()
{
return address;
}
public void setId(int i)
{
id=i;
}
public int getId()
{
return id;
} 
}