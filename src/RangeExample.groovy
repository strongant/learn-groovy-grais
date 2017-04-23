package com.strongant.groovy

/**
 * 区间:Range
 * 右开区间：起始..结束
 */
class RangeExample {
    static void main(String[] args){
        def range1 = 1..5
        def range2 = 1..<5
        println range1
        println range1.size()
        println range2.contains(5)
    }
}
