package cricket;

public class Twenty {
	int over,ball;
	String player;int score;
	
		public void game(String player ,int over, int ball)
		{
			this.over=over;
			this.ball=ball;
			this.player=player;
		}
		
		public int getOver() {
			return over;
		}

		public int getBall() {
			return ball;
		}

		public String getPlayer() {
			return player;
		}

		public void displaymode()
		{
			System.out.println("Player : "+player);
			System.out.println("over : "+over);
			System.out.println("ball : "+ball);
		}
		public static void main(String[] args) {
				Twenty obj = new Twenty();
				obj.game("Player 1", 20, 5);
				obj.displaymode();
				
				Sachinscore s1=new Sachinscore(12);
				System.out.println("score : "+s1.getScore());
				
			
		}
		
}
