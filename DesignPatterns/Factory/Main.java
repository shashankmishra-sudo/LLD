package DesignPatterns.Factory;

import DesignPatterns.Factory.componnents.Button.Button;
import DesignPatterns.Factory.componnents.Dropdown.DropDown;
import DesignPatterns.Factory.componnents.Menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter=new Flutter(SupportedPlateform.IOS);
        UIFactory uiFactory=flutter.createUIFactory();
        Menu menu=uiFactory.createMenu();
        Button button=uiFactory.CreateButton();
        DropDown dropDown=uiFactory.CreateDropdown();
    }
}
