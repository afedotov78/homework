package hw4disciples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    public static void main(String[] args) {
        List<Disciple> disciples = new ArrayList<>();
        disciples.add(new Disciple("7 Егоров"));
        disciples.add(new Disciple("3 Ульянов"));
        disciples.add(new Disciple("5 Антонов"));
        disciples.add(new Disciple("3 Степанов"));
        disciples.add(new Disciple("9 Макаров"));
        disciples.add(new Disciple("1 Егоров"));
        Collections.sort(disciples);
        for (Disciple s : disciples) {
            System.out.println(s.getDisciple());
        }
    }
}
