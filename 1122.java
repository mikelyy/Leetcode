/// Review
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ///  处理arr2 （arr2中每个element过一遍 如果arr1中过一遍有相同的，则把相同的都弄出来，arr1相当于重新编排称一个array/不创建新的空array）
        /// m是为了记录每个数在arr1中的位置 已经遍历了几个数
        int m=0;
        for (int j=0; j<arr2.length; j++){
            for (int i=m; i<arr1.length; i++){
                if (arr1[i]==arr2[j]){
                    arr1[i]=arr1[m];
                    arr1[m]=arr2[j];
                    m++;
                }
            }
        }
        
        /// 处理arr1中有的 但arr2中没有的 （现在arr1应该是[2,2,2,1,4,3,3,9,6], 还有7和19没有过，处理方法是如果后一个小于前一个,swap他们俩:经典algorithm(int temp)）
        /// 这里要注意int r=m,因为如果从0开始则是从小到大重新排列了，从m开始是after上面这个处理arr2的loop case，此时m已经等于9（case where arr2的value=6）
        for (int r=m; r<arr1.length; r++){
            for (int n=r+1; n<arr1.length; n++){
                if (arr1[r]>arr1[n]){
                    int temp=arr1[r];
                    arr1[r]=arr1[n];
                    arr1[n]=temp;
                }
            }
        }
        return arr1;
    }
}
      