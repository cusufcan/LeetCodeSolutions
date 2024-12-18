package cusufcan

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var returnArray: IntArray = intArrayOf(0, 0)
        for (i in 0..<nums.count()) {
            for (j in (i + 1)..<nums.count()) {
                if (nums[i] + nums[j] == target) returnArray = intArrayOf(i, j)
            }
        }
        return returnArray
    }
}