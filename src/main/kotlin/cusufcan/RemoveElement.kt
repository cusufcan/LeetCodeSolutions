package cusufcan

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var counter = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) continue
            for (j in i + 1 until nums.size) {
                if (nums[j] == `val`) continue
                val temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
            }
        }

        for (i in nums.indices) {
            if (nums[i] != `val`) counter++
        }
        return counter
    }
}