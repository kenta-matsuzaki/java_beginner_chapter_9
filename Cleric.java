import java.util.Random;

public class Cleric {
  String name;
  int hp;
  int mp;
  static final int MAX_HP = 50;
  static final int MAX_MP = 10;

  public Cleric(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public Cleric(String name, int hp){
    this(name, hp, Cleric.MAX_MP);
  }

  public Cleric(String name){
    this(name, Cleric.MAX_HP, Cleric.MAX_MP);
  }

  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "はセルフエイドを唱えた！");
    System.out.println(this.name + "のHPが最大まで回復した！");
  }

  public int pray(int sec){
    System.out.println(this.name + "は" + sec + "秒、天に祈った！");

    int recover = new Random().nextInt(3) + sec;

    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}