class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        a=0
        b=x/2+1
        while (a<=b):
            mid=(a+b)/2
            if mid*mid==x:
                return mid
            elif mid*mid>x:
                b=mid-1
            else:
                a=mid+1
        return b