package alpha.string;

public class ShortestPath {
	
	public static void main(String[] args) {
		String str = "NSWE";
		float shortestPath = getShortestPath(str);
		System.out.println(shortestPath);
	}

	private static float getShortestPath(String str) {
		int x = 0, y = 0;
		for(int i=0; i<str.length();i++) {
			switch (str.charAt(i)) {
			case 'W':
				x--;
				break;
			case 'E':
				x++;
				break;
			case 'N':
				y++;
				break;
			case 'S':
				y--;
				break;
			default:
				break;
			}
		}
		return (float) Math.sqrt(x*x+y*y);
	}

}
