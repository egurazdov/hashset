import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> setWatercolor = new HashSet<>();
        HashSet<String> setGouache = new HashSet<>();
        setGouache.add("Жёлтый");
        setGouache.add("Синий");
        setGouache.add("Красный");
        setGouache.add("Зелёный");
        setWatercolor.add("Небесный");
        setWatercolor.add("Синий");
        setWatercolor.add("Голубой");
        setWatercolor.add("Зелёный");

        System.out.println(setWatercolor);
        System.out.println(setGouache);
        System.out.println(setSame(setWatercolor, setGouache));
        System.out.println(setWatercolor);
        System.out.println(setGouache);
    }

    private static HashSet<String> setSame(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> setTemp = new HashSet<>(set1);
        setTemp.retainAll(set2);
        return setTemp;
    }
}