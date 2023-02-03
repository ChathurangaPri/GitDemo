
public class looping {

	public static void main(String[] args) {
		int x = 1;
		for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<4-i ; j++) {
				System.out.print(x + " ");
				x++;
			}
			System.out.println();
		}

		int k = 1;
		for(int l = 0; l<4 ; l++) {
			for(int m = 0; m<l+1 ; m++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
		for(int y = 0; y<4 ; y++) {
			for(int z = 0; z<y+1 ; z++) {
				System.out.print(z+1 + " ");
				
			}
			System.out.println();
		}

		int r = 3;
		for(int p = 0; p<3 ; p++) {
			for(int q = 0; q<p+1 ; q++) {
				System.out.print(r + " ");
				r+=3;
			}
			System.out.println();
		}

	}

}
