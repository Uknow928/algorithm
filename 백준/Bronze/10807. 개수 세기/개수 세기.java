import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int __ = Integer.parseInt(br.readLine());
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int c = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i : b) {
            if (i == c) {
                result++;
            }
        }

        System.out.println(result);

        }
    }
