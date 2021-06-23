class twodimarray{
	public static void main(String[] args) {
		int number[][]={{2,3,4},{5,6,7},{8,9,10}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
	}
}