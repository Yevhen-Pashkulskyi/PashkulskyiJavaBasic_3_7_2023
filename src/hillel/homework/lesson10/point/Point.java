package hillel.homework.lesson10.point;

// TODO: 22.07.2023 Створит клас Point - точка на площині. Будемо вважати, що координати цілі значення щоб не ускладнювати задачу. Передбачити наступний функціонал:
//змінити або отримати поточні координати;
//розрахувати відстань до іншої точки;
//розрахувати відстань між двома точками;
//додати можливість порівнювати дві точки - точки вважаються рівними, якщо їх координати співпадають;
//перевизначити метод toString();
//додати можливість створювати копію обʼєкту (через метод clone та конструктор копіювання)
//Застосувати знання по ООП та класу Object. Уникати дублювання коду. 
public class Point implements Interfaceable {
    public int getAbscissa() {
        return abscissa;
    }

    public int getyAxis() {
        return yAxis;
    }

    private int abscissa;
    private int yAxis;
    private String point;
    private int distance;

    public Point(int abscissa, int yAxis) {
        this.abscissa = abscissa;
        this.yAxis = yAxis;
    }

    @Override
    public String test(int abscissa, int yAxis) {
        int result = abscissa + yAxis;
        return "point " + result;
    }

    public void String() {
        System.out.println(test(abscissa, yAxis));
        ;
    }
}
