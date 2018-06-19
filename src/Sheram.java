public class Sheram {
    public static void main(String[] args) {
        int loopEnd = 24;
        String formatLength = "%" + (Integer.toString((int) Math.pow(2, loopEnd)).length() + 2) + "d";
        for (int i = 1; i < loopEnd + 1; i++) {
            String out = String.format(formatLength, (int) Math.pow(2, i));
            if (i % 8 == 0) {
                out += "\n";
            }
            System.out.print(out);
        }
    }
}
