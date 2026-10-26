import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

final class HammerArm extends PhysicalMove {
    public HammerArm() {
        super(Type.FIGHTING, 100, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon itself) {
        itself.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "использует Hammer Arm";
    }
}
