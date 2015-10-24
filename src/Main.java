
public class Main {
	static char[] field = new char[9];
	public static void main(String[] args) {
		initializeGameField();
		printField();
		doGameRoutine2();
	}
	private static void setCharToAllFields(char c){
		for (int i = 0; i < field.length; i++) {
			field[i]=c;
		}
	}
	private static void initializeGameField(){
		field[0]='X';field[1]='X';field[2]=' ';
		field[3]=' ';field[4]='X';field[5]='X';
		field[6]=' ';field[7]=' ';field[8]=' ';
	}
	private static void printField(){
		System.out.println("["+field[0]+"] "+"["+field[1]+"] "+"["+field[2]+"]");
		System.out.println("["+field[3]+"] "+"["+field[4]+"] "+"["+field[5]+"]");
		System.out.println("["+field[6]+"] "+"["+field[7]+"] "+"["+field[8]+"]");
		System.out.println("***********");
	}
	public static void doGameRoutine1(){
		for (int position  = 0; position  < field.length; position ++) {
			int amountOfNeighbours = countNeighbours(position);
			changeField(position,amountOfNeighbours);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printField();
		}
	}
	public static void doGameRoutine2(){
		while(true){
			doGameRoutine1();
		}
	}
	private static void changeField(int position,int amountOfNeighbours){
		//TODO
		if(amountOfNeighbours<2){
			field[position]='X';
		}else if(amountOfNeighbours==2||amountOfNeighbours==3){
			;
		}else if(amountOfNeighbours>3){
			field[position]=' ';
		}
	}
	private static int countNeighbours(int position) {

		int counter = 0;
		if(position == 0){
			if(field[1]=='X')
				counter++;
			if(field[3]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
		}else if(position == 1){
			if(field[0]=='X')
				counter++;
			if(field[2]=='X')
				counter++;
			if(field[3]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
			if(field[5]=='X')
				counter++;
		}else if(position == 2){
			if(field[1]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
			if(field[5]=='X')
				counter++;
		}else if(position == 3){
			if(field[0]=='X')
				counter++;
				if(field[1]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
			if(field[6]=='X')
				counter++;
			if(field[7]=='X')
				counter++;
		}else if(position == 4){
			for (int i = 0; i < field.length; i++) {
				if(i==4){
					;
				}else if(field[i]=='X'){
					counter++;
				}
			}
		}else if(position == 5){

			if(field[1]=='X')
				counter++;
			if(field[2]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
			if(field[7]=='X')
				counter++;
			if(field[8]=='X')
				counter++;
		}else if(position == 6){
			if(field[3]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
			if(field[7]=='X')
				counter++;
		}else if(position == 7){

			if(field[3]=='X')
				counter++;
			if(field[4]=='X')
				counter++;
			if(field[5]=='X')
				counter++;
			if(field[6]=='X')
				counter++;
			if(field[8]=='X')
				counter++;
		}else if(position == 8){
			if(field[4]=='X')
				counter++;
			if(field[5]=='X')
				counter++;
			if(field[7]=='X')
				counter++;
		}
		return counter;
	}
}
