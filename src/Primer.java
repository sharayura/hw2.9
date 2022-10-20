import java.util.Objects;

public class Primer {
    private int x;
    private int y;

    public Primer(int x, int y) {
        if (x < 2 || y < 2 || x > 9 || y > 9) {
            throw new RuntimeException("Числа вне диапазона!");
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Primer primer = (Primer) o;
        return Objects.equals(x, primer.x) && Objects.equals(y, primer.y)
                || Objects.equals(x, primer.y) && Objects.equals(y, primer.x);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x + y + x * y);
    }

    @Override
    public String toString() {
        return x + " * " + y;
    }
}
