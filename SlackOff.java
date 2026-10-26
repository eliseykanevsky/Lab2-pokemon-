import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

final class SlackOff extends StatusMove {
    public SlackOff() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon itself) {
        itself.setMod(Stat.HP, (int) (itself.getHP() + itself.getStat(Stat.HP))/2);
    }
    @Override
    protected String describe() {
        return "использует Slack Off";
    }
}
