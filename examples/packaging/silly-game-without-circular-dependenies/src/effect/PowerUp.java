package effect;

/**
 * Created by sebastianblomberg on 27/04/17.
 */
public class PowerUp {
    private HealthAffectable affectedSubject;

    public PowerUp(HealthAffectable affectedSubject) {
        this.affectedSubject = affectedSubject;

        // Increase HP by 25
        affectedSubject.setHealthPoints(affectedSubject.getHealthPoints() + 25);
    }
}
