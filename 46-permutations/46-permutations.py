class Solution:
    def permute(self, nums):
        result , visited = [], []
        def dfs(nums):
            if len(nums) == 0:
                result.append(visited[:])
            for num in nums:
                next = nums[:]
                next.remove(num)
                visited.append(num)
                dfs(next)
                visited.pop()

        dfs(nums)
        return result