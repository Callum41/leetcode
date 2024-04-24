import numpy as np
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        n = 0
        finalArray = np.concatenate((nums1, nums2))
        finalArray.sort()
        if len(finalArray) % 2 == 0:
            n = (finalArray[len(finalArray)//2 - 1] + finalArray[len(finalArray)//2]) / 2
        else:
            n = finalArray[len(finalArray)//2]
        return n