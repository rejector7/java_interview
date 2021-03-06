## dfs

一律递归+回溯。

**P99 恢复二叉搜索树**

方法一：
* dfs中序遍历，获取节点列表。
* 遍历节点列表，找出乱序的节点

复杂度：
time： n
space： n

方法二：

1 5 3 4 2 6
* 只定义两个目标节点first last和一个前缀节点 prev。
* 根据大小查找两个目标节点。
* dfs
* 两个目标节点有两种情况：相邻或者不相邻。并且要在一次遍历中找到。
* 设置last，若first为空，则设置为prev。不为空，说明prev已经找到了，只需设置last。

复杂度：

time： n
space： 高度（递归栈）

**P100 相同的树**

* dfs：判断左子树和右子树是否都相等

**P112 路径总和**

dfs的递归解法。
递归的本质是将大问题转化为相同的子问题。

变成子树。

**P113**

在dfs的同时要记录路径。

通过一个全局的最终结果集合，和，临时路径数组。
遍历到时，加入路径，到达叶节点时，判断是否满足条件。

递归出口，可能有多个条件，但是涉及结果集，一般只在一处。
此题中即访问到叶子节点时，路径和是否满足。

涉及到回溯，用于记录临时结果，后进先出，可以使用Deque。