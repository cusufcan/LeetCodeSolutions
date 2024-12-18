package cusufcan

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var commonPrefix = ""
        val minStrLength = strs.min().length

        topFor@ for (i in 0..<minStrLength) {
            commonPrefix += strs.min()[i]
            for (str in strs) {
                if (str.substring(0, i + 1) != commonPrefix) {
                    commonPrefix = commonPrefix.dropLast(1)
                    break@topFor
                }
            }
        }

        return commonPrefix
    }
}