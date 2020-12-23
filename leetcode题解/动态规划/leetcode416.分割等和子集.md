<h1 align = "center">leetcode416.分割等和子集</h1>

[题干](https://leetcode-cn.com/problems/partition-equal-subset-sum/) 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。

#### 转化成0-1背包问题

##### 状态与状态转移方程

状态定义：dp (i)(j)表示从数组的 [0, i] 这个子区间内挑选一些正整数，每个数只能用一次，使得这些数的和恰好等于 j。
状态转移方程：很多时候，状态转移方程思考的角度是分类讨论，对于0-1 背包问题而言就是[**当前考虑到的数字选与不选**]。
不选择 nums[i]，如果在 [0, i - 1] 这个子区间内已经有一部分元素，使得它们的和为 j ，那么 dp[i][j] = true；
选择 nums[i]，如果在 [0, i - 1] 这个子区间内就得找到一部分元素，使得它们的和为 j - nums[i]。
状态转移方程：
$$
dp[i][j] = dp[i - 1][j]  或  dp[i - 1][j - nums[i]
$$
**初始化条件**

- `j - nums[i]` 作为数组的下标，一定得保证大于等于 `0` ，因此 `nums[i] <= j`；

- 注意到一种非常特殊的情况：`j` 恰好等于 `nums[i]`，即单独 `nums[j]` 这个数恰好等于此时背包的容积 `j`，这也是符合题意的。

  因此完整的状态转移方程是见以下代码所示：

```java
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int temp : nums){
            sum += temp;
        }
        if(sum % 2 == 1){
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        if(nums[0] <= target){
            dp[0][nums[0]] = true;
        }

        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j <= target; j++){
                dp[i][j] = dp[i-1][j];
                if(nums[i] == j){
                    dp[i][j] = true;
                }
                if(nums[i] < j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[nums.length-1][target];
    }
}
```



