import math

import pytest

from problems.p77 import Solution


@pytest.mark.parametrize("n, k, expected", [
    (4, 2, [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]),
    (1, 1, [[1]]),
    (3, 3, [[1, 2, 3]]),
    (3, 1, [[1], [2], [3]]),
], ids=["typical", "single_element", "k_equals_n", "k_is_one"])
def test_combine(n, k, expected):
    assert sorted(Solution().combine(n, k)) == expected


def test_count_is_binomial_coefficient():
    result = Solution().combine(10, 4)
    assert len(result) == math.comb(10, 4)
    assert all(a < b < c < d for a, b, c, d in result)
