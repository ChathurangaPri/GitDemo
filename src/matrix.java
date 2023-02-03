
public class matrix {

	public static void main(String[] args) {
		int[][] nums = {{1,2,4},{5,-4,6},{8,9,0}};
		int min = nums[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(nums[i][j]<min) {
					min=nums[i][j];
				}
			}
		}
		
	
		System.out.println(min);
		
		int max = nums[0][0];
		
		for(int z=0;z<3;z++) {
			for(int y=0;y<3;y++) {
				if(nums[z][y]>max) {
					max=nums[z][y];
				}
			}
		}
		
	
		System.out.println(max);
		
	}

}
