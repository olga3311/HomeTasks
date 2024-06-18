package HometaskTwentyEight;

import java.util.Objects;

public class Deposit implements Comparable<Deposit> {
    private  int amount;
    private  int percent;
    private int years;
    private int profit;
    private int mediumProfit;

    public Deposit(int amount, int percent, int years) {
        this.amount = amount;
        this.percent = percent;
        this.years = years;
        this.totalProfit();
    }

    public void totalProfit(){
        int tempAmount = amount;
        for (int i = 0; i < years; i++) {
           tempAmount = tempAmount +((tempAmount *  percent) / 100);
        }
        profit = tempAmount - amount;
        mediumProfit = profit / years;
    }



    @Override
    public int compareTo(Deposit o) {
       return profit - o.profit;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount = " + amount +
                ", percent = " + percent +
                ", years = " + years +
                ", total profit = " + profit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return amount == deposit.amount &&
                percent == deposit.percent &&
                years == deposit.years &&
                profit == deposit.profit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, percent, years, profit);
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public int getPercent() {

        return percent;
    }

    public void setPercent(int percent) {

        this.percent = percent;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {

        this.years = years;
    }

    public int getProfit() {
        return profit;
    }

    public int getMediumProfit() {
        return mediumProfit;
    }
}
