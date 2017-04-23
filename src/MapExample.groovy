package com.strongant.groovy

class MapExample {
    static void main(String[] args) {
        //对Java的LinkedHashMap进行了封装
        def map = [:]
        println map.getClass()

        def datas = [name:"zhangsan",age:21,sex:"male"]
        println datas.name
        println datas["name"]
        datas.remove("age")
        datas.each {
            data ->
                println data.key +","+ data.value
        }
    }
}
