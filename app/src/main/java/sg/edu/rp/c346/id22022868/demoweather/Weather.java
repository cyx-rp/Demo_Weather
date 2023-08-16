package sg.edu.rp.c346.id22022868.demoweather;

public class Weather {

    private String area;
    private String forecast;

    //constructor
    public Weather(String area, String forecast) {
        this.area = area;
        this.forecast = forecast;
    }

    //getter
    public String getArea() {
        return area;
    }

    public String getForecast() {
        return forecast;
    }

    //setter
    public void setArea(String area) {
        this.area = area;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "area='" + area + '\'' +
                ", forecast='" + forecast + '\'' +
                '}';
    }
}
