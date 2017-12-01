package explorations;

public class SpringExploration {
	public static void main(String args[])
	{
		System.out.println("The string length is: "+stringLength("Hello World!"));
		System.out.println("The reverse of the string is: "+reverse("Hello World!"));
	}

private static int stringLength(String inputString)
{
	int len = 0;
	try
	{
		len = inputString.length();
	}
	catch(Exception exp)
	{
		System.out.println(exp.getMessage());
	}
	return len;
}
private static String reverse(String inputString)
{
	String rev = "";
	char temp[] = inputString.toCharArray();
	try
	{
		for(int i=0;i<inputString.length();i++)
		{
			temp[i]=inputString.charAt(i);
		}
		for(int j=temp.length-1;j>=0;j--)
		{
			rev+=temp[j];
		}
	}
	catch(Exception exp)
	{
		System.out.println(exp.getMessage());
	}
	return rev;
}
}
