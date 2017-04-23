package com.strongant.groovy

/**
 * 使用闭包进行遍历集合和映射
 */
class ErgodicExample {
    public static void main(String[] args) {
        //遍历集合
        def datas = [0,1,2,3,4,5,6,7]
        datas.each {
            println it + "  "
        }

        //使用闭包遍历映射第一种方法
        def maps = [a:"a",b:"b",c:"c"]
        maps.each {
            data ->
                println "key:${data.key}==value:${data.value}"
        }

        //第二种闭包遍历Map的方法
        maps.each {
            key,value ->
                println "key:${key}====value:${value}"
        }
    }
}
