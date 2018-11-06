public class Date {
    private int day;
    private int month;
    private int year;

    private void validate(int day, int month, int year) throws InvalidDate {
        int daysInMonthes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) daysInMonthes[1] = 29;
        if (day <= 0 || day > daysInMonthes[month - 1]) throw new InvalidDate("tytytytty");
        if (month <= 0 || month > 12) throw new InvalidDate("Invalid month number.");
        if (year < 1900) throw new InvalidDate("Invalid year.");
    }

    public Date(int day, int month, int year) throws InvalidDate {

        this.validate(day, month, year);

        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println("Date is created");
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public String toString () {
        return "Date { day: " + this.day + ", month: " + this.month + ", year: " + this.year + " }";
    }

}
