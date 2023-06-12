//力扣团队买了一个可编程机器人，机器人初始位置在原点(0, 0)。小伙伴事先给机器人输入一串指令command，机器人就会无限循环这条指令的步骤进行移动。指令
//有两种： 
//
// 
// U: 向y轴正方向移动一格 
// R: 向x轴正方向移动一格。 
// 
//
// 不幸的是，在 xy 平面上还有一些障碍物，他们的坐标用obstacles表示。机器人一旦碰到障碍物就会被损毁。 
//
// 给定终点坐标(x, y)，返回机器人能否完好地到达终点。如果能，返回true；否则返回false。 
//
// 
//
// 示例 1： 
//
// 输入：command = "URR", obstacles = [], x = 3, y = 2
//输出：true
//解释：U(0, 1) -> R(1, 1) -> R(2, 1) -> U(2, 2) -> R(3, 2)。 
//
// 示例 2： 
//
// 输入：command = "URR", obstacles = [[2, 2]], x = 3, y = 2
//输出：false
//解释：机器人在到达终点前会碰到(2, 2)的障碍物。 
//
// 示例 3： 
//
// 输入：command = "URR", obstacles = [[4, 2]], x = 3, y = 2
//输出：true
//解释：到达终点后，再碰到障碍物也不影响返回结果。 
//
// 
//
// 限制： 
//
// 
// 2 <= command的长度 <= 1000 
// command由U，R构成，且至少有一个U，至少有一个R 
// 0 <= x <= 1e9, 0 <= y <= 1e9 
// 0 <= obstacles的长度 <= 1000 
// obstacles[i]不为原点或者终点 
// 
//
// Related Topics 数组 哈希表 模拟 👍 133 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean robot(String command, int[][] obstacles, int x, int y) {

        int n = command.length();
        int sx = 0, sy = 0;

        for (int i = 0; i < n; i++) {
            char c = command.charAt(i);
            if (c == 'U') {
                sy++;
            } else {
                sx++;
            }
        }

        if (!canReach(command, x, y, sx, sy)) {
            return false;
        }

        for (int[] o : obstacles) {
            if (o[0] > x || o[1] > y) {
                continue;
            }

            if (canReach(command, o[0], o[1], sx, sy)) {
                return false;
            }
        }

        return true;

    }



    public boolean canReach(String cmd, int tx, int ty, int x, int y) {

        int round = Math.min(tx / x, ty / y);
        int nx = round * x, ny = round * y;

        if (nx == tx && ny == ty) {
            return true;
        }

        int n = cmd.length();

        for (int i = 0; i < n; i++) {

            char c = cmd.charAt(i);
            if (c == 'U') {
                ny++;
            } else {
                nx++;
            }

            if (nx > tx || ny > ty) {
                return false;
            }
            if (nx == tx && ny == ty) {
                return true;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
