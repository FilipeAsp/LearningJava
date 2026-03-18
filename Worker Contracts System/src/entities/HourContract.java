package entities;

import java.time.LocalDate;

public class HourContract {

    private Double valuePerHour;
    private LocalDate date;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Double valuePerHour, LocalDate date, Integer hours) {
        this.valuePerHour = valuePerHour;
        this.date = date;
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }   

}
