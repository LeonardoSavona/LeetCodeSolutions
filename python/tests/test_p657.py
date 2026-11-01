import pytest

from problems.p657 import Solution


@pytest.mark.parametrize("moves, expected", [
    ("UD", True),
    ("LL", False),
    ("RRDDLLUU", True),
    ("URDLL", False),
    ("U", False),
], ids=["back_and_forth", "same_direction", "square", "off_by_one", "single_move"])
def test_judge_circle(moves, expected):
    assert Solution().judgeCircle(moves) is expected
