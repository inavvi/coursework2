import java.time.LocalDateTime;

public class DailyPlannerB {

    private int idDp;
    private String taskDate;
    private String task;
    private String type;
    private String repeatType;

    public DailyPlannerB(Id id, String task, String type,String repeatType) {
      int ida=id.getId()+1;
      id.setId(ida);
      this.idDp=ida;
      this.task=task;
      this.type=type;
      this.repeatType=repeatType;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Дело: " +
                "ID " + idDp +
                " " + type +
                " " + task +
                ", периодичность: " + repeatType + ".";
    }

}
