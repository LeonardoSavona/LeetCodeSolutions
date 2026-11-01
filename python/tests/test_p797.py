import pytest

from problems.p797 import Solution


@pytest.mark.parametrize("graph, expected", [
    ([[1, 2], [3], [3], []], [[0, 1, 3], [0, 2, 3]]),
    ([[4, 3, 1], [3, 2, 4], [3], [4], []],
     [[0, 4], [0, 3, 4], [0, 1, 3, 4], [0, 1, 2, 3, 4], [0, 1, 4]]),
    ([[1], []], [[0, 1]]),
    ([[1, 2], [2], []], [[0, 1, 2], [0, 2]]),
], ids=["diamond", "many_paths", "two_nodes", "direct_and_indirect"])
def test_all_paths_source_target(graph, expected):
    assert sorted(Solution().allPathsSourceTarget(graph)) == sorted(expected)
