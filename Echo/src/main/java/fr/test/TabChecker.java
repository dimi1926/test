package fr.test;

public class TabChecker implements ITabChecker {
	int row;
	int colonne;
	boolean[][] bool;

//new boolean[] { false, false, false, false, false, false };
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public boolean[][] getBool() {
		return bool;
	}

	public void setBool(boolean[][] bool) {
		this.bool = bool;
	}

	public TabChecker(int colonne, int row, boolean[][] bool) {
		super();
		this.row = row;
		this.colonne = colonne;
		this.bool = bool;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return colonne;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return row;
	}

public boolean isCheckedCell(int x, int y) {
	boolean isChecked = false;	
			if (bool[x][y]== true) {
				isChecked=true;
			} else {
				isChecked=false;
			}
			return isChecked;
			}


}