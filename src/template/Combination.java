package template;

class Combination {
    private int combinations(int a, int b) {
        long top = 1;
        long bottom = 1;

        for (int i = b + 1; i <= a; i++) {
            top *= i;
        }
        for (int i = 1; i <= a - b; i++) {
            bottom *= i;
        }
        return (int) (top / bottom);
    }
}
