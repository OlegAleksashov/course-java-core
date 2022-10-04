package com.rakovets.course.java.core.practice.oop_classes_and_objects;

/**
 * Создать class Atm описывающий банкомат.
 * Создать Fields:
 * numberBanknotes20
 * numberBanknotes50
 * numberBanknotes100
 * Создать Constructors:
 * Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100)
 * Создать Methods:
 * addBanknotes20(number)
 * addBanknotes50(number)
 * addBanknotes100(number)
 * Создать Methods:
 * isPossibleIssue(amount) - проверяет, возможно ли выдать сумму, которую запросил клиент
 * getOptionsCombinationBanknotes(amount) - возвращает все возможные варианты для суммы выдаваемых купюр
 * getCash(option) - выдает деньги клиенту, для выбранного им варианта
 */
public class Atm {
    public int numberBanknotes20;
    public int numberBanknotes50;
    public int numberBanknotes100;

    public Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100) {
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }

    public boolean isPossibleIssue(int amount) {
        boolean isThereSuchAnAmount = false;
        final int amountBanknotes20 = 20;
        final int amountBanknotes50 = 50;
        final int amountBanknotes100 = 100;
        int sumAtTheAtm = numberBanknotes20 * amountBanknotes20 + numberBanknotes50 * amountBanknotes50 + numberBanknotes100 * amountBanknotes100;
        if (sumAtTheAtm >= amount) {
            isThereSuchAnAmount = true;
        }
        return isThereSuchAnAmount;
    }

    public void addBanknotes20(int number) {
        numberBanknotes20 += number;
    }

    public void addBanknotes50(int number) {
        numberBanknotes50 += number;
    }

    public void addBanknotes100(int number) {
        numberBanknotes100 += number;
    }
}
