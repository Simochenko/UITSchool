package OOP.Mission_1.Person;

import OOP.Service.Filter;
import OOP.Service.MainService;
import OOP.Service.SimpleTime;

public class Phone extends Person{
    public long creditCardNumber;
    public int credit;
    public int debit;
    public SimpleTime speakingTime;
    public SimpleTime intercitySpeakingTime;

    Phone (Person person){
        super(person);
    }

    public void setPhoneSettings(long creditCardNumber, int debit, int credit,
                                 SimpleTime speakingTime, SimpleTime intercitySpeakingTime){
        this.creditCardNumber = creditCardNumber;
        this.credit = credit;
        this.debit = debit;
        this.speakingTime = speakingTime;
        this.intercitySpeakingTime = intercitySpeakingTime;
    }

    public String getPhoneSettings(){
        return "Credit card number : " + this.creditCardNumber +"\nCredit : " +
                this.credit + ", debit : " + this.debit + "\nSpeaking time : " +
                this.speakingTime + "\nIntercity speaking time : " +
                this.intercitySpeakingTime + "\n";
    }

    @Override
    public String toString(){
        return "Phone : " + super.toString() + getPhoneSettings();
    }

    public void filterApply(Filter filter){
        switch (filter.mode){
            case 'i':
                if (MainService.simpleTimeCompare(this.intercitySpeakingTime,
                        new SimpleTime(0, 0, 0), '>')){
                    System.out.println(this.toString());
                }
                break;
            case 'l':
                if (MainService.simpleTimeCompare(this.speakingTime, filter.speakingTime, '>')){
                    System.out.println(this.toString());
                }
        }
    }
}
