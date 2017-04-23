package com.strongant.groovy
/**
 * groovy的闭包
 * 闭包是Java8以前所不具备的
 * 闭包就是一个代码块，用{}括起来
 * 程序代码也成为数据，可以被一个变量所引用
 * Groovy的API大量使用闭包，以实现对外开放
 *
 * 创建闭包
 * {参数 -> //如果有多个参数使用逗号隔开，如果省略，可以用名为"it"的变量访问参数代码
 *
 * }
 */
class ClosureExample {
    static void main(String[] args){
        //不带参数的闭包
        def c = {println it}
        c.call("Hello Groovy")

        //带参数的闭包
        def c2 = { text -> println text }
        c2("Hello Groovy")

        //带两个参数的闭包
        def c3 = { name,age -> println "My name: is ${name},I am ${age} years old." }
        c3("zhangsan",10)
    }
}
