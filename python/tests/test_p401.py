import pytest

from problems.p401 import Solution


def brute_force(turned_on):
    return sorted(
        f"{h}:{m:02d}"
        for h in range(12)
        for m in range(60)
        if bin(h).count("1") + bin(m).count("1") == turned_on
    )


def test_one_led():
    expected = ["0:01", "0:02", "0:04", "0:08", "0:16", "0:32",
                "1:00", "2:00", "4:00", "8:00"]
    assert sorted(Solution().readBinaryWatch(1)) == sorted(expected)


def test_no_leds():
    assert Solution().readBinaryWatch(0) == ["0:00"]


def test_more_leds_than_any_valid_time():
    assert Solution().readBinaryWatch(9) == []


@pytest.mark.parametrize("turned_on", range(11))
def test_matches_brute_force(turned_on):
    assert sorted(Solution().readBinaryWatch(turned_on)) == brute_force(turned_on)
