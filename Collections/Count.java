package Collections;

import java.util.Objects;

public class Count {
    int val;
    String name;

    public Count(int val, String name) {
        this.val = val;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Count)) return false;
        Count count = (Count) o;
        return val == count.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
    public String toString() {
        return "Count{" +
                "val=" + val +
                ", name='" + name + '\'' +
                '}';
    }
}
