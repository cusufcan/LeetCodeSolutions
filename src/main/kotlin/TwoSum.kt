package org.example

fun twoSum(nums: IntArray, target: Int): IntArray {
    val resMap = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val res = target - nums[i]
        if(resMap.containsKey(res)) {
            return intArrayOf(resMap[res]!!, i)
        }
        resMap[nums[i]] = i
    }
    throw IllegalArgumentException("Not found")
}