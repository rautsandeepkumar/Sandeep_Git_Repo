package JAVA_Programes;

import java.util.LinkedHashSet;

public class DuplicateRemoveStringAndReturnString {
	public static void main(String[] args)
	{
		String a="sandeepp";
		LinkedHashSet t=new LinkedHashSet();
		StringBuilder b=new StringBuilder();
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(t.add(c))
			{
				b.append(c);
			}
		}
		System.out.println(b);
		
	}

}
