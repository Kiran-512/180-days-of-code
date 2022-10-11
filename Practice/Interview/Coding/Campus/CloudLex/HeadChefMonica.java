import java.io.*;
import java.util.StringTokenizer;

public class HeadChefMonica {


    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                    reader.readLine());
        }
        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }


    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


        int N = nextInt();
        char[] sArray = next().toCharArray();
        int[] hist = new int[26];
        for (char c : sArray) {
            hist[c - 'A']++;
        }

        int M = nextInt();


        for (int i = 0; i < M; i++) {
            char[] s2Array = next().toCharArray();
            long answer = 1L;
            if (hist[s2Array[0] - 'A'] != 0 && hist[s2Array[1] - 'A'] != 0 && hist[s2Array[2] - 'A'] != 0) {
                answer = answer * hist[s2Array[0] - 'A'] * hist[s2Array[1] - 'A'] * hist[s2Array[2] - 'A'];
                hist[s2Array[0] - 'A']--;
                hist[s2Array[1] - 'A']--;
                hist[s2Array[2] - 'A']--;
                pw.println(answer % 1000000007);
            } else {
                pw.println(0);
            }
        }

        reader.close();
        pw.close();
    }
}