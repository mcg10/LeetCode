import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> helper = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            helper.put(nums[i], i);
        }
        for (int k = 0; k < nums.length; k++){
            if (helper.get(target - nums[k]) != null && helper.get(target - nums[k]) != k){
                int[] answer = {k, helper.get(target - nums[k])};
                return answer;
            }
                
        }
        int[] empt = {0};
        return empt;
    }
}
