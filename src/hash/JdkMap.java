package hash;

import java.util.HashMap;

public class JdkMap {
    public static void main(String[] args) {
        new JdkMap();
    }

    public JdkMap() {
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < 17; i++) {
            map.put(i, i);
        }
        map.put("a", 1);
    }
}
