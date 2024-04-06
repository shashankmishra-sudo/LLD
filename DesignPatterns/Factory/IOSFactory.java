package DesignPatterns.Factory;

import DesignPatterns.Factory.componnents.Button.Button;
import DesignPatterns.Factory.componnents.Button.IOSButton;
import DesignPatterns.Factory.componnents.Dropdown.DropDown;
import DesignPatterns.Factory.componnents.Dropdown.IOSDropdown;
import DesignPatterns.Factory.componnents.Menu.IOSMenu;
import DesignPatterns.Factory.componnents.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button CreateButton() {
        return new IOSButton();
    }

    @Override
    public DropDown CreateDropdown() {
        return new IOSDropdown();
    }
}
