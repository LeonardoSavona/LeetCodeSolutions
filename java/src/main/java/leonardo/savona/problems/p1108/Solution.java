package leonardo.savona.problems.p1108;

class Solution {
    public static final String TITLE = "1108. Defanging an IP Address";

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[\\.]");
    }
}