package task3_3;

import java.util.*;

class MyBaseEnum {
    private Map<String, EnumMethods> map = new HashMap<>();

    public MyBaseEnum(String[] constans) {
        int ordinal = 0;
        for (String value : constans) {
            map.put(value, new EnumMethods(value, ++ordinal));
        }
    }

    public EnumMethods getEntity(String key) {
        return map.get(key);
    }

    public MyBaseEnum.EnumMethods[] values() {
        return map.values().toArray(new EnumMethods[map.size()]);
    }

    ;

    public class EnumMethods {
        private String name;
        private int ordinal;

        public EnumMethods(String name, int ordinal) {
            this.name = name;
            this.ordinal = ordinal;
        }

        public String name() {
            return this.name;
        }

        public int ordinal() {
            return this.ordinal;
        }
    }

}
