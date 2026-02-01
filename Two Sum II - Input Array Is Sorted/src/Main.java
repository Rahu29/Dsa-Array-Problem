void main() {
    int[] arr1 = {2, 7, 11, 15};
    int[] arr2 = {2, 3, 4};
    int[] arr3 = {-1, 0};

    int[] arr1Res = twoSum(arr1, 9);
    int[] arr2Res = twoSum(arr2, 6);
    int[] arr3Res = twoSum(arr3, -1);

    Arrays.stream(arr1Res).forEach(e -> System.out.print(e + " "));     //[1 2]
    IO.println();
    Arrays.stream(arr2Res).forEach(e -> System.out.print(e + " "));     //[1 3]
    IO.println();
    Arrays.stream(arr3Res).forEach(e -> System.out.print(e + " "));     //[1 2]
}

public int[] twoSum(int[] numbers, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();
    int[] res = new int[2];

    for(int i=0; i<numbers.length; i++){
        if(map.containsKey(target - numbers[i])){
            res[0] = map.get(target - numbers[i])+1;
            res[1] = i+1;
        } else {
            map.put(numbers[i], i);
        }
    }

    return res;

}


//Time complexity = O(n)
//Space Complexity = O(1)