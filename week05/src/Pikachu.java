public class Pikachu extends Pokemon{
    public Pikachu(Flyable f) {
        System.out.println("피카피카!");
        this.level = 1;
//        this.attackRate = 55;
        this.attackRate = (int)(Math.random() * 6) + 50; // 50 ~ 55
        this.defenceRate =40;
        this.setHp(35);
        this.name = "피카츄";
        //this.flyable = new NoFly();  // Association, Has-a (Composition)
        this.flyable = f;
        this.skills = new String[] {"전기쇼크", "전광석화", "10만볼트"};
        this.specialAttackRate = new int[] {40, 40, 90};
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 전기 장판 공격을 시전합니다");
    }
// 부모클래스의 정적 메서드 getPokemonCount가 override된게 아니라
// Pikachu 클래스의 자체 정적 메서드가 선언된 것
//    public static int getPokemonCount() {
//        return 7;
//    }

    public void type(){
        System.out.println(this.name +  " 전기 속성!");
    }
}