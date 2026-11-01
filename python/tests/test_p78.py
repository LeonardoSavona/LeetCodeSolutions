import pytest

from problems.p78 import Solution


@pytest.mark.parametrize("nums, expected", [
    ([1, 2, 3], [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]),
    ([0], [[], [0]]),
    ([-1, 5], [[], [-1], [5], [-1, 5]]),
], ids=["typical", "single_element", "negative_values"])
def test_subsets(nums, expected):
    assert sorted(Solution().subsets(nums)) == sorted(expected)


def test_count_is_power_of_two():
    result = Solution().subsets(list(range(10)))
    assert len(result) == 2 ** 10
    assert len({tuple(s) for s in result}) == len(result)
