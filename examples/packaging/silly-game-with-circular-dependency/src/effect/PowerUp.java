package effect;

import character.Player;

/**
 * Created by sebastianblomberg on 27/04/17.
 */
public class PowerUp {
    private Player affectedPlayer;

    public PowerUp(Player affectedPlayer) {
        this.affectedPlayer = affectedPlayer;

        // Increase HP by 25
        affectedPlayer.setHealthPoints(affectedPlayer.getHealthPoints() + 25);
    }
}
