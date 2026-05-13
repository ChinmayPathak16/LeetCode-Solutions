class Solution {
    public int[] separateDigits(int[] nums) {
        int i = nums.length - 1;
        List<Integer> list = new ArrayList<>();
        while(i >= 0){
            if(nums[i] == 0){
                list.add(nums[i]);
                continue;
            }
            while(nums[i] > 0){
                int d = nums[i] %10;
                list.add(d);
                nums[i]/= 10;
            }
            i--;
        }
        int n = list.size();
        int[] arr = new int[n];
        for(int j=0; j<list.size(); j++){
            arr[j] = list.get(n - j - 1);
        }
        return arr;
    }
}
