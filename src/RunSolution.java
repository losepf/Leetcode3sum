import java.util.stream.Collectors;

public class RunSolution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] input = { -1, 0, 1, 2, -1, -4 };
        solution.threeSum(input).forEach(s -> {
            System.out.print("[");
            CharSequence delimiter = ",";
            System.out
                    .print(String.join(delimiter, s.stream().map(t -> String.valueOf(t)).collect(Collectors.toList())));
            System.out.print("]");
        });

    }

}
