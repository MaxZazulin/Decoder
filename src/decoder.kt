import java.io.File
import java.util.*

fun main() {
    val shift : Int = 3
    val test : Array<Char> = arrayOf('m','a','x')
    test.forEach { name -> print(name)}
    println()
    val alpha : Array<Char> = arrayOf(
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j','k','l','m', 'n','o','p','q','r','s','t','u','v','w','x','y','z')
    for (i in test.indices)
        for (j in alpha.indices) {
            if (test[i] == alpha[j])
                test[i] = alpha[j + shift]
            break
        }
    test.forEach { name2 -> print(name2)}
}
//fun readFile(name: String) {
//    val file = File(/* pathname = */ "txt.txt") // чтение файла
//    val bufferedReader = file.bufferedReader()
//    val text = bufferedReader.readLines()
//    for(line in text){
//        println(line)
//    }
//}
//    val scan = Scanner(System.`in`)
//    val n : String = scan.nextLine()
//    decoderFile(n)
