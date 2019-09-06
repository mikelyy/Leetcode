"""Review"""

class Solution(object):
    def numRookCaptures(self, board):
        """
        :type board: List[List[str]]
        :rtype: int
        """
        
        """find the R point"""
        for i in range(8):
            for j in range(8):
                if board[i][j]=='R':
                    R=(i,j)
        
        
        """four directions"""
        res=0           
        for x, y in [[1,0],[-1,0],[0,1],[0,-1]]:
            newx=R[0]+x
            newy=R[1]+y
            while 0<=newx<8 and 0<=newy<8:
                if board[newx][newy]=='p':
                    res+=1
                    break
                    """break is needed because of only one move"""
                if board[newx][newy]=='B':
                    break
                newx+=x
                newy+=y
        return res
                    
        