package Les2.Les2Task2;

import Les2.RifleWeapon;
import Les2.Weapon;

public class Main {
    public static void main(String[] args) {
        GunWeapon pistol1 = new GunWeapon();
        MachinegunWeapon gunMachine1 = new MachinegunWeapon();
        RifleWeapon rifle1 = new RifleWeapon();

        testWapon(pistol1, 100);
        testWapon(gunMachine1, 100);
        testWapon(rifle1, 100);
    }
        int target = 100;

    private static void testWapon(Weapon weapon, int target){
        while(target > 0) {
            weapon.getFire();
            target -= weapon.getDamage();
            System.out.printf("осталось %d единиц из 100 \n", target);
            try {
                Thread.sleep(30000/weapon.getFreqency());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }
}




