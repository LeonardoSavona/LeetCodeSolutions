"""257. Binary Tree Paths"""

from common.tree_node import TreeNode


class Solution:
    def binaryTreePaths(self, root: TreeNode | None) -> list[str]:
        if not root:
            return []
        result = []
        self.bk(root, result, str(root.val))
        return result

    def bk(self, node, result, partial: str):
        if node.left is None and node.right is None:
            result.append(partial)
            return
        if node.left is not None:
            self.bk(node.left, result, partial + "->" + str(node.left.val))
        if node.right is not None:
            self.bk(node.right, result, partial + "->" + str(node.right.val))
