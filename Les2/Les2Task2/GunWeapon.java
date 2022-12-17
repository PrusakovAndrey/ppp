package Les2.Les2Task2;

import Les2.Weapon;

public class GunWeapon extends Weapon{

    @Override
    public String getName() {
        return "Makarov";
    }
    @Override
    public int getDamage() {
        return 10;
    }
    @Override
    public int getFreqency() {
        return 30;
    }
    @Override
    public int getBank() {
        return 12;
    }
    @Override
    public String getVoice() {
        return "Pif-paf";
    }
}
