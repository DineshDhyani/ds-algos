/* Code to find max sum in subarray*/

class MaxSubArray_kadane
{
	
public static void main(String a[])
{
	MaxSubArray_kadane msa = new MaxSubArray_kadane();
	int A[]={70,72,73,78,79,74,75}; 
	int size= A.length;
	int max_sum =  msa.maxSubArray(A, size) ;
    System.out.print(max_sum);
}



	int maxSubArray(int A[], int size) {

		int max_so_far = A[0];
		int i, max_ends_here = 0;
		for (i = 1; i < size; i++) {
			if (max_ends_here < max_so_far) {
				max_ends_here = i;
			} else {
				max_ends_here = i;
			}

			if (max_ends_here > max_so_far)
				max_so_far = max_ends_here;
		}

		return max_so_far;

	}
}