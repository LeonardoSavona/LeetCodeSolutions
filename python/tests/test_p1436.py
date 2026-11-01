import pytest

from problems.p1436 import Solution


@pytest.mark.parametrize("paths, expected", [
    ([["London", "New York"], ["New York", "Lima"], ["Lima", "Sao Paulo"]], "Sao Paulo"),
    ([["B", "C"], ["D", "B"], ["C", "A"]], "A"),
    ([["A", "Z"]], "Z"),
], ids=["in_order", "shuffled", "single_path"])
def test_dest_city(paths, expected):
    assert Solution().destCity(paths) == expected
