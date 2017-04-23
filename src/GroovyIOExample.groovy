package com.strongant.groovy

/**
 * 文件的读取，读取全国省市JSON数据
 * 文件的写入，通过groovy和Java的方式进行对比
 */
class GroovyIOExample {
    public static void main(String[] args) {
        //1. 读取某个文件的内容
        def parentPath = System.getProperty('user.dir')
        def filePath = parentPath + "/src/area.json"
        def areaFile = new File(filePath).text
        //println areaFile

        //一行一行读取
        /* areaFile.eachLine {
             println it
         }*/
        //使用Java的方式进行读取
        //readByJava()
        //writeToFile()

        //writeToFileByClosure()
        writeFileByJava()
    }

    static void writeFileByJava(){
        def parentPath = System.getProperty('user.dir')
        def filePath = parentPath + "/src/write.txt"
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(filePath))
            bf.writeLine("writeFileByJava");
            bf.append("append content by java");
        } catch (Exception e) {
            e.printStackTrace()
        } finally {
            if(bf){
                bf.close()
            }
        }

    }

    //通过闭包的方式进行文件的写入
    static void writeToFileByClosure(){
        def parentPath = System.getProperty('user.dir')
        def filePath = parentPath + "/src/write.txt"
        new File(filePath).withPrintWriter {
            out ->
                out.println("writeToFileByClosure")
        }
    }

    static void writeToFile() {
        def parentPath = System.getProperty('user.dir')
        def filePath = parentPath + "/src/write.txt"
        def out = new File(filePath).newPrintWriter()
        out.write("content")
        out.flush()
        out.close()
    }

    //通过Java的方式进行读取
    static void readByJava() {
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader("src/area.json"));
            String line = null;
            while ((line = bf.readLine()) != null) {
                println line
            }
        } catch (Exception e) {
            e.printStackTrace()
        } finally {
            if (bf) {
                bf.close()
            }
        }
    }
}
