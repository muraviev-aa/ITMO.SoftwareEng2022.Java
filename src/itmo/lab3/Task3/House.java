package itmo.lab3.Task3;

public class House {
    private Integer floor;
    private Integer yearСurrent;
    private Integer yearFound;
    private String name;


    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getYear() {
        return yearСurrent;
    }

    public void setYear(Integer year) {
        this.yearСurrent = year;
    }

    public Integer getYearFound() {
        return yearFound;
    }

    public void setYearFound(Integer yearFound) {
        this.yearFound = yearFound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodPrintHouse() {
        System.out.println(("House{" +
                "floor=" + floor +
                ", yearСurrent " + yearСurrent +
                ", yearFound " + yearFound +
                ", name='" + name + '\'' +
                '}'));
    }

    public void getAgeHouse() {
        System.out.println("Возраст дома: " + (yearСurrent - yearFound));
    }

    public void setHouse(Integer floor, Integer year, Integer yearFound, String name){
        this.floor = floor;
        this.yearСurrent = year;
        this.yearFound = yearFound;
        this.name = name;
    }
}
