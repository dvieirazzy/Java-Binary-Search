import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
	
	public static int binarySearch(List<Integer> list, int number) {
		int down = 0;
		int up = list.size() - 1;
		while(down <= up) {
			int mid = (up + down) / 2;
			
			if (list.get(mid) > number) {
				up = mid - 1;
				continue;
			}else if (list.get(mid) < number) {
				down = mid + 1;
				continue;
			}
			return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(10);
		list.add(11);
		list.add(14);
		list.add(15);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		System.out.println(binarySearch(list, 17));
	}
}
