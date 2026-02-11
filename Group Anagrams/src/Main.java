void main() {
    String[] arr1 = {"eat","tea","tan","ate","nat","bat"};
    String[] arr2 = {""};
    String[] arr3 = {"a"};

    System.out.println(groupAnagrams(arr1));    // [["bat"],["nat","tan"],["ate","eat","tea"]]
    System.out.println(groupAnagrams(arr2));    // [[""]]
    System.out.println(groupAnagrams(arr3));    // [["a"]]

}

public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();

    for(int i=0; i<strs.length; i++){
        char[] temp = strs[i].toCharArray();
        Arrays.sort(temp);
        String str = new String(temp);

        List<String> list = new ArrayList<>();

        if(map.containsKey(str)){
            list = map.get(str);
            list.add(strs[i]);
        } else {
            list.add(strs[i]);
        }
        map.put(str, list);
    }

    return new ArrayList<>(map.values());
}
// Time Complexity = O(N*k log k)
// Space Complexity = O(N*k)