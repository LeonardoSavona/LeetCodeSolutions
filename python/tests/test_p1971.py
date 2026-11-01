import pytest

from problems.p1971 import Solution


@pytest.mark.parametrize("n, edges, source, destination, expected", [
    (3, [[0, 1], [1, 2], [2, 0]], 0, 2, True),
    (6, [[0, 1], [0, 2], [3, 5], [5, 4], [4, 3]], 0, 5, False),
    (10, [[0, 7], [0, 8], [6, 1], [2, 0], [0, 4], [5, 8], [4, 7], [1, 3], [3, 5], [6, 5]], 7, 5, True),
    (1, [], 0, 0, True),
    (2, [], 0, 1, False),
], ids=["triangle", "two_components", "long_path", "source_is_destination", "no_edges"])
def test_valid_path(n, edges, source, destination, expected):
    assert Solution().validPath(n, edges, source, destination) is expected
