import pytest

from problems.p17 import Solution


@pytest.mark.parametrize("digits, expected", [
    ("23", ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]),
    ("2", ["a", "b", "c"]),
    ("79", [a + b for a in "pqrs" for b in "wxyz"]),
], ids=["two_digits", "single_digit", "four_letter_keys"])
def test_letter_combinations(digits, expected):
    assert sorted(Solution().letterCombinations(digits)) == sorted(expected)


def test_count_is_product_of_key_sizes():
    result = Solution().letterCombinations("2379")
    assert len(result) == 3 * 4 * 3 * 4
    assert len(set(result)) == len(result)
