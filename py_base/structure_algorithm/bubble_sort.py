# -*- coding: utf-8 -*-
# @Data : 2021-03-26

'''
冒泡排序

'''

def bubble_sort(arr):
    flag = True
    for i in range(len(arr) - 1):
        flag = False
        for j in range(len(arr) -i -1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
            flag = True
    return arr


if __name__ == '__main__':
    arr = [3,1,5,7,2,3,4,2]
