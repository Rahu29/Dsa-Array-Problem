void main() {
    int[] arr1 = {10,1,2,7,6,1,5};
    int[] arr2 = {2,5,2,1,2};

    IO.println(combinationSum2(arr1, 8));       //[[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
    IO.println(combinationSum2(arr2, 5));       //[[1, 2, 2], [5]]
}

public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> res = new ArrayList<>();
    combination(candidates, 0, target, new ArrayList<>(), res);
    return res;
}

public void combination(int[] candidates, int start, int remainingTraget, List<Integer> path, List<List<Integer>> res){
    if(remainingTraget == 0){
        res.add(new ArrayList<>(path));
        return;
    }

    for(int i=start; i<candidates.length; i++){
        int temp = remainingTraget - candidates[i];
        if(temp < 0){
            break;
        }

        if(i != start && candidates[i] == candidates[i-1]){
            continue;
        }

        path.add(candidates[i]);
        combination(candidates, i+1, temp, path, res);
        path.remove(path.size()-1);
    }
}