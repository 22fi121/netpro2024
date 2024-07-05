public class MainFile {
    public static void main(String args[]){
        SystemFile dice = new SystemFile();
        dice.getSkill(50);
        dice.searchRoll();
        System.out.println("searchCount " + dice.count());
        int beastlife = dice.beastlife();
        int beastDamege = dice.beastDamege();
        int meat = dice.meat();
        System.out.println("獣：体力" + beastlife + "攻撃力" + beastDamege);
        int playerlife = 10;
        int hantei;

        while(beastlife > 0 && playerlife > 0){
            hantei = dice.diceRoll();
            playerlife = dice.damegeRoll(hantei, beastDamege, playerlife);
            System.out.println("自分：残り体力" +   playerlife);
            if(playerlife < 1){
                break;
            }
            hantei = dice.diceRoll();
            beastlife = dice.damegeRoll(hantei, 2, beastlife);
            System.out.println("獣：残り体力" + beastlife);
        }
        if(beastlife < 1){
            System.out.println("獲物を倒した!");
            System.out.println(meat + "個のお肉を手に入れた!");
        }else{
            System.out.println("やられた・・");
        }
        
    }
}
