class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        a_new = int(a,2)
        b_new = int(b,2)
        sum_value = a_new + b_new
        output = bin(sum_value)
        return output[2:]