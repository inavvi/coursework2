public class Scanner {
    public static void main(String[] args) {

        Data isi = new Data("Иванов Сергей Иванович");
        DataB isib = new DataB("Иванов Сергей Иванович");

        Id numbers = new Id ("Цифры");
        IdB d1 = new IdB ("202302151700");
        IdB d2 = new IdB ("202302161100");
        IdB d3 = new IdB ("202302161500");
        IdB d4 = new IdB ("202302171100");
        IdB d5 = new IdB ("202302171700");
        IdB d6 = new IdB ("202302180700");
        IdB d7 = new IdB ("202302181900");
        IdB d8 = new IdB ("202302201000");


        DailyPlanner b1 = new DailyPlanner(numbers,2023021517, "встреча с заказчиком", "РАБОТА",1);
        DailyPlanner b2 = new DailyPlanner(numbers,2023021611, "совещание с отделом закупок", "РАБОТА",1);
        DailyPlanner b3 = new DailyPlanner(numbers,2023021615, "позвонить Виктору Петровичу", "РАБОТА",1);
        DailyPlanner b4 = new DailyPlanner(numbers,2023021711, "еженедельное совещание", "РАБОТА",7);
        DailyPlanner b5 = new DailyPlanner(numbers,2023021717, "сдать ежемесячный отчёт", "РАБОТА",30);
        DailyPlanner l1 = new DailyPlanner(numbers,2023021807, "гимнастика", "ЛИЧНОЕ",1);
        DailyPlanner l2 = new DailyPlanner(numbers,2023021819, "спектакль в театре", "ЛИЧНОЕ",0);
        DailyPlanner l3 = new DailyPlanner(numbers,2023022010, "пройти диспансеризацию", "ЛИЧНОЕ",365);

        DailyPlannerB b1b = new DailyPlannerB(numbers, "встреча с заказчиком", "РАБОТА","1");
        DailyPlannerB b2b = new DailyPlannerB(numbers, "совещание с отделом закупок", "РАБОТА","1");
        DailyPlannerB b3b = new DailyPlannerB(numbers, "позвонить Виктору Петровичу", "РАБОТА","1");
        DailyPlannerB b4b = new DailyPlannerB(numbers, "еженедельное совещание", "РАБОТА","7");
        DailyPlannerB b5b = new DailyPlannerB(numbers, "сдать ежемесячный отчёт", "РАБОТА","30");
        DailyPlannerB l1b = new DailyPlannerB(numbers, "гимнастика", "ЛИЧНОЕ","1");
        DailyPlannerB l2b = new DailyPlannerB(numbers,"спектакль в театре", "ЛИЧНОЕ","0");
        DailyPlannerB l3b = new DailyPlannerB(numbers, "пройти диспансеризацию", "ЛИЧНОЕ","365");

        isi.getData().add(b1);
        isi.getData().add(b2);
        isi.getData().add(b3);
        isi.getData().add(b4);
        isi.getData().add(b5);
        isi.getData().add(l1);
        isi.getData().add(l2);
        isi.getData().add(l3);

        isib.addTask(d1,b1b);
        isib.addTask(d2,b2b);
        isib.addTask(d3,b3b);
        isib.addTask(d4,b4b);
        isib.addTask(d5,b5b);
        isib.addTask(d6,l1b);
        isib.addTask(d7,l2b);
        isib.addTask(d8,l3b);

        isi.infoData();
        isib.infoData();

        isi.find("20230216");
        isib.find(d4);
        isib.find(d7);

        b1.dailyTask();
        b4.dailyTask();
        b2.dailyTask();

    }
}
