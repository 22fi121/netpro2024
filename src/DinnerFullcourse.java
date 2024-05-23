public class DinnerFullcourse {
    private Dish[] list = new Dish[5];// [0]-[4]の計5個

	public static void main(String[] args) {

		DinnerFullcourse fullcourse = new DinnerFullcourse();
		fullcourse.eatAll();
	}

	DinnerFullcourse() {
		list[0] = new Dish();
		list[0].setName("BBコーン");
		list[0].setValune(35);

		list[1] = new Dish();
		list[1].setName("センチュリースープ");
		list[1].setValune(60);

		list[2] = new Dish();
		list[2].setName("エア");
		list[2].setValune(6300);

		list[3] = new Dish();
		list[3].setName("GOD");
		list[3].setValune(10000);

		list[4] = new Dish();
		list[4].setName("エンドマンモス");
		list[4].setValune(1200);

	}

    public void eatAll(){
        for(int i = 0; i<list.length; i++){
			int value = list[i].getValune();
			String menu = list[i].getName();
			System.out.println("料理名は、" + menu);
			System.out.println("お値段は、" + value + "万円です。");
		}
    }

}
