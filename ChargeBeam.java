import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

final class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon itself) {
        if (Math.random() <= 0.7) {
            itself.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }
    @Override
    protected String describe() {
        return "использует Charge Beam";
    }
}
