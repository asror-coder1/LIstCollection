import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Darsni bodhladik

        List<String> ismlar = new ArrayList<>();

        ismlar.add("Ali");
        ismlar.add("Vali");
        ismlar.add("Eshmat");
        ismlar.add("Toshmat");
        ismlar.add("Erkin");
        ismlar.add("Umar");
        ismlar.add("Ansor");
        ismlar.add("Asror");


        int olchami = ismlar.size();

        System.out.println("Ismloarning o'lchami :" + olchami);

        for (String name : ismlar){
            System.out.println(name);
        }
    }
}