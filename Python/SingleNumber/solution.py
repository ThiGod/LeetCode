#!/usr/bin/bash python
#Given an array of integers, every element appears twice except for one. Find that single one.
#Note:
#Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

class Solution:
# @parm A, a list of integer
# @return an interger
    def singleNumber(self, A):
        temp = set(A)
        temp = list(temp)
        print temp

    def singleNumberFail(self, A):
        temp = []
        for e in A:
            if e not in temp:
                temp.append(e)
            else:
                temp.remove(e)
        return temp.pop()


A = [1,2,3,4,5,6,3,4,6,5,8,1,2]
print A
test = Solution()
print test.singleNumber(A)
print test.singleNumberFail(A)
print A
