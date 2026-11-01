import pytest

from problems.p1903 import Solution


@pytest.mark.parametrize("num, expected", [
    ("52", "5"),
    ("4206", ""),
    ("35427", "35427"),
    ("10", "1"),
    ("7", "7"),
], ids=["drop_last_digit", "all_even", "already_odd", "odd_first_digit", "single_digit"])
def test_largest_odd_number(num, expected):
    assert Solution().largestOddNumber(num) == expected
