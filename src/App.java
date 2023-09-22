public class App {
    public static void main(String[] args){
        FindWordsByCharacters fw = new FindWordsByCharacters();
        String[] words = new String[] {"cat","bt","hat","tree"};
        System.out.println(fw.countCharacters(words, "atach"));
    }
}