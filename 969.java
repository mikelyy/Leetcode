class Solution {
    public List<Integer> pancakeSort(int[] A) {
        int n = A.length;
        List<Integer> res = new LinkedList<>();
        for (int i=n-1; i>=0; i--){
            if (A[i]!=i+1){
                int j = find_index(A, i+1);
                swap(A, j);
                swap(A, i);
                res.add(j+1);
                res.add(i+1);
            }
        }
        return res;
    }
    
    public int find_index (int[] A, int j){
        for (int i=0; i<A.length; i++){
            if (A[i]==j){
                return i;
            }
        }
        return -1;
    }
    
    public void swap(int[] A, int j){
        int i=0;
        while (i<j){
            int temp = A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
    }
        
    
}