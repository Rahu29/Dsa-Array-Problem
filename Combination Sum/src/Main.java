void main() {

    int[] arr1 = {2,3,6,7};
    int[] arr2 = {2,3,5};
    int[] arr3 = {2};

    System.out.println(combinationSum(arr1, 7));
    System.out.println(combinationSum(arr2, 8));
    System.out.println(combinationSum(arr3, 1));

}

public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> res = new ArrayList<>();
    combination(candidates, 0, target, new ArrayList<>(), res);
    return res;
}

public void combination(int[] arr, int start, int remainingTarget, List<Integer> path, List<List<Integer>> res) {

    if(remainingTarget == 0){
        res.add(new ArrayList<>(path));
        return;
    }

    for(int i=start; i<arr.length; i++){
        if (remainingTarget < arr[i]) {
            break;
        }
        path.add(arr[i]);
        combination(arr, i, remainingTarget-arr[i], path, res);
        path.remove(path.size()-1);
    }

}