package practiceTwo;

public class sixthPoint {

    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String fechaAnterior() {
        String date = "";
        setDay(getDay()-1);
        if(getDay() == 0){
            setDay(31);
            setMonth(getMonth() - 1);
        }
         
        
        if (getMonth() == 0) {
            setYear(getYear()-1);
            setMonth(12);
        }
      
        
        date = getDay()  + "/" + getMonth() + "/" + getYear();
        return date;
    }
}
