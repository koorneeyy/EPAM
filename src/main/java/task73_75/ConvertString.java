package task73_75;

@FunctionalInterface
public interface ConvertString {
    String convert(String str);
    default boolean isEmpty(String str){
        return str ==null || str.trim().equals("");
    }
}
