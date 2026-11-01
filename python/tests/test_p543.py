import pytest

from common.tree_node import build_tree
from problems.p543 import Solution


@pytest.mark.parametrize("values, expected", [
    ([1, 2, 3, 4, 5], 3),
    ([1, 2], 1),
    ([1], 0),
    # Diameter 5-3-2-4-6 does not pass through the root.
    ([1, 2, None, 3, 4, 5, None, None, 6], 4),
    ([1, 2, None, 3, None, 4], 3),
], ids=["typical", "two_nodes", "single_node", "not_through_root", "left_chain"])
def test_diameter_of_binary_tree(values, expected):
    assert Solution().diameterOfBinaryTree(build_tree(values)) == expected
