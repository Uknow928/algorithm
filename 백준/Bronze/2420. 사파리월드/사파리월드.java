import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] s = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long i = s[0];
        long j = s[1];
        System.out.println(i-j > 0 ? i-j : j-i);
    }
}

