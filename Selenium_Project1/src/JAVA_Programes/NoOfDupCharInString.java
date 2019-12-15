package JAVA_Programes;

public class NoOfDupCharInString {
	
	public static void main(String[] args)
	{
		String s="sandeep";
		int length=s.length();
		int count=0;
		int tempCount=0;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(s.charAt(i)!=' ') {
				if(s.charAt(i)==s.charAt(j))
				{
					tempCount++;
					count=tempCount;
					s.replace(s.charAt(j),' ');
				}
				}
			}
		}
	}

}
