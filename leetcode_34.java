class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirstOccurrence(nums,target),findLastOccurrence(nums,target)};
    }
    private int findFirstOccurrence(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int fOccurrence=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                fOccurrence=mid;
                right=mid-1;
            }
            else if(target<nums[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return fOccurrence;
    }
    private int findLastOccurrence(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int lOccurrence=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                lOccurrence=mid;
                left=mid+1;
            }
            else if(target<nums[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return lOccurrence;
    }
}