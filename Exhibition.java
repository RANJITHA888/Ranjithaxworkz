class Exhibition
{
static String type="car";
static int total=34;
public static void main(String a[])
{                   
exhibit(type);
exhibit(total,type);
}
static void exhibit(String type)
{
System.out.println(type+" exhibition");
}
static void exhibit(int total,String type)
{
System.out.println(type+"exhibition"+""+"with"+total);
}                                                                                                                                                                                                                                                                                                                                                                            
}
