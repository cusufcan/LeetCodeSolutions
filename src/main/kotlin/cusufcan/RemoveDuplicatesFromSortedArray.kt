package cusufcan

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var temp = nums.first()
        var count = 1
        val returnArray = arrayListOf(temp)
        for (i in 1 until nums.size) {
            if (temp != nums[i]) {
                temp = nums[i]
                returnArray.add(temp)
                count++
            }
        }

        for ((index, value) in returnArray.withIndex()) {
            nums[index] = value
        }

        return returnArray.size
    }
}