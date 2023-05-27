class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int temp = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }

            if (temp > max) {
                max = temp;
            }
            temp = 0;
        }

        return max;
    }
}



class Solution {
    public int[] getConcatenation(int[] nums) {

        if(nums.length<1)
            return nums;

        int ans[]=new int[nums.length*2];

        for(int i=0;i<nums.length*2;i++){
            if(i<nums.length){
                ans[i]=nums[i];
            }else
            {
                ans[i]=nums[i-nums.length];
            }
        }
    return ans;
    }
}