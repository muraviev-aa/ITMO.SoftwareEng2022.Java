package itmo.lesson3;

import java.util.Date;

public class House {
    private Integer floor;
    private Integer year;
    private String name;

    public House(){

    }

    public House(Integer floor, Integer year, String name) {
        this.floor = floor;
        this.year = year;
        this.name = name;
    }

    public void setDetails(Integer floor, Integer year, String name){
        this.floor = floor;
        this.year = year;
        this.name = name;
    }

    public static House getDetails(){
        Integer floor = 4;
        Integer year = 1964;
        String name = "BadLine";
        return new House(floor, year, name);
    }

    public String toString(){

        return "House{" + "floor=" + floor + ", year=" + year + ", name=" + name + '}';
    }

    public Integer ageHouse(){

        return (2022 - year);
    }
}
