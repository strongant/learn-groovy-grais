package com.strongant.groovy

class SwitchExample {
    static void main(String[] args){
        switch(10){
            case 0: println "0"; break
            case 1: println "1"; break
            case 0..9: println "it's range is 0-9";break
            case [8,9,10,11]: println "it's range is 8-11";break
            case {it % 3 ==0}: println "multiple of 3"; break
            default: println "not found"; break
        }
    }
}
