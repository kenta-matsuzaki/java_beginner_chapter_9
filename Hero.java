public class Hero {
  int hp;
  String name;
  static int money;

  Hero(String name){
    this.hp = 100;
    this.name = name;
  }

  Hero(){
    this("ダミー");
  }

  Sword sword;
  void attack(){
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージを与えた！");
  }

  static void setRandomMoney(){
    Hero.money = (int)(Math.random() * 1000);
  }

}