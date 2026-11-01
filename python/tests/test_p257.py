import pytest

from common.tree_node import build_tree
from problems.p257 import Solution


@pytest.mark.parametrize("values, expected", [
    ([1, 2, 3, None, 5], ["1->2->5", "1->3"]),
    ([1], ["1"]),
    ([1, 2, None, 3, None, 4], ["1->2->3->4"]),
    ([-1, -2, 3], ["-1->-2", "-1->3"]),
    ([], []),
], ids=["typical", "single_node", "left_chain", "negative_values", "empty_tree"])
def test_binary_tree_paths(values, expected):
    assert sorted(Solution().binaryTreePaths(build_tree(values))) == sorted(expected)
