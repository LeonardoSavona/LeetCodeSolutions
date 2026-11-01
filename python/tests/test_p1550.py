import pytest

from problems.p1550 import Solution


@pytest.mark.parametrize("arr, expected", [
    ([2, 6, 4, 1], False),
    ([1, 2, 34, 3, 4, 5, 7, 23, 12], True),
    ([1, 1, 1], True),
    ([1, 1, 2, 1, 1], False),
    ([1], False),
], ids=["no_run", "run_in_middle", "whole_array", "run_broken_by_even", "too_short"])
def test_three_consecutive_odds(arr, expected):
    assert Solution().threeConsecutiveOdds(arr) is expected
