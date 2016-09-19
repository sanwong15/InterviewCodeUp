/*
 * San Wong
 */
public class Three {

	public static void main(String[] args) {
		int[] arr= {8,7,6,5,4,3,2,1};
		
		print(arr);
		print(wrapper(arr));
	}
	
	public static int[] wrapper(int[] arr){
		int len = arr.length;
		int[] list = new int[len];
		int upperIndex = len-1;
		int lowerIndex = 0;
		mergesort(arr,list,lowerIndex,upperIndex);
		return list;
	}
	
	public static void print(int[] arr){
		for (int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void mergesort(int[] arr, int[] temp, int lowerIndex, int upperIndex){
		if(lowerIndex == upperIndex){
			return;
		}else if (lowerIndex < upperIndex){
			int midIndex = lowerIndex + (upperIndex-lowerIndex)/2;
			mergesort(arr, temp, lowerIndex, midIndex);
			mergesort(arr, temp, midIndex+1, upperIndex);
			merge(arr, temp, lowerIndex,midIndex+1,upperIndex);
		}
	}
	
	public static void merge(int[] arr, int[] temp, int left, int right, int rightEnd){
		int leftEnd = right-1;
		int k = left;
		int num = rightEnd-left+1;
		
		while (left <= leftEnd && right <=rightEnd){
			if(arr[left] < arr[right]){
				temp[k++] = arr[left++];
			}else{
				temp[k++] = arr[right++];
			}
		}
		
		while(left <= leftEnd){
			temp[k++] = arr[left++];
		}
		
		while(right <= rightEnd){
			temp[k++] = arr[right++];
		}
		
		for (int i=0; i<num; i++, rightEnd--){
			arr[rightEnd] = temp[rightEnd];
		}
	}

}
