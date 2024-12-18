package bugra

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        // reversed() fonksiyonu string bir ifadeyi ters çevirmemizi sağlar.
        return x.toString() == x.toString().reversed()
    }
}
