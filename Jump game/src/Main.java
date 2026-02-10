void main() {
    int[] arr1 = {2, 3, 1, 1, 4};
    int[] arr2 = {3, 2, 1, 0, 4};

    IO.println("Arr1 ->" + canJump(arr1));  // True
    IO.println("Arr2 ->" + canJump(arr2));  // False
}

public boolean canJump(int[] nums) {
    int maxIndex = 0;
    for(int i=0; i<nums.length; i++){
        if(i>maxIndex) return false;

        maxIndex = Math.max(maxIndex, nums[i]+i);
    }
    return true;
}


// Time Complexity = O(N)
// Space Complexity = O(1)