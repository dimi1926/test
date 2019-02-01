package fr.test;

public class MaxHeight {

	public static int findMaxHeight(final ITabChecker tab) {

		int height = tab.getHeight();
		int width = tab.getWidth();
		int maxHeight = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (tab.isCheckedCell(i, j)) {
					maxHeight=i+1;
				}				
			}
		}
		return maxHeight;
	}

	public static void main(String[] args) {
		
		final ITabChecker testTab = new TabChecker(6, 4,
			new boolean[][] { new boolean[] { false, false, true, true, true, true },
				new boolean[] { false, false, true, true, true, false },
				new boolean[] { false, false, true, true, false, false },
				new boolean[] { false, false, true, false, false, false } });
		System.out.println(testTab.getHeight());
		
		final int maxHeight = MaxHeight.findMaxHeight(testTab);
		System.out.println("Hauteur max : " + maxHeight);

	}

}
