import groovy.xml.MarkupBuilder

//
//1.input :[0,1,2,3,4,5,6,7,8,9]
//output:[0,1,4,9,16,25,36,49,64,81]
/*( 0..<10 ).stream().map {
    i -> i**2
}.forEach {
    println it
}*/

//2. count a text file word's count
if (!(args.size() in 1..2)) {
    println "Incorrect number of arguments"
    println()
    println "USAGE: textAnalyzer TEXTFILE [STRING]"
    System.exit 1
}

def content = new File(args[0]).text
def charCount = content.size()
def wordCount = content.split(/\W+/).size()

def stringCount
if(args.size()==2){
    stringCount = content.count(args[1])
}

println "Characters:".gp(15) + charCount
println "Wordss:".padRight(15) + wordCount




