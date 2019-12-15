package JAVA_Programes;

public class MostRepeatedIntegerInArray {
	public static void main(String[] args)
	{
		int[] a= {1,2,3,4,5,6,5,4,3,7,6,6,2,3,2,2,2,3};
		int count=0;
		int tempCount=0;
		int element=0;
		for(int i=0;i<a.length;i++)
		{
			tempCount=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					tempCount++;
					
				}
				if(tempCount>count)
				{
					element=a[j];
					count=tempCount;
				}
			}
			
		}
		System.out.println(element+","+count);
	}

}
