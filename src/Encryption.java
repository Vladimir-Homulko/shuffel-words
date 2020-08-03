import java.util.ArrayList;

public class Encryption implements Cript {

    @Override
    public void Encryption(String keyWord, String text) {
        char[] keyArr = keyWord.toCharArray();
        ArrayList<Character> keyList = new ArrayList<>();
        for (int i = 0; i < keyArr.length; i++) {
            keyList.add(keyArr[i]);
        }

        char[] textArr = text.toCharArray();
        ArrayList<Character> textList = new ArrayList<>();
        for (int i = 0; i < textArr.length; i++) {
            if (i % 2 == 0) {
                textList.add(textArr[i]);
            }
        }

        ArrayList<Character> cript = new ArrayList<>();

        for (int i = 0; i < textList.size(); i++) {
            for (int j = 0; j < keyList.size(); j++) {
                cript.add(textList.get(i));
                cript.add(keyList.get(j));
            }
        }

        for (int i = 0; i < cript.size(); i++) {
            System.out.print(cript.get(i));
        }
    }
}
