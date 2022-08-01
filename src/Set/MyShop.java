package Set;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyShop {

	public static int pCount;

	private static MyShop instance;

	public static ArrayList<Shop> buylist = new ArrayList<>();

	public static MyShop getMyShop() {
		if (instance == null) {
			instance = new MyShop();
		}
		return instance;
	}

	public static void add(Shop s) {

		if (pCount > 5) {
			JOptionPane.showMessageDialog(null, "��ٱ��� �ִ� ��ǰ������ �ʰ��߽��ϴ�.");
			pCount--;
		} else {
			if (buylist.size() == 0) {
				buylist.add(s);
				JOptionPane.showMessageDialog(null, s.getName() + " ��(��) ��ٱ��Ͽ� ��ҽ��ϴ�.");
			} else if(buylist.size() == 1){
				if (s.name.equals(buylist.get(0).getName())) {
					JOptionPane.showMessageDialog(null, "�̹� ��ٱ��Ͽ� �ִ� ��ǰ�Դϴ�.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " ��(��) ��ٱ��Ͽ� ��ҽ��ϴ�.");
					}
			} else if(buylist.size() == 2) {
				if (s.name.equals(buylist.get(0).getName()) || s.name.equals(buylist.get(1).getName())) {
					JOptionPane.showMessageDialog(null, "�̹� ��ٱ��Ͽ� �ִ� ��ǰ�Դϴ�.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " ��(��) ��ٱ��Ͽ� ��ҽ��ϴ�.");
				}
			} else if(buylist.size() == 3) {
				if (s.name.equals(buylist.get(0).getName()) || s.name.equals(buylist.get(1).getName())
						|| s.name.equals(buylist.get(2).getName())) {
					JOptionPane.showMessageDialog(null, "�̹� ��ٱ��Ͽ� �ִ� ��ǰ�Դϴ�.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " ��(��) ��ٱ��Ͽ� ��ҽ��ϴ�.");
				}
			} else if(buylist.size() == 4) {
				if (s.name.equals(buylist.get(1).getName()) || s.name.equals(buylist.get(1).getName())
						|| s.name.equals(buylist.get(2).getName()) || s.name.equals(buylist.get(3).getName())) {
					JOptionPane.showMessageDialog(null, "�̹� ��ٱ��Ͽ� �ִ� ��ǰ�Դϴ�.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " ��(��) ��ٱ��Ͽ� ��ҽ��ϴ�.");
				}
			}
		}
	}

	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null, "��ٱ��ϸ� ������ϴ�.");
	}
	
}
