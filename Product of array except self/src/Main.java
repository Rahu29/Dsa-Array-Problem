void main() {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {-1, 1, 0, -3, 3};
    int[] arr3 = {0, 0};
    int[] arr4 = {0, 4, 0};

    int[] arr1Res = productExceptSelf(arr1);
    int[] arr2Res = productExceptSelf(arr2);
    int[] arr3Res = productExceptSelf(arr3);
    int[] arr4Res = productExceptSelf(arr4);

    System.out.print("Arr 1 -> ");
    for(int i=0; i<arr1Res.length; i++){
        System.out.print(arr1[i]+ " ");         // 24 12 8 6
    }
    System.out.println();
    System.out.print("Arr 2 -> ");

    for(int i=0; i<arr2Res.length; i++){
        System.out.print(arr2[i]+ " ");         // 0 0 9 0 0
    }
    System.out.println();
    System.out.print("Arr 3 -> ");

    for(int i=0; i<arr3Res.length; i++){
        System.out.print(arr3[i]+ " ");         // 0 0
    }
    System.out.println();
    System.out.print("Arr 4 -> ");


    for(int i=0; i<arr4Res.length; i++){
        System.out.print(arr4[i]+ " ");         // 0 0 0
    }
}

public int[] productExceptSelf(int[] nums) {
    int product = 0;
    boolean is0Contains = false;
    int zeroCount = 0;

    for(int n: nums){
        if(n == 0){
            is0Contains = true;
            zeroCount++;
            if(zeroCount > 1){
                break;
            }
        } else {
            if(product == 0){
                product = 1;
            }
            product *= n;
        }
    }

    for(int i=0; i<nums.length; i++){
        if(zeroCount > 1){
            nums[i] = 0;
            continue;
        }
        if(is0Contains){
            if(nums[i] == 0){
                nums[i] = product;
            } else {
                nums[i] = 0;
            }
        } else {
            nums[i] = product/nums[i];
        }
    }
    return nums;
}

// Time Complexity = O(n)
// Space Complexity = O(1)
