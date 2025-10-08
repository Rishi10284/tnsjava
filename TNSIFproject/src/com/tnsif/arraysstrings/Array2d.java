package com.tnsif.arraysstrings;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{1,2,3},{4,5},{6}};
		
		//======================================
			for(int[] x : num)  //Enhanced loop / for each
			{
				for(int y : x)
				{
					System.out.print(y+" " );
				}
				System.out.println();
			}

	}

}
