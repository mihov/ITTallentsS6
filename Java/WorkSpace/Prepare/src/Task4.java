
public class Task4 {

	public static void main(String[] args) {
		char[][] charArr = {{' ','b',' ','b',' ',},
							{' ','b',' ','b',' ',},
							{' ','b',' ','b',' ',},
							{' ','b','b','b',' ',},
							{' ',' ',' ',' ',' ',}};
		
		printArr(charArr);
		System.out.println("===================================");
		paintBrush(charArr, 0, 0);
		printArr(charArr);

	}

	static void printArr(char[][] arr){
		for (int i = 0; i <= arr.length*2; i++) System.out.print('-');System.out.println();
			
		for (int row = 0; row < arr.length; row++) {
			System.out.print('|');
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+"|");
			}
			System.out.println();
			for (int i = 0; i <= arr.length*2; i++) System.out.print('-');
			System.out.println();
		}
		
	}
	
	static void paintBrush(char[][] arr, int x, int y) {
		if (isEmpty(arr, x, y)) {
			arr[x][y] = 'r';
			paintBrush(arr, x, y + 1);
			paintBrush(arr, x, y - 1);
			paintBrush(arr, x + 1, y);
			paintBrush(arr, x - 1, y);
		}
	}

	static boolean isInside(char[][] arr, int x, int y) {
		return (x >= 0) && (y >= 0) && (x < arr.length) && (y < arr[x].length);
	}

	static boolean isEmpty(char[][] arr, int x, int y) {
		if (isInside(arr, x, y)) {
			if ((arr[x][y] != 'r')&&(arr[x][y] != 'b')) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
