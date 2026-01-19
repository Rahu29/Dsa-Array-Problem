void main() {
    String str1 = "abcabcbb";
    IO.println(lengthOfLongestSubstring(str1)); // 3

    String str2 = "pwwkew";
    IO.println(lengthOfLongestSubstring(str2)); // 3

    String str3 = "bbbbb";
    IO.println(lengthOfLongestSubstring(str3)); // 1

    String str4 = "";
    IO.println(lengthOfLongestSubstring(str4)); // 0
}

public int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int l = 0;
    int r = 0;
    int max = 0;

    while(r < s.length()){
        char temp = s.charAt(r);
        if(set.add(temp)){
            set.add(temp);
            max = Math.max(max, (r-l)+1); //r-l it gives actual length
            r++;
        } else {
            while(s.charAt(l) != temp){
                set.remove(s.charAt(l));
                l++;
            }
            set.remove(s.charAt(l));
            l++;
        }
    }
    return max;
}
