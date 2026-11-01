import pytest

from problems.p3211 import Solution


@pytest.mark.parametrize("n, expected", [
    (1, ["0", "1"]),
    (2, ["01", "10", "11"]),
    (3, ["010", "011", "101", "110", "111"]),
])
def test_valid_strings(n, expected):
    assert sorted(Solution().validStrings(n)) == expected


def test_count_is_fibonacci():
    result = Solution().validStrings(10)
    assert len(result) == 144  # F(12)
    assert all(len(s) == 10 and "00" not in s for s in result)
