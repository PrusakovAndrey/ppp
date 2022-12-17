package Les2;

public class RifleWeapon extends Weapon{

    @Override
    public String getName() {
        return "Cowboy";
    }

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public int getFreqency() {
        return 100;
    }

    @Override
    public int getBank() {
        return 6;
    }

    @Override
    public String getVoice() {
        return "Bakh";
    }
    
}
