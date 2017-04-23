package com.strongant.groovy

/**
 * Created by bwh on 2017/4/23.
 * 包含列表(List)、映射(Map)、区间(Range)
 */
class CollectionExample {
    static void main(String[] args){
        // a List
        def datas = [10,9,8,7,6,5,4,3,2,1]
        // get a max num from list
        println datas.max()
        // get a min num from list
        println datas.min()
        //列表求和
        println datas.sum()
        //统计1的个数
        println datas.count(1)
        //从小到大排序
        println datas.sort()
        //元素个数
        println datas.size()
        //元素反转
        println datas.reverse()
        //在列表的末端添加一个数和Java中的add方法类似
        println datas << 5

    }
}
