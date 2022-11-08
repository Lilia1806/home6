public class Boss extends GameEntity{
  private Weapon strela;

    public Weapon getStrela() {
        return strela;
    }

    public void setStrela(Weapon strela) {
        this.strela = strela;
    }
    public String prinInfo(){
        return getDamage() + " " + getHealth();
    }

}

