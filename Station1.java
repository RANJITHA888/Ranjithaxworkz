class Station1
{
static String address="majestic";
static String platforms[]={"platform1","platform2","platform3"};
public static void main(String a[])
{
System.out.println(address);
System.out.println(platforms.length);
     getplatforms();
}
static void getplatforms()
{
for(int i=0;i<platforms.length;i++)
{
System.out.println(platforms[i]);
}
}
}