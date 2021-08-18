#!/bin/python3

import math
import os
import random
import re
import sys
# //need nested for loops to itterate through 2d array
        # //need a calculate hourglass sum 
        # //need to keep counter of hourglass sum 


if __name__ == '__main__':

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
    
    
    def get_hourglass_sum(matrix, row, col):
        sum=0
        sum+= matrix[row-1][col-1]    
        sum+= matrix[row-1][col]    
        sum+= matrix[row-1][col+1]    
        sum+= matrix[row][col]    
        sum+= matrix[row+1][col-1]    
        sum+= matrix[row+1][col]    
        sum+= matrix[row+1][col+1]    
        return sum
    
    max_hourglass_sum=-63    
    for i in range(1,5):
        for j in range(1,5):
            cur_hourglass_sum = get_hourglass_sum(arr,i,j)
            if cur_hourglass_sum> max_hourglass_sum:
                max_hourglass_sum=cur_hourglass_sum
                
    print(max_hourglass_sum) 