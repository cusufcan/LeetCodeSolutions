package cusufcan

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val result = Stack<Char>()

        for (c in s) {
            if (c == '(' || c == '{' || c == '[') {
                result.push(c)
            } else {
                if (result.isEmpty()) return false
                val removedChar = result.pop()
                if (c == ')' && removedChar != '(') return false
                if (c == '}' && removedChar != '{') return false
                if (c == ']' && removedChar != '[') return false
            }
        }

        return result.isEmpty()
    }
}