public class Main {
  public static void main(String[] args){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    
    Hero h1 = new Hero("健太");
    h1.sword = s;

    Hero h2 = new Hero("松崎");

    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 88;
    
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
    
    System.out.println(h1.name + "の現在の武器は" + h1.sword.name);
  }
}