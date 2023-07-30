public class Enum {
    enum ProgammingLanguages{
        JAVA,
        JAVASCRIPT,
        C,
        PYTHON

    }
    public static void main(String[] args) {
     ProgammingLanguages [] languages =ProgammingLanguages.values();
     for (ProgammingLanguages progammingLanguages : languages) {
        System.out.println(progammingLanguages);
     }

    }
}
