void main() {
    int[] arr1 = {1,1,1,2,2,3};
    int[] arr2 = {0,0,1,1,1,1,2,3,3};

    IO.println(removeDuplicates(arr1));   //5
    IO.println(removeDuplicates(arr2));   //7
}

public int removeDuplicates(int[] nums) {

    int k = 2;

    for(int i=2; i< nums.length; i++){
        if(nums[i] != nums[k-2]){
            nums[k++] = nums[i];
        }
    }

    return k;

}

//Time complexity = O(n)
//Space complexity = O(1)
