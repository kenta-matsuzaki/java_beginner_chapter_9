public class Main {
  public static void main(String[] args){
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    
    Hero h = new Hero();
    h.name = "健太";
    h.hp = 383;
    h.sword = s;
    System.out.println(h.name + "の現在の武器は" + h.sword.name);
  }
}