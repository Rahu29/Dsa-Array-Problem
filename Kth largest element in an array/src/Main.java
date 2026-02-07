void main() {

    int[] arr1 = {3,2,1,5,6,4};
    int[] arr2 = {3,2,3,1,2,4,5,5,6};

    System.out.println(findKthLargest(arr1, 2));    // 5
    System.out.println(findKthLargest(arr2, 4));    // 4

}

public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int i=0; i<nums.length; i++){
        if(pq.size() < k){
            pq.add(nums[i]);
        } else {
            if(nums[i] > pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
    }
    return pq.peek();
}

// Time complexity = n log k
// Space complexity = O(n)