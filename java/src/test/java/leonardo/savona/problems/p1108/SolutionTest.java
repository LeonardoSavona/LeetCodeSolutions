package leonardo.savona.problems.p1108;

import leonardo.savona.base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends BaseTest {

    private final Solution solution = new Solution();

    @Test
    void defangIPaddr_typicalIpV4() {
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));
    }

    @Test
    void defangIPaddr_anotherTypicalIp() {
        assertEquals("255[.]100[.]50[.]0", solution.defangIPaddr("255.100.50.0"));
    }

    @Test
    void defangIPaddr_allSameOctet() {
        assertEquals("192[.]168[.]0[.]1", solution.defangIPaddr("192.168.0.1"));
    }

    @Test
    void defangIPaddr_singleDigitOctets() {
        assertEquals("0[.]0[.]0[.]0", solution.defangIPaddr("0.0.0.0"));
    }

    @Test
    void defangIPaddr_maxOctetValues() {
        assertEquals("255[.]255[.]255[.]255", solution.defangIPaddr("255.255.255.255"));
    }

    @Test
    void defangIPaddr_mixedOctets() {
        assertEquals("10[.]0[.]0[.]1", solution.defangIPaddr("10.0.0.1"));
    }
}
