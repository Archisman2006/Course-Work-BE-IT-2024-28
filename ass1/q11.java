package ass1;

class Date{
    int day,month,year;
    Date(){day=1; month=1; year=1970;}
    Date(int day){this.day=day; month=1; year=1970;}
    Date(int day,int month){this.day=day; this.month=month; year=1970;}
    Date(int day,int month,int year){this.day=day; this.month=month; this.year=year;}
    Date getPrevDay(){
        int new_month=month,new_year=year;
        int new_day=(day-1); if(new_day==0) {new_day=30; new_month=month-1;}
        if(new_month==0) {new_month=12; new_year=year-1;}
        return new Date(new_day,new_month,new_year);
    }
    Date getNextDay(){
        int new_month=month,new_year=year;
        int new_day=(day+1); if(new_day==31) {new_day=1; new_month=month+1;}
        if(new_month==13) {new_month=1; new_year=year+1;}
        return new Date(new_day,new_month,new_year);
    }
    void PrintDay(){
        System.out.println(((day<10)?"0":"")+day+"/"+((month<10)?"0":"")+month+"/"+year);
    }
    public static void main(String[] args) {
        Date d1=new Date(30,12,2019);
        d1.getPrevDay().PrintDay();
        d1.getNextDay().PrintDay();
    }
}
// Implement a class for “Date”. Write member functions for (i) getting the previous day, (iv)
// getting the next day, (iii) printing a day
// There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii) day
// is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day,
// month are initialized to user specified value but year is initialized to 1970; (iv) day, month and
// year are initialized to user defined values.
// Also, write a main() function to (i) create a date object; (ii) print the next and the previous day.
