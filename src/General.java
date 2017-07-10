import com.practice.*;

import java.io.IOException;


/**
 * Created by andrej on 28.06.17.
 */
public class General {
    public static void main(String[] args) throws IOException {
        System.out.println("Задача о треуголнике");
        Triangles triangles = new Triangles(3, 3, 3);
        triangles.findAnswer();

        System.out.println("задача о корнях квадратного уравнения");
        SqrX sqrX = new SqrX(2, 2, 0);
        sqrX.findDescriminante();

        System.out.println("задача о максимальном числе из 5");
        MaximumNumber maximumNumber = new MaximumNumber(5);
        maximumNumber.findMax();

        System.out.println("сложение матриц");
        AdditionMatrixs additionMatrixs = new AdditionMatrixs();
        additionMatrixs.setSizeMatrix(3);
        additionMatrixs.additionMatrixAandB();

        System.out.println("умножение матриц");
        MatrixMutiplication matrixMutiplication = new MatrixMutiplication();
        matrixMutiplication.setSizeMatrix(2);
        matrixMutiplication.matrixMutiplicationAandB();

        System.out.println("вхождение числа в заданные интервалы");
        Intervals intervals = new Intervals();
        intervals.chekNumber(5);

        System.out.println("Подобие треугольников");
        EqualsTriangle equalsTriangle = new EqualsTriangle(1,2,3,1,2,3);
        equalsTriangle.checkEqTr();

        System.out.println("SOS");
        SosShip [] staff = new SosShip[3];
        staff[0] = new SosShip(1,1);
        staff[1] = new SosShip(6,3);
        staff[2] = new SosShip(4,-2);

        double[] result = new double[staff.length];
        for (int i = 0; i <staff.length ; i++) {
            result[i] = staff[i].getDistanse();
        }
        SosShip sosShip = new SosShip();

        for (int i = 0; i <staff.length ; i++) {
            if(staff[i].getDistanse() == sosShip.getMinStaff(result)){
                System.out.println("Быстрее спасет корабль под номером " + i);

            }
        }

        System.out.println("Box and Circle");
        BoxAndCircle boxAndCircle = new BoxAndCircle(4,5);
        boxAndCircle.getAnswer();

        System.out.println("Mount holidays");
        Holidays holidays = new Holidays(28,4);
        holidays.getHolidays();

        System.out.println("Vector");
        VectorA vectorA = new VectorA(3,3);
        vectorA.getSum();

        System.out.println("Високосный ли год?");
        Year year = new Year(2016);
        year.checkYear();

        System.out.println("Скидка?");
        Price price = new Price(1234);
        price.checkHowMuchMoney();

        System.out.println("Two numbers");
        TwoNumber twoNumber = new TwoNumber(1,0);
        twoNumber.getMaxNumber();

        System.out.println("Четоне/нечетное");
        TwoFourSixAndOther other = new TwoFourSixAndOther(1325);
        other.getAnswer();

        System.out.println("Height and Weight");

        PersonWeight personWeight = new PersonWeight(180,67);
        personWeight.getNormality();

        System.out.println("Month");
        Month month = new Month(01);
        month.getNameMonth();

        System.out.println("Work or Free day");
        WeekDay weekDay = new WeekDay(1);
        weekDay.getWorkDayOrHoliday();


        System.out.println("Ruble");
        Ruble ruble = new Ruble(6500);
        ruble.getEnd();
    }
}
