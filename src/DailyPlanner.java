import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyPlanner implements Interface  {

    private int idDp;
    private String dateCreation;
    private int taskDate;
    private String task;
    private String type;
    private int repeatType;

    public DailyPlanner(Id id, int taskDate, String task, String type,int repeatType) {
        int ida=id.getId()+1;
        id.setId(ida);
        this.idDp=ida;
        int y = LocalDateTime.now().getYear();
        int m = LocalDateTime.now().getMonthValue();
        int d = LocalDateTime.now().getDayOfMonth();
        int h = LocalDateTime.now().getHour();
        int min = LocalDateTime.now().getMinute();
        this.dateCreation= String.valueOf(y) +"." + String.valueOf(m)+"." + String.valueOf(d)+" "+ String.valueOf(h)+":" + String.valueOf(min);//LocalDateTime.now().getYear();//LocalDateTime.now().getYear();//LocalDateTime.now().getDayOfYear(); //+ LocalDateTime.now().getYear()+ LocalDateTime.now().getDayOfMonth(); // +++++;
        this.taskDate=taskDate;
        this.task=task;
        this.type=type;
        this.repeatType=repeatType;
    }

    public void dailyTask() {
        if(getRepeatType()==1) {
           int newDate=getTaskDate()+100;
           setTaskDate(newDate);
           System.out.println(toString());
        } else {
           System.out.println("Ошибка! Эта задача не ежедневная.");}
    }

   public int getIdDp() {
       return idDp;
   }

    public int getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(int taskDate) {
        this.taskDate = taskDate;
    }

    public String getTask() {
        return task;
    }

    public String getType() {
        return type;
    }

    public int getRepeatType() {
        return repeatType;
    }

    @Override
    public String toString() {
        return "Дело: " +
                "ID " + idDp +
                " " + dateCreation +
                " " + type +
                " " + task +
                ", когда " + taskDate +
                ", периодичность: " + repeatType + ".";
    }

}
