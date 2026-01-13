package Ejerciciojedi;

import java.util.Scanner;

public class HundirLaFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][]hundir= {{'X','X','O','O','O'},{'O','O','X','O','O'},{'X','O','X','O','X'},{'X','O','X','O','O'},{'X','O','X','O','O'}};
		char barcos='X';
		Scanner leer=new int Scanner(System.in);
		for(int i=0;i<hundir.length;i++) {
			for(int j=0;j<hundir[i].length;j++) {
				System.out.println(hundir[i][j]);
				if(hundir[i][j]==barcos) {
					
				}
			}
		}
	}

}
