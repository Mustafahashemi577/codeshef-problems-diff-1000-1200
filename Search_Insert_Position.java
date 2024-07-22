class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int end = nums.length-1;
        int m = -1;
        if(target<nums[0])
        return 0;
        else if (target>nums[nums.length-1])
        return nums.length;
        while(first<=end){
             m = first+(end-first)/2;
            if(nums[m]==target)
            return m;
            else if (nums[m]<target && m+1<nums.length && nums[m+1]>target )
            return m+1;
            else if(nums[m]<target)
            first=m+1;
            else
            end=m-1;
        }
        return m+1;
    }
}