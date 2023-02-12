import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DataB {

    private String name;

    private static Map<IdB, DailyPlannerB> data = new HashMap<>();

    public DataB (String name){
        this.name=name;
    }

    public void addTask(IdB idB, DailyPlannerB dailyPlannerB) {
        this.data.put(idB,dailyPlannerB);
    }

    public void infoData(){
        System.out.println(toString());
    }

    public void find(IdB idB) {
        System.out.println(DataB.getData().get(idB));
    }

    public static Map<IdB, DailyPlannerB> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Ежедневник "
                + name +
                ", содержимое: " + data +
                ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataB dataB = (DataB) o;
        return Objects.equals(name, dataB.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
