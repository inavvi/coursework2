import java.util.ArrayList;

public class Data {
    private String name;
    private ArrayList<DailyPlanner> data;

    public Data (String name){
        this.name=name;
        this.data=new ArrayList<DailyPlanner>(1000);
    }

    public void find(String find) {
        if (getData().toString().contains(find)) {
            System.out.println("Запрос: " +find+" найден в "+getData().toString());
        } else {
            System.out.println("Ничего не найдено!");
        }
    }

    public ArrayList<DailyPlanner> getData() {
        return data;
    }

    public void infoData(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Ежедневник "
                + name +
                ", содержимое: " + data +
                ".";
    }


}
