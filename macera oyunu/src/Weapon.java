public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon( int id,String name, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList=new Weapon[3];
        weaponList[0] =new Weapon(1,"Tabanca",3,20);
        weaponList[1] =new Weapon(2,"Kılıç",2,10);
        weaponList[2] =new Weapon(3,"Tüfek",5,30);
        return  weaponList;
    }

    public  static  Weapon getWeaponObjById(int id){
        for (Weapon w:Weapon.weapons()){
            if(w.getId()==id){
                return  w;
            }
        }
        return null;
    }
}
