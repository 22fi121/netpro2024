import java.util.Random;

public class SystemFile {
    private int skill;
    private int dice;
    private int count;
    Random random = new Random();
    public int setSkill(){
        return skill;
    }

    public void getSkill(int skill){
        this.skill = skill;
    }

    public int diceRoll(){
        dice = random.nextInt(99) + 1;
        System.out.println("ダイスロール!");
        System.out.println(dice + "!");
        if(dice <= skill){
            if(dice <= 5){
                System.out.println("大成功!");
                return 2;
            }
            else{
                System.out.println("成功!");
                return 1;
            }
        }else{
            if(dice >= 96){
                System.out.println("大失敗・・");
                return -2;
            }
            System.out.println("失敗・・");
            return -1;
        }
    }

    public int damegeRoll(int hantei, int damege, int life){
        if(hantei >= 0){
            if(hantei > 1){
                damege += 1;
            }
            life -= damege;
            System.out.println(damege + "ダメージを与えた!");
            return life;
        }else{
            return life;
        }
    }

    public void searchRoll(){
        count = 0;
        int i = 1;
        dice = random.nextInt(5) + 1;
        while(i < 5){
            if(random.nextInt(5) + 1 >= dice){
                count++;
            }
            i++;
        }
    }

    public int count(){
        return count;
    }

    public int beastlife(){
        if(count == 0){
            return 2;
        }else if(count == 1){
            return 4;
        }else if(count == 2){
            return 6;
        }else if(count == 3){
            return 8;
        }else{
            return 10;
        }
    }

    public int beastDamege(){
        if(count <= 1){
            return 1;
        }else if(count <= 3){
            return 2;
        }else{
            return 3;
        }
    }

    public int meat(){
        if(count <= 1){
            return 1;
        }else if(count == 2){
            return 2;
        }else if(count == 3){
            return 3;
        }else{
            return 4;
        }
    }
}
