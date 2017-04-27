package character;

import effect.HealthAffectable;
import effect.PowerDown;
import effect.PowerUp;
import gear.Weapon;

import java.util.List;

/**
 * Created by sebastianblomberg on 27/04/17.
 */
public class Player extends Character implements HealthAffectable {
    private List<PowerUp> activePowerUps;
    private List<PowerDown> getActivePowerDowns;

    private Weapon primaryWeapon;
    private Weapon secondaryWeapon;
    
    /*
     ... rest of implementation here ....

     */
}
