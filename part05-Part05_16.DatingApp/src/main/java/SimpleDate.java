
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(int howManyDays){
        //Does not work as intended
        
        /*this.day+=howManyDays;
        if(this.day>30){
            this.month+=this.day/31;
            this.day %=30;
            if(this.day==0) this.day=30;
            
            if(this.month>12){
                this.year+=this.month/13;
                this.month %=12;
                if(this.month==0) this.month=12;
            }
        }*/
        
        int tDays = this.day + howManyDays;
        
        int month = this.month + (tDays - 1)/ 30;
        this.day = (tDays-1)%30+1;
        
        this.year += (month - 1) / 12;
        this.month = (month -1) % 12 +1;
    }
    public void advance(){
        advance(1);
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate date = new SimpleDate(this.day,this.month,this.year);
        date.advance(days);
        return date;
    }

}
