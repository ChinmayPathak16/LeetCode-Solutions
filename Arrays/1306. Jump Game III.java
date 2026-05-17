class Solution {
    public boolean canReach(int[] arr, int start) {
        if(start >= arr.length || start < 0 || arr[start] < 0)  return false;
        if(arr[start] == 0) return true;
        arr[start] *= -1; 
        boolean left = canReach(arr, start + arr[start]);
        boolean right = canReach(arr, start - arr[start]);
        return right || left;
    }
}
