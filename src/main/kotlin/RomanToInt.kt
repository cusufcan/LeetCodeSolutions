fun romanToInt(s: String): Int {
    val romans = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000,
    )

    var index = 0
    var sum = 0
    while (index < s.length) {
        if(index != s.length -1) {
            when (s[index]) {
                'I' -> {
                    if (s[index + 1] == 'V' || s[index + 1] == 'X') {
                        sum += romans[s[index + 1]]!! - romans[s[index]]!!
                        index += 2
                    } else {
                        sum += romans[s[index]]!!
                        index++
                    }
                }

                'X' -> {
                    if (s[index + 1] == 'L' || s[index + 1] == 'C') {
                        sum += romans[s[index + 1]]!! - romans[s[index]]!!
                        index += 2
                    } else {
                        sum += romans[s[index]]!!
                        index++
                    }
                }

                'C' -> {
                    if (s[index + 1] == 'D' || s[index + 1] == 'M') {
                        sum += romans[s[index + 1]]!! - romans[s[index]]!!
                        index += 2
                    } else {
                        sum += romans[s[index]]!!
                        index++
                    }
                }

                else -> {
                    sum += romans[s[index]]!!
                    index++
                }
            }
        } else {
            sum += romans[s[index]]!!
            index++
        }
    }
    return sum
}