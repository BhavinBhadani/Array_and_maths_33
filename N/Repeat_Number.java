/*
Q. N/3 Repeat Number

Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.

If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.


Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109

Input Format
The only argument is an integer array A.

Output Format
Return an integer.


Example Input
[1 2 3 1 1]

Example Output
1


Example Explanation
1 occurs 3 times which is more than 5/3 times.

*/

	public int repeatedNumber(final List<Integer> A) {
        int n = A.size();
        int m1 = A.get(0), m2 = Integer.MIN_VALUE;
        int n1 = 1, n2 = 0;
        for(int i=1; i<n; i++) {
            if (A.get(i) == m1) {
                n1++;
            } 
            else if (A.get(i) == m2) {
                n2++;
            }
            else if(n1 == 0) { 
                n1++;
                m1 = A.get(i); 
            }
            else if(n2 == 0) {
                n2++;
                m2 = A.get(i);
            }
            else {
                n1--;
                n2--;
            }
        }
        
        n1 = 0;
        n2 = 0;
        for(int i=0; i<n; i++) {
            if (A.get(i) == m1) {
                n1++;
            }
            else if (A.get(i) == m2) {
                n2++;
            }
        }
        
        if(n1 > n/3) {
            return m1;
        } 
        
        if(n2 > n/3) {
            return m2;
        } 

        return -1;
	}
