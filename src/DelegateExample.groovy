package com.strongant.groovy

/**
 * Delegate 属性
 * 指定了闭包的代理对象，默认情况下delagate与this是相同的，但是可以手动修改delegate的值，
 * 使用闭包可以访问其他对象的方法和属性
 */
class DelegateExample {
    def method() { println "DelegateExample method called..." }

    def foo(closure){
        closure.delegate = new Handle()
        closure()
    }
    static void main(String[] args) {
        new DelegateExample().foo {
            method()
        }
    }
}
class Handle {
    def method() { println "Handler method called" }
}