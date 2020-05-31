import java.util.*;
class Solution {
    public String defangIPaddr(String address) {
        String[] answer = address.split("\\.");
        return String.join("[.]", answer);
    }
}
