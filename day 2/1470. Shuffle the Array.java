class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] abc= new int[2*n];
            int j=0,k=0;
            for(int i=0;i<n;i++)
            {
                abc[k]=nums[i];
                abc[k+1]=nums[i+n];
                k++;
                k++;
            }
        return abc;
    }
}