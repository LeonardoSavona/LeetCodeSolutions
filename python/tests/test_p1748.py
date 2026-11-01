import pytest

from problems.p1748 import Solution


@pytest.mark.parametrize("nums, expected", [
    ([1, 2, 3, 2], 4),
    ([1, 1, 1, 1, 1], 0),
    ([1, 2, 3, 4, 5], 15),
    ([100], 100),
    ([1, 1, 1, 2], 2),
], ids=["typical", "all_equal", "all_unique", "max_value", "odd_repetitions"])
def test_sum_of_unique(nums, expected):
    assert Solution().sumOfUnique(nums) == expected
