package com.test;

public class Passport {

    private String series;
    private Integer number;

    public Passport(String series, Integer number) {

        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((series == null) ? 0 : series.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Passport other = (Passport) obj;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        if (series == null) {
            if (other.series != null)
                return false;
        } else if (!series.equals(other.series))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Passport [series=" + series + ", number=" + number + "]";
    }

}

