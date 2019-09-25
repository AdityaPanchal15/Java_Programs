class Sort
{
	public static void main(String args[])
	{int len;
		len=args.length;
		int[] a=new int[len];
		for(int i=0;i<len;i++)
		{
		a[i] = Integer.parseInt(args[i]);
		}
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<len;i++)
		{
		System.out.println(a[i]);
		}
	}
}