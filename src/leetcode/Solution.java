package leetcode;

import java.util.*;

public class Solution {

}

class Main {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String[] mail = s.split("@");
            String[] name = s.split("\\+");
            String realName = name[0].replace(".","");
            String realEmail = realName + "@" + mail[1];
            set.add(realEmail);
        }
        return set.size();
    }
}