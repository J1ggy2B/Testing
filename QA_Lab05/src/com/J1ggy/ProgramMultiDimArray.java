package com.J1ggy;



public class ProgramMultiDimArray {

	public static void main(String[] args) {


		int[][] StudentIds = {
				{0001,0002,0003},
				  {100,82,93,},
				  {89,67,100},
				  {90,72,45}
				};

		for( int i = 0; i < 3; i++ ) {
				System.out.println("The Student id is: " + StudentIds[0][i]);
					for( int j=0 ;j<3 ; j++) {
						System.out.println(" Their scores are: " + StudentIds[i+1][j] + "\n");
				}
		}
		System.out.println("");
	}

}