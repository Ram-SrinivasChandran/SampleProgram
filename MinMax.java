class MinMax
{
	public static void main(String[] args) {
		int myvalue=10000;
		int myMinvalue=Integer.MIN_VALUE;
		int myMaxvalue=Integer.MAX_VALUE;
		System.out.println("Maximum Value:"+myMinvalue);
		System.out.println("Minumum Value:"+myMinvalue);
		System.out.println("Busted Maximum Value:"+(myMinvalue+1));
		System.out.println("Busted Minimum Value:"+(myMinvalue-1));
	}
}