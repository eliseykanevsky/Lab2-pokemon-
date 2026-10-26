import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.DamageMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Messages;
import ru.ifmo.se.pokemon.Messages_en;
import ru.ifmo.se.pokemon.Messages_ru_RU;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Main {
    public static void main(java.lang.String[] args) {
        Battle b = new Battle();

        Pokemon thundurus = new Thundurus("Тандурус", 100);
        Pokemon sandshrew = new Sandshrew("Сендскркю", 50);
        Pokemon sandslash = new Sandslash("Сэндслеш", 50);
        Pokemon chimchar = new Chimchar("Чимчар", 20);
        Pokemon monferno = new Monferno("Монферно", 30);
        Pokemon infernape = new Infernape("Инфернейп", 50);

        b.addAlly(thundurus);
        b.addAlly(chimchar);
        b.addAlly(monferno);
        b.addFoe(sandshrew);
        b.addFoe(infernape);
        b.addFoe(sandslash);

        b.go();
    }
}
final class Thundurus extends Pokemon {
    public Thundurus(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC, Type.FLYING);
        setStats(79, 115, 70, 125, 80, 111);
        setMove(new DarkPulse(), new HammerArm(), new ChargeBeam(), new Astonish());
    }
}
final class DarkPulse extends SpecialMove {
    public DarkPulse() {
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.2) {
            Effect.flinch(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Dark Pulse";
    }
}
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
final class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.3) {
            Effect.flinch(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Astonish";
    }
}
class Sandshrew extends Pokemon {
    public Sandshrew(String name, int level) {
        super(name, level);
        setType(Type.GROUND);
        setStats(50, 75, 85, 20, 30, 40);
        setMove(new Swagger(), new FurySwipes(), new SwordsDance());
    }
}
final class Sandslash extends Sandshrew {
    public Sandslash(String name, int level) {
        super(name, level);
        setStats(75, 100, 110, 45, 55, 65);
        addMove(new StoneEdge());
    }
}
final class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        Effect.confuse(target);
        target.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
final class FurySwipes extends PhysicalMove {
    public FurySwipes() {
        super(Type.NORMAL, 18, 80, 0, 1);
    }
    @Override
    protected String describe() {
        return "использует Fury Swipes";
    }
}
final class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon itself) {
        itself.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe() {
        return "использует Swords Dance";
    }
}
final class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }
    @Override
    protected String describe() {
        return "использует Stone Edge";
    }
}
class Chimchar extends Pokemon {
    public Chimchar(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(44, 58, 44, 58, 44, 61);
        setMove(new Flamethrower(), new ShadowClaw());
    }
}
class Monferno extends Chimchar {
    public Monferno(String name,int level ) {
        super(name, level);
        addType(Type.FIGHTING);
        setStats(64, 78, 52, 78, 52, 81);
        addMove(new SlackOff());
    }
}
final class Infernape extends Monferno {
    public Infernape(String name, int level) {
        super(name, level);
        setStats(76, 104, 71, 104, 71, 108);
        addMove(new RockSlide());
    }
}
final class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.1) {
            Effect.burn(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Flamethrower";
    }
}
final class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }
    @Override
    protected String describe() {
        return "использует Shadow Claw";
    }
}
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
final class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon target) {
        if (Math.random() <= 0.3) {
            Effect.flinch(target);
        }
    }
    @Override
    protected String describe() {
        return "использует Rock Slide";
    }
}