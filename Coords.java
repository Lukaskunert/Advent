import java.util.Objects;

public class Coords {
    int x, y;

    public Coords(int x, int y) {
        this.x = x;
        this.y = y; }

    public boolean equals(Object b) {
        if (this == b)
            return true;
        if (b == null || getClass() != b.getClass())
            return false;
        Coords coords = (Coords) b;
        return x == coords.x && y == coords.y; }

    public int hashCode() {
        return Objects.hash(x, y);
    }}
