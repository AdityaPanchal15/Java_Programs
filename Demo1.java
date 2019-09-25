class Demo1{
	public static void main(String args[]){
Runtime runtime=Runtime.getRuntime();
System.out.println("Occ:"+(runtime.totalMemory()-runtime.freeMemory()));


for(int i=0;i<1000;i++)
{
	int[] a=new int[i];
}
System.out.println(runtime.totalMemory()-runtime.freeMemory());
	}
}
//runtime.freeMemory();