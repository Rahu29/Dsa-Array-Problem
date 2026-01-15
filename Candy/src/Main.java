void main() {
    int[] arr = {1, 5, 1, 2, 3, 4};
    int[] arr1 = {1, 0, 2};
    int[] arr2 = {1, 2, 2};

    System.out.println(minCandy(arr)); //13
    System.out.println(minCandy(arr1)); //5
    System.out.println(minCandy(arr2)); //4

}

public int minCandy(int arr[]) {

    int[] temp = new int[arr.length];

    for(int i=0; i<temp.length; i++){
        temp[i] = 1;
    }

    for(int i=1; i<arr.length; i++){
        if(arr[i]>arr[i-1]){
            temp[i] = temp[i-1]+1;
        }
    }

    for(int i=arr.length-2; i>=0; i--){
        if(arr[i]>arr[i+1]){
            temp[i] = Math.max(temp[i],temp[i+1]+1);
        }
    }

    int res = 0;
    for(int num: temp){
        res+=num;
    }

    return res;

}
