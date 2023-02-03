package collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		int a[] = {1,2,4,4,4,2,7,5,5,6};
		
		ArrayList al = new ArrayList();
		
		
		for(int x =0;x<a.length;x++) {
			int count = 0;
			if(!al.contains(a[x])) {
				al.add(a[x]);
				count++;
				for(int k =x+1;k<a.length;k++) {
					if(a[x]==a[k]) {
						count++;
						
					}
				}
				//System.out.println(a[x]+" - "+count);
				if(count==1) {
					System.out.println(a[x]);
				}
			}
			
			
		}
		
	}

}
