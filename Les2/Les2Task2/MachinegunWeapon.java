package Les2.Les2Task2;

import Les2.Weapon;

public class MachinegunWeapon extends Weapon{

    @Override
    public String getName() {
        return "AK-47";
    }

    @Override
    public int getDamage() {
        return 45;
    }

    @Override
    public int getFreqency() {
        return 25;
    }

    @Override
    public int getBank() {
        return 100;
    }

    @Override
    public String getVoice() {
        return "tra-ta-ta";
    }
    
}
