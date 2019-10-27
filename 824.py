class Solution:
    def toGoatLatin(self, S: str) -> str:
        res = []
        for i, a in enumerate(S.split(' ')):
            if a[0] not in list('aeiouAEIOU'):
                a = a[1:] + a[0]
            res.append(a + 'ma' + 'a'*(i+1))
        return ' '.join(res)
                