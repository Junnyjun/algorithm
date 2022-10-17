class Solution {
    fun getHint(secret: String, guess: String): String {
            val map = IntArray(10)
    var bulls = 0; var cows = 0

    for (i in 0..secret.length - 1) {
        if (guess[i] == secret[i]) bulls++
        else map[secret[i] - '0']++
    }
    
    for (i in 0..guess.length - 1) {
        if (guess[i] != secret[i] && map[guess[i] - '0'] > 0) {
            cows++
            map[guess[i] - '0']--
        }
    }

    return "${bulls}A${cows}B"
}

}

