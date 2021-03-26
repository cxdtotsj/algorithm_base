# -*- coding: utf-8 -*-
# @Data : 2021-03-25

class Node:
    '''
    链表
    '''
    # 内容
    item = None
    # 下一个节点的引用地址
    next_ad = None

first = Node()
second = Node()
third = Node()

first.item = 'one'
second.item = 'two'
third.item = 'three'

first.next_ad = second
second.next_ad = third

x = first

while (x is not None):
    print(x.item)
    x = x.next_ad
    print(x)
