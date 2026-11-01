import pytest

from problems.p1189 import Solution


@pytest.mark.parametrize("text, expected", [
    ("nlaebolko", 1),
    ("loonbalxballpoon", 2),
    ("leetcode", 0),
    ("balon", 0),
    ("balloonballoonballoo", 2),
], ids=["one", "two", "missing_letters", "single_l_and_o", "last_one_incomplete"])
def test_max_number_of_balloons(text, expected):
    assert Solution().maxNumberOfBalloons(text) == expected
