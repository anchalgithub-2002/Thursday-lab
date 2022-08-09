class Transpose
{
	public static void main(String args[])
	{
	 int row=2, column=3;
	 int[][]matrix={{2,3,4},{5,6,7}};
	 Display(matrix);  //display current matrix
	int[][] transpose = new int[column][row];    //to transpose matrix
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			transpose[j][i]=matrix[i][j];
		}
	}
	Display(transpose);       //display transpose matrix
	}
	public static void main(int[][] matrix)
	{
		System.out.println("the matrix after transposing is:");
		for(int[] row:matrix)
		{
			for(int column:row)
			{
				System.out.println(column+ " ");
			}
			System.out.println(row+ " ");
		}
	}
}