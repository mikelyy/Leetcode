class Solution:
    def rotatedDigits(self, N: int) -> int:
        res=0
        for i in range(1,N+1):
            for j in str(i):
                if j in ['3','4','7']:
                    continue
            for j in str(i):
                if j in ['2','5','6','9']:
                    res+=1                    
        return res