void main() {
    int[] arr1 = {0, 1};
    int[] arr2 = {0, 1, 0};
    int[] arr3 = {0, 1, 1, 1, 1, 1, 0, 0, 0};

    IO.println(contiguousSubarray(arr1));       //2
    IO.println(contiguousSubarray(arr2));       //2
    IO.println(contiguousSubarray(arr3));       //6
}

public int contiguousSubarray(int[] arr){
    HashMap<Integer, Integer> map = new HashMap<>();
    int currentSum = 0;
    int maxRes = 0;

    map.put(currentSum, -1);
    for(int i=0; i<arr.length; i++){
        if(arr[i] == 0){
            currentSum += -1;
        } else{
            currentSum += 1;
        }

        if(map.containsKey(currentSum)){
            maxRes = Math.max(maxRes, i-map.get(currentSum));
        } else {
            map.put(currentSum, i);
        }
    }
    return maxRes;
}
