class SnakeladderUc3 {
	public static final int NoPlay = 0;
	public static final int Ladder = 1;
	public static final int Snake = 2;
	public static final int Start = 0;
	public static void main(String[] Args) {
		int Position = 0;
		System.out.println("Start Position:" +Start);
		int Roll = (int) (Math.floor(Math.random()*10)%6+1);
		System.out.println("Roll dice Number:" +Roll);
		int Condition = (int) (Math.floor(Math.random()*10)%3);
		System.out.println("Condition Required:" +Condition);
		switch(Condition) {
			case NoPlay:
			System.out.println("New Position:" +Position);
			break;
			case Ladder:
			Position=Position+Roll;
			System.out.println("New Position:" +Position);
			break;
			case Snake:
			Position=Position-Roll;
			if(Position>=0)
			System.out.println("New Position:" +Position);
		    else
			Position = 0;
			System.out.println("New Position:" +Position);
			break;
			default:
		    System.out.println("Default Position");
			break;
			}
		}
	}