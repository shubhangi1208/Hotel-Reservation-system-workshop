
public class Hotel {
    String hotelName;
    int weekdaysRates;
    int weekendsRates;
    int weekdaysRatesforRewards;
    int weekendsRatesforRewards;
    int startDate;
    int endDate;

    public Hotel(String hotelName, int weekdaysRates, int weekendsRates, int weekdaysRatesforRewards, int weekendsRatesforRewards, int startDate, int endDate) {
        this.hotelName = hotelName;
        this.weekdaysRates = weekdaysRates;
        this.weekendsRates = weekendsRates;
        this.weekdaysRatesforRewards = weekdaysRatesforRewards;
        this.weekendsRatesforRewards = weekendsRatesforRewards;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdaysRates() {
        return weekdaysRates;
    }

    public void setWeekdaysRates(int weekdaysRates) {
        this.weekdaysRates = weekdaysRates;
    }

    public int getWeekendsRates() {
        return weekendsRates;
    }

    public void setWeekendsRates(int weekendsRates) {
        this.weekendsRates = weekendsRates;
    }

    public int getWeekdaysRatesforRewards() {
        return weekdaysRatesforRewards;
    }

    public void setWeekdaysRatesforRewards(int weekdaysRatesforRewards) {
        this.weekdaysRatesforRewards = weekdaysRatesforRewards;
    }

    public int getWeekendsRatesforRewards() {
        return weekendsRatesforRewards;
    }

    public void setWeekendsRatesforRewards(int weekendsRatesforRewards) {
        this.weekendsRatesforRewards = weekendsRatesforRewards;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdaysRates=" + weekdaysRates +
                ", weekendsRates=" + weekendsRates +
                ", weekdaysRatesforRewards=" + weekdaysRatesforRewards +
                ", weekendsRatesforRewards=" + weekendsRatesforRewards +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
