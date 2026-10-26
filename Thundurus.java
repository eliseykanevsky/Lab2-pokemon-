import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

final class Thundurus extends Pokemon {
    public Thundurus(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.FLYING);
        setStats(79, 115, 70, 125, 80, 111);
        setMove(new DarkPulse(), new HammerArm(), new ChargeBeam(), new Astonish());
    }
}
