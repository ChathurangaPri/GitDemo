
public class InterviewQ {

	public static void main(String[] args) {
		int[][] nums = {{1,2,4},{2,3,6},{8,9,7}};
		int min = nums[0][0];
		int max = nums[0][0];
		int mincol = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(nums[i][j]<min) {
					min=nums[i][j];
					mincol= j;
					
				}
				
			}
			
		}
		
		for(int k =0;k<3;k++) {
			if(nums[k][mincol]>max) {
				max=nums[k][mincol];
			}
		}
		System.out.println("minimum = " + min);
		System.out.println("maximum = " + max);
		

	}

}
