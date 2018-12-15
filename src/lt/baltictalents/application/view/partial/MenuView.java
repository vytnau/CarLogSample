package lt.baltictalents.application.view.partial;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class MenuView extends Menu {
//	private final MenuHandler handler;
	private TabPane tabPaneToAddTo;
	private Tab[] tabs;

	public MenuView() {
		//super("Tabs");
		initMenu();
	}

	protected void initMenu() {

//		tabPaneToAddTo = tabPane;
//		tabs = tabPane.getTabs().toArray(new Tab[tabPane.getTabs().size()]);
//
//		handler = new MenuHandler(tabs);
//
//		for (int i = 0; i < tabs.length; i++) {
//			MenuItem tmp = new MenuItem(tabs[i].getText());
//			tmp.setOnAction(handler);
//			super.getItems().add(tmp);
//		}
//		tabPaneToAddTo.getTabs().remove(3, 5);
	}

}
