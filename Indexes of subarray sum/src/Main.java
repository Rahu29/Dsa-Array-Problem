void main() {
    int[] arr = {1, 2, 3, 7, 5};
    int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr3 = {5, 3, 4};

    System.out.println(subarraySum(arr2, 15));  //[2, 4]
    System.out.println(subarraySum(arr3, 2));   //[1, 5]
    System.out.println(subarraySum(arr, 12));   //[-1]
}

public ArrayList<Integer> subarraySum(int[] arr, int target) {
    int i = 0;
    int res = 0;
    int start = 0;

    ArrayList<Integer> list = new ArrayList<>();
    while(i < arr.length){
        if(res + arr[i] <= target){
            res += arr[i];
            if(res == target){
                list.add(start+1);
                list.add(i+1);
                return list;
            }
            i++;
        } else {
                res -= arr[start];
                start++;
        }
    }
    list.add(-1);
    return list;
}
