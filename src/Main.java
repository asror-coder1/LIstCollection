import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Darsni bodhladik

//        List<String> ismlar = new ArrayList<>();
//
//        ismlar.add("Ali");
//        ismlar.add("Vali");
//        ismlar.add("Eshmat");
//        ismlar.add("Toshmat");
//        ismlar.add("Erkin");
//        ismlar.add("Umar");
//        ismlar.add("Ansor");
//        ismlar.add("Asror");
//
//
//        int olchami = ismlar.size();
//        ismlar.remove(3);
//        System.out.println("Ismloarning o'lchami :" + olchami);
//
//        for (String name : ismlar){
//            System.out.println(name);
//        }


        Collection<String> col = new ArrayList<>();
        col.add("Ali");
        col.add("Vali");

        System.out.println(col.size());

//        ============================

//        ArrayList
//       ✔ Tez o‘qiladi
//       ❌ O‘rtadan o‘chirish sekin

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println(list.get(1));


//        LinkedList
//        ✔ Qo‘shish/o‘chirish tez
//        ❌ O‘qish sekinroq

        List<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);


//        HashSet
//       ❌ Tartib yo‘q
//       ✔ Juda tez

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");

        System.out.println(set);

//        LinkedHashSet
//       ✔ Qo‘shilgan tartib saqlanadi
//       TreeSet
//       ✔ Avtomatik tartiblaydi

        Set<Integer> sett = new TreeSet<>();
        sett.add(5);
        sett.add(1);
        sett.add(3);

        System.out.println(sett);

//        7️⃣ Queue — navbat
//        👉 FIFO (birinchi kirgan – birinchi chiqadi)
//         Turlari:
//         PriorityQueue
//         ArrayDeque


        Queue<String> queue = new ArrayDeque<>();
        queue.add("A");
        queue.add("B");

        System.out.println(queue.poll());

//        8️⃣ Map — kalit → qiymat (Collection emas)
//        👉 Key unique
//        👉 Value takror bo‘lishi mumkin
//         Turlari:
//         HashMap
//         LinkedHashMap
//         TreeMap
//         HashMap

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ali");
        map.put(2, "Vali");

        System.out.println(map.get(1));


//        TreeMap (tartibli)


        Map<Integer, String> maps = new TreeMap<>();

//        9️⃣ Iterator — aylanish (loop)
//
//        Collection’ni aylanib chiqish uchun.

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        Yoki oddiy:

        for (String s : list) {
            System.out.println(s);
        }

//        Masala

//        1-masala

        List<String> ism = new ArrayList<>();
        ism.add("Ali");
        ism.add("Bali");
        ism.add("Qodir");
        ism.add("Bobur");
        ism.add("Umar");

        for (String s : ism){
            System.out.println(s);
        }
        System.out.println("Ismalr size : " + ism.size());



    }
}