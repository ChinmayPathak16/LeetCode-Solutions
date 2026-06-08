class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot) left.add(nums[i]);
            else if(nums[i] > pivot)    right.add(nums[i]);
            else count++;
        }
        int j=0;

        for(int i=0; i<left.size(); i++){
            nums[j] = left.get(i);
            j++;
        }

        for(int i=0; i<count; i++){
            nums[j] = pivot;
            j++;
        }

        for(int i=0; i<right.size(); i++){
            nums[j] = right.get(i);
            j++;
        }
        return nums;
    }
}
