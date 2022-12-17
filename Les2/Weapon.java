package Les2;

public abstract class Weapon {

    public abstract String getName();
    public abstract int getDamage();
    public abstract int getFreqency();
    public abstract int getBank();
    public abstract String getVoice();
    public void getFire(){
        System.out.println(getVoice());
    };

    }



