package JAVA_Programes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class DuplicateRemoveFrmString {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		Set t=new LinkedHashSet();
		for(int j=0;j<a.length;j++)
		{
			//t.add(a[j]);
			t.add(s.charAt(j));
		}
		//t.add(s);
		
		List t1=new ArrayList();
		t1.addAll(t);
		for(int i=0;i<t1.size();i++)
		{
			System.out.print(t1.get(i));
		}
	}

}
