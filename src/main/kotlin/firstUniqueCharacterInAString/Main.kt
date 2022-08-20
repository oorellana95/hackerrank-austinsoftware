import kotlin.collections.*
import kotlin.io.*


fun getUniqueCharacter(s: String): Int {
    val charArray = s.toCharArray()
    val frequency = HashMap<Char, Int>()

    for (i in s.indices){
        val char = charArray[i]
        val value = frequency.getOrDefault(char, defaultValue = 0)
        frequency[char] = value + 1
    }

    for (key in frequency.keys){
        if (frequency[key] == 1){
            return charArray.indexOf(key) + 1
        }
    }
    return -1
}


fun main(args: Array<String>) {
    val s = "statics"

    val result = getUniqueCharacter(s)

    println(result)
}