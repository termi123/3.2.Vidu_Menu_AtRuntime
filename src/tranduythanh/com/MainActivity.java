package tranduythanh.com;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Đối số 1 là nhóm
		//Đối số 2 là Id cho Menu Item
		//Đối số 3 là thứ tự xuất hiện của Menu Item
		//Đối số 4 là tiêu đề cho Menu Item
		int itemId=113;
		menu.add(0, itemId, 0, "Menu 1");
		itemId=114;
		menu.add(0,itemId,1,"Menu 2");
		SubMenu sub3= menu.addSubMenu("Menu 3");
		itemId=115;
		sub3.add(0,itemId,0,"File 1 Menu 3");
		itemId=116;
		sub3.add(0,itemId,1,"File 2 Menu 3");
		itemId=117;
		sub3.add(0,itemId,2,"File 3 Menu 3");
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case 113:
			//Xử lý Menu 1
			break;
		case 114:
			//Xử lý Menu 2 
			break;
		case 115:
			//Xử lý File 1 của Menu 3
			break;
		case 116:
			//Xử lý File 2 của Menu 3
			break;
		case 117:
			//Xử lý File 3 của Menu 3
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
