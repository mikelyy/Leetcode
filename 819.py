class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        """
        :type paragraph: str
        :type banned: List[str]
        :rtype: str
        """
        bannedset = set(banned)
        for c in ",.!?;:'":
            paragraph = paragraph.replace(c, " ")
        count = collections.Counter(x for x in paragraph.lower().split())
        
        number = 0
        res = ''
        for x in count:
            if count[x]>number and x not in bannedset:
                number = count[x]
                res = x
        return res