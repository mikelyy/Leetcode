class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        nums1.sort()
        nums2.sort()
        res=[]
        i=0
        j=0
        while i<len(nums1):
            while j<len(nums2):
                if nums1[i]==nums2[j]:
                    res.append(nums1[i])
                    i+=1
                    j+=1
                elif nums1[i]>nums2[j]:
                    j+=1
                else:
                    i+=1
        return res