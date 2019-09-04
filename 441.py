class Solution(object):
    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        
        a=0
        b=n
        while(a<=b):
            mid=(a+b)/2
            if mid*(mid+1)/2>n:
                b=mid-1
            elif mid*(mid+1)/2<n:
                a=mid+1
            else:
                return mid
        return a-1