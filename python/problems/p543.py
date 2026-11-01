"""543. Diameter of Binary Tree"""

from typing import Optional

from common.tree_node import TreeNode


class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        def visit(root: Optional[TreeNode]):
            hl = dl = hr = dr = 0
            if root.left:
                hl, dl = visit(root.left)
            if root.right:
                hr, dr = visit(root.right)
            d = hl + hr
            if dr > d: d = dr
            if dl > d: d = dl
            return 1 + (hl if hl > hr else hr), d

        return visit(root)[1]
