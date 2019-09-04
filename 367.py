class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num==0:
            return False
        a=0
        b=num
        while (a<=b):
            mid=(a+b)/2
            if mid*mid==num:
                return True;
            elif mid*mid>num:
                b=mid-1
            else:
                a=mid+1
        return False
            