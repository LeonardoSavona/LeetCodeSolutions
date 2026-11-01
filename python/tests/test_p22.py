import pytest

from problems.p22 import Solution


@pytest.mark.parametrize("n, expected", [
    (1, ["()"]),
    (2, ["(())", "()()"]),
    (3, ["((()))", "(()())", "(())()", "()(())", "()()()"]),
])
def test_generate_parenthesis(n, expected):
    assert sorted(Solution().generateParenthesis(n)) == expected


def test_count_is_catalan_number():
    result = Solution().generateParenthesis(8)
    assert len(result) == 1430  # Catalan number C(8)
    assert len(set(result)) == len(result)
