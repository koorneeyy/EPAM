package task3_3;

public class Main {

    public static void main(String[] args) {
        MyBaseEnum myEnum=new MyBaseEnum(new String[]{"MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE"});
        System.out.println(myEnum.getEntity("EARTH").name());
        System.out.println(myEnum.getEntity("EARTH").ordinal());

        MyBaseEnum.EnumMethods[] values = myEnum.values();
        for (MyBaseEnum.EnumMethods value:values){
            System.out.println(value.name()+"  "+value.ordinal());
        }


    }
}
