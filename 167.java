class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a=0;
        int b=numbers.length-1;
        while (numbers[a]+numbers[b]!=target){
            if (numbers[a]+numbers[b]>target){
                b-=1;
            }
            else if (numbers[a]+numbers[b]<target){
                a+=1;
            }
        }
        return new int[]{a + 1, b + 1};
    }
}

// 创建一个int类型的数组: new int[]