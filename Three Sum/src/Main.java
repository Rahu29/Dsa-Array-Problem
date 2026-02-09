void main() {
    int[] arr1 = {-1,0,1,2,-1,-4};
    int[] arr2 = {0,1,1};
    int[] arr3 = {0,0,0};

    IO.println(threeSum(arr1));
    IO.println(threeSum(arr2));
    IO.println(threeSum(arr3));
}

public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> res = new ArrayList<>();

    for(int i=0; i<nums.length-2; i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }

        int left = i+1;
        int right = nums.length-1;

        while(left < right){
            int sum = nums[i]+nums[left]+nums[right];

            if(sum == 0){
                List<Integer> temp = Arrays.asList(nums[i], nums[left], nums[right]);
                res.add(temp);

                left++;
                right--;

                while(left<right && nums[left] == nums[left-1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }
            } else if(sum < 0){
                left++;
            } else {
                right--;
            }
        }
    }
    return res;
}

// Time Complexity = O(N^2)
// Space Complexity = O(N)

