package practiceTwo;

public class eightPoint {

    private int iniDay;
    private int day;

    public int getIniDay() {
        return iniDay;
    }

    public void setIniDay(int iniDay) {
        this.iniDay = iniDay;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
     public String printDay(int iniDay){
        String dia = "";
        if(getDay() > 7 && getDay() <= 14){
            setDay(day - 7); 
        }
        
         if(getDay() >= 14 & getDay() <= 21){
            setDay(day - 14); 
        }
         
          if(getDay() >= 21 && getDay() <= 28){
            setDay(day - 21); 
        }
          
          if(getDay() >= 28 && getDay() <= 31){
            setDay(day - 28); 
        }
        switch(getDay()){
            case 1:
                dia = "Monday";
                break;
            case 2:
                dia = "Tuesday";
                break;
            case 3:
                dia = "Wednesday";
                break;
            case 4: 
                dia = "Tuesday";
                break;
            case 5:
                dia = "Friday";
                break;
            case 6:
                dia = "Saturday";
                break;
            case 7:
                dia = "Sunday";
                break;
        }
        return dia;
    }
}
