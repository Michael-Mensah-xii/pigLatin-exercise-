import PigLatin.pigLatinWord

object PigLatin{
    fun isVowel(ch: Char): Boolean {
        return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u'
    }

    // converting a string into Pig Latin
    fun pigLatinWord(string: String): String {
        // using index of the first vowel
        val stringLength = string.length
        var index = -1
        for (i in 0 until stringLength) {
            if (isVowel(string[i])) {
                index = i
                break
            }
        }
        //Pig Latin is possible only if a vowel is present
        return if (index == -1) "-1" else string.substring(index) + string.substring(
            0,
            index
        ) + "ay"
        // Take all characters after index (including index). Append all characters which are before index. Finally append "ay"   
    }


}

fun main() {
    val string1 = pigLatinWord("human") //begins with a consonant
    val string2 = pigLatinWord("ants") //begins with a vowel
    val string3 = pigLatinWord("mist") //begins with a consonant
    val string4 = pigLatinWord("cricket") //consonant cluster word
    val string5 = pigLatinWord("extreme") //begins with a vowel
    val string6 = pigLatinWord("stress") //consonant cluster word
    val string7 = pigLatinWord("eunoia") //contains all vowels
    val string8 = pigLatinWord("Psst") //contains no vowel
    if (string1 === "-1") println("Pig Latin is not possible, the string must have at least one vowel.") else println(
        string1
    )
    println(string2)
    println(string3)
    println(string4)
    println(string5)
    println(string6)
    println(string7)
    println(string8)
}
