import pytest

from problems.p997 import Solution


@pytest.mark.parametrize("n, trust, expected", [
    (2, [[1, 2]], 2),
    (3, [[1, 3], [2, 3]], 3),
    (3, [[1, 3], [2, 3], [3, 1]], -1),
    (1, [], 1),
    (2, [], -1),
    (3, [[1, 2], [2, 3]], -1),
    (4, [[1, 3], [1, 4], [2, 3], [2, 4], [4, 3]], 3),
], ids=["two_people", "judge_trusted_by_all", "judge_trusts_someone",
        "only_one_person", "nobody_trusts", "chain_of_trust", "extra_trust_edges"])
def test_find_judge(n, trust, expected):
    assert Solution().findJudge(n, trust) == expected
