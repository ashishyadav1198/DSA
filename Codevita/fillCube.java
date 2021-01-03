import java.io.*;
import java.util.*;
import java.math.*;
class FillCube {
  	public static int maxPossibeCWall(char cube[][], int n) {
	   int numberOfD = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cube[i][j] == 'D')
                    numberOfD ++;
            }
        }
        return (int)Math.sqrt(numberOfD);
    }
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int sizeOfWall = sc.nextInt();
      	char cube[][] = new char[sizeOfWall][sizeOfWall];
      	for (int i = 0; i < sizeOfWall; i++) {
            for (int j = 0; j < sizeOfWall; j++) {
                cube[i][j] = sc.next().charAt(0);
            }
        }
        int res = maxPossibeCWall(cube, sizeOfWall);
		System.out.print(res); 
    }
}