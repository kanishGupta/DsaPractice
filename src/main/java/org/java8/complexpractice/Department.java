package org.java8.complexpractice;

public class Department {
    private int dId;
    private String dName;

    public Department(int dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                '}';
    }
}
