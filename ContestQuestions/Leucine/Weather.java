package ContestQuestions.Leucine;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    String place;
    Double temperature;
    
    public Weather() {
    }
    public Weather(String place, Double temperature) {
        this.place = place;
        this.temperature = temperature;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public Double getTemperature() {
        return temperature;
    }
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Weather [place=" + place + ", temperature=" + temperature + "]";
    }

    public static void main(String[] args) {
        List<Weather> list = new ArrayList<>();
        list.add(new Weather("Sunny", 32.0));
        list.add(new Weather("Rainy", 17.0));
        list.add(new Weather("cloudy", 23.0));
        list.add(new Weather("cold", 3.0));
        list.add(new Weather("hot", 37.0));
        list.add(new Weather("windy", 13.0));
        list.add(new Weather("snow", 0.0));
        list.add(new Weather("Freez", -15.0));

        // list.stream().map(Weather::getTemperature).sorted().forEach(System.out::println);
        // list.stream().map(Weather::getTemperature).sorted((p1,p2)-> p1.compareTo(p2)).forEach(System.out::println);
        list.stream().sorted((p1,p2)-> p1.getTemperature().compareTo(p2.getTemperature())).forEach(System.out::println);

    }
    
}
