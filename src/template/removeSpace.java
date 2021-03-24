package template;

import java.util.ArrayList;

public class removeSpace {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList();
        input.add("2 2 2");
        String s = input.get(0).replaceAll("\\s", "");
        int in = Integer.parseInt(s);
        int numV = in / 100;
        int numH = (in % 100) / 10;
        int k = (in % 100) % 10;
        System.out.println(numV);
        System.out.println(numH);
        System.out.println(k);
    }
}
