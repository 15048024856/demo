public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("b");
        operate(sb, sb2);
        System.out.println(sb +"."+ sb2);
    }

    private static void operate(StringBuilder x, StringBuilder y) {
        x.append(y);
        y=x;
    }
}
