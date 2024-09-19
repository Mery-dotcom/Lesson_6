public class Weapon {
    private WeaponType type;
    private String nameOfWeapon;

    public Weapon(WeaponType type, String nameOfWeapon){
        this.type = type;
        this.nameOfWeapon = nameOfWeapon;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}


