//Write a program that randomly fills in 0s and 1s 
//into a 3x3 TicTacToe board, prints the board and 
//also a message saying whether any rows, columns, 
//or diagonals with all 0s or 1s. Use a two-dimensional 
//array to represent a Tic Tac Toe board.

import java.util.Random;

public class TicTacToe{
	public static void main(String[] args){
		Random rand = new Random();
		int[][] ttt = new int[3][3];
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++){
				ttt[i][j] = rand.nextInt(2);
			}	
		}
		for(int x = 0; x < 3; x++){
			for(int y = 0; y<3; y++){
				System.out.print(ttt[x][y] + " ");
			}	
			System.out.println();
		}
		boolean winner = false;
		for(int a = 0; a < 3; a++){
				if(ttt[a][0]==ttt[a][1] && ttt[a][1]==ttt[a][2]){
					System.out.println("Row " + (a+1) + " is filled with " + ttt[a][2] +"'s and a winner");
					winner = true;
				}
			}
		for(int b = 0; b < 3; b++){
			if(ttt[0][b]==ttt[1][b] && ttt[1][b]==ttt[2][b]){
				System.out.println("Colum " + (b+1) + " is filled with " + ttt[1][b] +"'s and a winner");
				winner = true;
			}
		}
		if((ttt[1][1]== ttt[0][0] && ttt[0][0]== ttt[2][2]) || (ttt[1][1]== ttt[0][2] && ttt[0][2]== ttt[2][0])){
			System.out.print("One of the diangles is filled with " + ttt[1][1] + "'s and a winner");
			winner = true;
		}
		if(winner == false)
			System.out.print("There is no winner");
	}
}