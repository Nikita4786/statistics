package ru.netology.stats;

public class StatsService {
    public int SumSales(int[] sales) {
        int sum = 0; //выручка за первый месяц
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i]; //суммы всех месяцев суммируются
        }
        return sum; //выводим итоговую сумму
    }


    public int averageAmount(int[] sales) {
        int result = SumSales(sales) / sales.length; // итоговая сумма / на колличество выручек
        return result; // выводим среднюю сумму продаж за период
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // выручка за первыймесяц для начала поиска максимальной выручки
        for (int i = 0; i < sales.length; i++) { //в рассматриваемом месяце выручка больше
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // месяц нумеруется с 1, а индекс с 0. Нужно сдвинуть ответ по индексу на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // выручка за первыймесяц для начала поиска минимальной выручки
        for (int i = 0; i < sales.length; i++) { //в рассматриваемом месяце выручка меньше
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthMin(int[] sales) {
        int avarage = averageAmount(sales);
        int counthMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avarage) {
                counthMonth++;
            }
        }
        return counthMonth;
    }

    public int countMonthMax(int[] sales) {
        int average = averageAmount(sales);
        int counthMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                counthMonth++;
            }
        }
        return counthMonth;
    }


}

