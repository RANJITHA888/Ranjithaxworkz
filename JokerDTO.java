public class JokerDTO
{
private String name;
private String address;
private long mobileNo;
public JokerDTO(String nm,String add,long mb)
{
	name=nm;
	address=add;
	mobileNo=mb;
}

public String getName()
{
return name;
}

public String getAddress()
{
return address;
}

public long getMobileNo()
{
return mobileNo;
}



}